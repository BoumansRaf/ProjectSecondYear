/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icursistenproto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.*;
import org.apache.http.conn.*;
import org.apache.http.auth.*;
import org.apache.http.cookie.*;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import static org.apache.http.client.methods.RequestBuilder.post;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.DefaultBHttpClientConnection;
import org.apache.http.impl.client.DefaultHttpClient;



/**
 *
 * @author Raf
 */
public class GetAllStudent {
  
        
                HttpClient client = new DefaultHttpClient();
                String endpoint = "testservices.informatsoftware.be/icursisten";
                String version = "1";
                String resource = "student";
                String JSON_STRING= "";
                HttpPost post = new HttpPost("https://" +  endpoint + "/" + version + "/" + resource);
                StringEntity requestEntity = new StringEntity(
                JSON_STRING,ContentType.APPLICATION_JSON);
                post.setEntity(requestEntity);
                
                

                HttpResponse response = client.execute(post);
                
                
        }

