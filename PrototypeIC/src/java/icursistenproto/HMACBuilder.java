/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icursistenproto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Raf
 */
public class HMACBuilder {
    
    public String buildHMAC(String verb, String dateTime, String url, String instellingsNr) throws NoSuchAlgorithmException, FileNotFoundException{
        String hmacString = "verb=" + verb + "&timestamp=" + dateTime + "&url=" + url + "&instellingsnr=" + instellingsNr;
        final Mac hmac = Mac.getInstance("HmacSHA256");
        final Charset ascii = Charset.forName("UTF-8");
        BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Raf\\Documents\\Project\\keys\\private.txt"));
        
        final SecretKeySpec secret_key = new javax.crypto.spec.SecretKeySpec(ascii.encode("key").array(), "HmacSHA256");
        final byte[] mac_data = hmac.doFinal(ascii.encode(hmacString).array());
        String result = "";
        for (final byte element : mac_data)
        {
           result += Integer.toString((element & 0xff) + 0x100, 16).substring(1);
        }
        return result;

    }
    
}
