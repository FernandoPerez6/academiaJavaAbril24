package primitivos;

public class Principal {
	
	public static void main(String[] args) {
		final int i1 = 129;
		final int i2 = 129;
		
		System.out.println("i1==i2: "+(i1==i2));
		
		Integer int1 = new Integer(129);
		Integer int2 = new Integer(129);
		
		System.out.println("int1==int2: "+(int1==int2));
		
		Integer int3 = new Integer(127);
		Integer int4 = new Integer(127);
		
		System.out.println("int3==int4: "+(int3==int4)); //false
		
		Integer int5 = 129;
		Integer int6 = 129;
		
		System.out.println("int5==int6: "+(int5==int6)); //false
		
		Integer int7 = 127; //AUTOBOXING
		Integer int8 = 127;
		
		System.out.println("int7==int8: "+(int7==int8)); //true
		
		Integer int9 = Integer.valueOf(129);
		Integer int10 = Integer.valueOf(129);

		System.out.println("int9==int10: "+(int9==int10)); //false
		
		Integer int11 = Integer.valueOf(127);
		Integer int12 = Integer.valueOf(127);

		System.out.println("int11==int12: "+(int11==int12)); //true

		//Cache Integers
		
		//*************************************************
		
		byte b1 = 5;
		byte b2 = 8;
		
		//int b3 = b1 + b2;
		byte b3 = (byte)(b1 + b2);
		
		short s1 = 3;
		short s2 = 8;
		
		//int s3 = s1 + s2;
		short s3 = (short)(s1 + s2);
		
		byte b4 = 8;
		
		//b4 = b4  + 2;
		
		b4 += 2;
		System.out.println(b4);
		
		int highInt = Integer.MAX_VALUE;
		highInt += 1;
		
		System.out.println("******"+highInt );
		
		int x1 = 1;
		int x2 = 010; //OCTAL = DECIMAL 8
		
		System.out.println(x1+x2); //9
		
		int x3 = 0b101; //BINARIO = DECIMAL 5
		int x4 = 0B11; //BINARIO = DECIMAL 3
				
		System.out.println(x3+x4);
		
		int x5 = 0xABC; //HEXADECIMAL
		int x6 = 0X123;
		
		System.out.println(x5+x6);
		
		double d1 = 123_456_789.123_456;
		
		//double d2 = _123456789_._123456_;
		
		double d3 = 12____3___45____6_7__8____9.1_____23_____4___56;

		int i8 = 'a'; //97
		
		System.out.println(i8);
		
		
		
	}

}
