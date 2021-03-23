package com.selenium.maven1;

import java.util.Base64;

public class PasswordEncryption {

	public static void main(String[] args) {

		// String password="abcd1234";
		// byte[] encode=Base64.encodeBase64
		// byte[] encodedPassword=Base64.EncodeBase64(password.getBytes());

		//String str = "selenium";
		//String str = "Aadya@1988";
		String str = "admin123";
		byte[] byteEncode = Base64.getEncoder().encode(str.getBytes());
		String strEncode = new String(byteEncode);

		System.out.println("String after Encode====>" + strEncode);
		// ===================Decode==================================================//

		byte[] byteDecode = Base64.getDecoder().decode(strEncode.getBytes());
		String strDecode=new String(byteDecode);
		
		System.out.println("String after Decode======>"+strDecode);

	}

}
