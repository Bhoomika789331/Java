package day_3;

public class Practice_1 {

	public static void main(String[] args) {
		String s1="Helloworlds";
		String vowels="";
		String consonants="";
		//int vowels =0,consonants=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowels+=ch;
			else if(ch>='a'&&ch<='z')
				consonants+=ch;
			
		}
		System.out.println("vowels:"+vowels+",consonants:"+consonants);

	}

}
