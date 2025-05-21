package day_3;

public class String_buffer {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		
		System.out.println(sb1.append(sb2));
		System.out.println(str1.concat(str2));

	}

}
