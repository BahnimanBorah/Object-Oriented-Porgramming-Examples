package ObjectOrientedLibrary;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SortWithName {

	public static Library[] sortWithName(Library[] libraries) {
		
		String[] names = new String[libraries.length];
		for(int i=0;i<libraries.length;i++) {
			names[i]=libraries[i].getName();
		}
		
		Arrays.sort(names);
		Library[] sorted = new Library[libraries.length];
		
		for(int i=0;i<names.length;i++) {
			String name = names[i];
			for(int j=0;j<libraries.length;j++) {
				if(name.equals(libraries[j].getName())) {
					sorted[i]=libraries[j];
					break;
				}
			}
		}
		return sorted;
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter No. of Libraries: ");
		int n = Integer.parseInt(in.nextLine());
		Library[] libraries = new Library[n];
		
		System.out.println("Enter details: ");
		
		if(n>=2) {
			for(int i=0;i<n;i++) {
				System.out.println("Enter ID: ");
				int id = Integer.parseInt(in.nextLine());
				System.out.println("Enter Name: ");
				String name = in.nextLine();
				System.out.println("Enter Address: ");
				String addr = in.nextLine();
				
				libraries[i]=new Library(id,name,addr);
			}
		}
		
		System.out.println("Sorting using names...");
		
		Library[] sorted = sortWithName(libraries);
		
		for(Library lib:sorted) {
			lib.display();
		}
	}

}
