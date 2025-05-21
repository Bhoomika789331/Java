package day_2;

public class Practice_arg {

	public static void main(String[] args) {
		
		int a1=Integer.parseInt(args[0]);
		double d1=Double.parseDouble(args[1]);
		String a=args[2];
		char ch=args[3].charAt(0);// here we use index values for particular character
		float f=Float.parseFloat(args[4]);
		long l=Long.parseLong(args[5]);
		short s=Short.parseShort(args[6]);
		byte b=Byte.parseByte(args[7]);
		System.out.println(a1);
		System.out.println(d1);
		System.out.println(a);
		System.out.println(ch);
		System.out.println(f);
		System.out.println(l);
		System.out.println(s);
		System.out.println(b);

	}
 
}
