package com.example.sprinjp.DBInteraction.Hmac;

import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.TimeZone;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

public class HmacSignature {
	
	private static final String SECRET_KEY = "your-secret-key"; // Store this securely
    private static final String HMAC_ALGO = "HmacSHA256";
    
    public static String generateHMACSignature(String requestBody) throws Exception {
        // Step 1: Convert request body to SHA-256 hash
    	String hash;
         hash = DigestUtils.sha256Hex(requestBody);
        System.out.println(hash);
        
        // Step 2: Base64 encode the SHA-256 hash and prepend "SHA-256"
        String ad="SHA-256="+hash;
        
        System.out.println(ad);
       
        // Step 3: Generate current date in format yyyyMMdd'T'HHmmss'Z' (UTC)
        SimpleDateFormat dt = new SimpleDateFormat("ddMMyyyy");//Set the format of date that we want
        dt.setTimeZone(TimeZone.getTimeZone("UTC"));//set the time zone
        String din = dt.format(new Date());
        System.out.println(din);
        // Step 4: Concatenate values to form the message
        String msg=din+ad;
        
        // Step 5: Generate HMAC signature using the message and secret key
      /*  Mac mc = Mac.getInstance(HMAC_ALGO);
       SecretKeySpec s = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), HMAC_ALGO);
       mc.init(s);
       byte[] by=mc.doFinal(msg.getBytes(StandardCharsets.UTF_8));
       System.out.println(by);
       String ty = Base64.getEncoder().encodeToString(by);
       System.out.println(ty);
       */
        

HmacUtils hmac = new HmacUtils(HmacAlgorithms.HMAC_SHA_256,SECRET_KEY);
byte[] hmc = hmac.hmac(msg);
String tb = Base64.getEncoder().encodeToString(hmc);
System.out.println(tb);

       
        // Convert HMAC signature to Base64
        return ad;
    }	
}