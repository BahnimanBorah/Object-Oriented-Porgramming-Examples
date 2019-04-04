package ObjectOrientedLibrary;
import java.util.Scanner;

public class PrintEvenLibrary {
	
	public static Library[] getEvenLibraries(Library[] libraries) {
		
		Library[] evenOnes = new Library[(libraries.length)/2];
		int newL=0;
		
		for(int i=1;i<libraries.length;i=i+2) {
			int id = libraries[i].getId();
			String name = libraries[i].getName();
			String address = libraries[i].getAddress();
			
			evenOnes[newL] = new Library(id,name,address);
			newL++;
		}
		
		
		return evenOnes;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no. of libraries: ");
		int n = Integer.parseInt(in.nextLine());
		
		if(n<=1) {
			System.out.println("Invalid");
			return;
		}
		
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
		in.close();
		
		System.out.println("Printing even libraries: \n\n");
		
		Library[] evenOnes = getEvenLibraries(libraries);
		
		for(Library lib:evenOnes) {
			lib.display();
		}
	}

}
