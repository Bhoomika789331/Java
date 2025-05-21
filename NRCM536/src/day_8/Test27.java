package day_8;
import java.io.*;
public class Test27 {
	public static void main(String[] args) throws IOException{
	File f1=new File("C:\\Users\\AMMULU\\oneDrive\\Desktop\\sem.txt");
	if(f1.createNewFile()) {
		System.out.println("file created");
	}
	else {
		System.out.println("not created");
	}

}
}
