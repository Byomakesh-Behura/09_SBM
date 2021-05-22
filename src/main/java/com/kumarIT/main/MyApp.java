package com.kumarIT.main;

import com.kumar.beans.PwdDecoder;
import com.kumar.beans.PwdEncoder;

public class MyApp {

	public static void main(String[] args) {
		
		String encode=PwdEncoder.Encode("kumarliku@123");
		System.out.println("Encoder value::"+encode);
		String decode=PwdDecoder.Decode(encode);
		System.out.println("Decoder value::"+decode);

	}

}
