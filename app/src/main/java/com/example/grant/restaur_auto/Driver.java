import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	static File emps = new File("emp.txt");
	public static void main(String[] args) throws FileNotFoundException {
	 Scanner in = new Scanner(emps); 
	 in.useDelimiter(",  *");
	 while (in.hasNext()){
		 System.out.println(in.next());
		 
	 }
	}

}
