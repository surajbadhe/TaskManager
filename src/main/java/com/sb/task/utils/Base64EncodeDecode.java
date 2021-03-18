package com.sb.task.utils;

import java.io.IOException;

import org.apache.tomcat.util.codec.binary.Base64;

public class Base64EncodeDecode {
	String orig = "original String before base64 encoding in Java";
	static String blobBase64Decoded="eyJvcmdfaWQiOiI2aXhucW5teSIsImFwaV9rZXkiOiIiLCJzZXNzaW9uX2lkIjoid2ViLWMxNjk2ODk5LWQwMTUtNDdjOS05NDcyLTlhNjY1ZTI4Y2VmOTE2MTIzNjk1OTQ3OTkiLCJhcGlfdHlwZSI6InNlc3Npb24tcXVlcnkiLCJzZXJ2aWNlX3R5cGUiOiJhbGwiLCJldmVudF90eXBlIjoibG9naW4iLCJwb2xpY3kiOiJ3dV9sb2dpbiIsInBhZ2VfaWQiOiIxIiwiaW5wdXRfaXBfYWRkcmVzcyI6IjI0NS4yNCiaWxlX2Jyb3dzZXIiLCJ3ZWJfc2Vzc2lvbl9pZCI6IndlYi1jMTY5Njg5OS1kMDE1LTQ3YzktOTQ3Mi05YTY2NWUyOGNlZjkiLCJvdXRwdXRfZm9ybWF0IjoianNvbiJ9";

        
    public static void main(String args[]) throws IOException {
        //encoding  byte array into base 64
        //byte[] encoded = Base64.encodeBase64(orig.getBytes());     
      
        //System.out.println("Original String: " + orig );
        //System.out.println("Base64 Encoded String : " + new String(encoded));
      
        //decoding byte array into base64
        byte[] decoded = Base64.decodeBase64(blobBase64Decoded);      
        System.out.println("Base 64 Decoded  String : " + new String(decoded));
        System.out.println("Original String: " + blobBase64Decoded );

    }


    public static String base64Encode(String str) {
    	return "";
    }
    
    public static String base64Decode(String encodedStr) {
    	return new String(Base64.decodeBase64(encodedStr));
    }


}
