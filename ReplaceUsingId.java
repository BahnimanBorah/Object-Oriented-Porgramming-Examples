package ObjectOrientedLibrary;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceUsingId {
	
	public static boolean replaceWithId(Library[] libraries, Library lib) {
		
		for(int i=0;i<libraries.length;i++) {
			if(libraries[i].getId()==lib.getId()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no. of libraries: ");
		int n = Integer.parseInt(in.nextLine());
		
		
		Library[] libraries = new Library[n];
		System.out.println("Enter Library details: \n\n");
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter ID: ");
			int id = Integer.parseInt(in.nextLine());
			System.out.println("Enter Name: ");
			String name = in.nextLine();
			System.out.println("Enter Address: ");
			String address = in.nextLine();
			
			libraries[i] = new Library(id,name,address);
		}
		
		System.out.println("Enter details for new library: \n");
		System.out.println("Enter ID: ");
		int id = Integer.parseInt(in.nextLine());
		System.out.println("Enter Name: ");
		String name = in.nextLine();
		System.out.println("Enter Address: ");
		String address = in.nextLine();
		System.out.println("Searching...\n\n");
		Library new_lib = new Library(id,name,address);
		
		in.close();
		System.out.println(replaceWithId(libraries,new_lib));
		
	}

}
