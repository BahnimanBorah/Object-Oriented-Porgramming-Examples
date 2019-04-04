package ObjectOrientedLibrary;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GetUsingName {

	public static Library[] getWithName(Library[] libraries, String lib_name) {
		
		List<Library> selected = new ArrayList<Library>();
		
		for(int i=0;i<libraries.length;i++) {
			if(libraries[i].getName().equalsIgnoreCase(lib_name)) {
				selected.add(libraries[i]);
			}
		}
		
		Library[] found = new Library[selected.size()];
		selected.toArray(found);
		
		return found;
	}
	
	public static void main(String[] args) {

		Scanner in =  new Scanner(System.in);
		System.out.println("Enter no. of libraries: ");
		int n = Integer.parseInt(in.nextLine());
		
		Library[] libraries = new Library[n];
		
		System.out.println("Enter details:\n\n");
		for(int i=0;i<n;i++) {
			System.out.println("Enter ID:");
			int id = Integer.parseInt(in.nextLine());
			System.out.println("Enter Name:");
			String name = in.nextLine();
			System.out.println("Enter Address:");
			String addr = in.nextLine();
			
			libraries[i] = new Library(id,name,addr);
		}
		
		System.out.println("Enter Library name to search:");
		String lib_name = in.nextLine();
		in.close();
		
		Library[] found = getWithName(libraries,lib_name);
		
		for(Library lib:found) {
			lib.display();
		}
	}

}
