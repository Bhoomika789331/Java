package day_4;

public class Sample {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 d1=new Demo5();
		d1.setFirstName("bhoomika");
		d1.setLastName("venkatesh");
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());

	
}