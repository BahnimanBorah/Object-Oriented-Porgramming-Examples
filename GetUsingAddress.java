package ObjectOrientedLibrary;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GetUsingAddress {
	
	public static Library[] getWithAddress(Library[] libraries, String addr) {
		
		List<Library> selected = new ArrayList<Library>();
		
		for(int i=0;i<libraries.length;i++) {
			if(libraries[i].getAddress().equalsIgnoreCase(addr)) {
				selected.add(libraries[i]);
			}
		}
		
		Library[] found = new Library[selected.size()];
		selected.toArray(found);
		
		return found;
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
		
		System.out.println("Enter Address to Search: ");
		String addr = in.nextLine();
		in.close();
		
		Library[] found = getWithAddress(libraries,addr);
		
		for(Library lib:found) {
			lib.display();
		}

	}

}
