package day_6;


public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=26;
		
		
		try {
			int b=Integer.parseInt(args[0]);
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}
		
	}

}

