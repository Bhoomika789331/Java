package day_8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File_read {
	public static void main(String[] args)
	{
		try {
			File Obj=new File("C:\\Users\\AMMULU\\oneDrive\\Desktop\\sem.txt");
			Scanner R=new Scanner(Obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
				
			}
			R.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("an error has occured");
			e.printStackTrace();
		}
	}

}
