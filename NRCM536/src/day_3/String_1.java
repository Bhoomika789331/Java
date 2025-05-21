package day_3;

public class String_1 {

	public static void main(java.lang.String[] args) {
		String s1="queen";
		String s2="prince";//queen
		String s3=new String("queen");
		String s4=new String("queen");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);// its true because of scp
		System.out.println(s3==s4);//its false because of its not stored in scp(new keyword)
		System.out.println(s3.equals(s4));
		System.out.println(s2.equals(s4));
		System.out.println(s2==s4);
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s2));// negative value 
		
		

	}

}
