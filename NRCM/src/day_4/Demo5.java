package day_4;

public class Demo5 {
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmail(String e) {
		email=e;
	}
	public void setPhoneNumber(long l) {
		phoneNumber=l;
	}
	public String getFirstName() {
		return firstName;
		
	}
	public String getLastName() {
		return lastName;
	
	}
	public String getEmail() {
		return email;
	}
		public long getPhoneNumber() {
			return phoneNumber;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d1=new Demo5();
		d1.setFirstName("bhoomika");
		d1.setLastName("venkatesh");
		d1.setEmail("bhoomika@gmail.com");
		d1.setPhoneNumber(7894561231l);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmail());
		System.out.println(d1.getPhoneNumber());


	}

}
