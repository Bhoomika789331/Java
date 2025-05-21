package day_4;

public class Parameter {

		int a=90;
		public Parameter(int b) {
			this.a=a;//b=a;this is used for same variable name , for different no need
		
		System.out.println("gm"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Parameter  d1=new Parameter (45); 
         Parameter d2=new Parameter (56);
         Parameter d3=new Parameter (86);
		
	}

}
