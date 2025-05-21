package day_8;
import java.io.*;
public class File_write {
	public static void main(String[] args) throws IOException{
		FileWriter f1=new FileWriter("C:\\Users\\AMMULU\\oneDrive\\Desktop\\sem.txt");// if you give sem 2 then it creates and write
		f1.write("hi bhoomika");//sem is present so it write inside it
		f1.close();
		System.out.println("success");//read file doesnt do that but write file does
	}

}
