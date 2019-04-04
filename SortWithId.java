package ObjectOrientedLibrary;
import java.util.Scanner;

public class SortWithId {

	public static Library[] sortWithId(Library[] libraries) {
		
		Library temp;
		for(int i=0;i<libraries.length-1;i++) {
			for(int j=i+1;j<libraries.length;j++) {
				if(libraries[j].getId()<libraries[i].getId()) {
					temp = libraries[j];
					libraries[j] = libraries[i];
					libraries[i] = temp;
				}
			}
		}
		
		return libraries;
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
		in.close();
		System.out.println("Sorting using ID...");
		
		Library[] sorted = sortWithId(libraries);
		
		for(Library lib:sorted) {
			lib.display();
		}
	}

}
