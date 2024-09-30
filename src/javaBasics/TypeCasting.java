package javaBasics;

public class TypeCasting {

	public static void main(String[] args) {
		//byte, short, int, long,float,double
		
		//widening: converting a lower data type into higher data type
		//narrowing: converting a higher data type into lower data type
				byte b = 10;
				
				short s = b;
				System.out.println(s);//widening
				
				
				short s1 = 200;
				byte b1 = (byte)s1;//200
				//-128 to 127==> 256 
				
				System.out.println(b1);//-56; 256-200 = -56 //narrowing
//				
//				
				short s2 = 10;
				byte b2 = (byte)s2;//10
				System.out.println(b2);//10//narrowing
				
//				
//				byte t1 = 10;
//				int i = t1;
//				System.out.println(i);
//				
//				int j = 1000;
//				byte k = (byte) j;
//				System.out.println(k);//-24
//				
//				
//				int p = 100;
//				float f = p;
//				System.out.println(f);
//				
//				float f1 = 12.33f;
//				int p1 = (int)f1;
//				System.out.println(p1);
//				
//				int d = 10000;
//				double dd = d;
//				System.out.println(dd);
//				
//				char ch = 'a';//97
//				int w = ch;
//				System.out.println(w);
//				
//				int v = 1200;
//				char cg = (char)v;//1200
//				System.out.println(cg);
//				
//				
//				char th = 'a';
//				short sh = (short)th;
//				System.out.println(sh);
				
		
		//ctrl + forward slash : to comment all the lines

	}

}
