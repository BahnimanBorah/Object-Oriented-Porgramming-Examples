package ObjectOrientedLibrary;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SortUsingAddress {
	
	public static Library[] sortWithAddress(Library[] libraries) {
		
		String[] addresses = new String[libraries.length];
		for(int i=0;i<libraries.length;i++) {
			addresses[i]=libraries[i].getAddress(); //copying all addresses
		}
		
		Arrays.sort(addresses); //sorting the addresses
		
		Library[] sorted = new Library[libraries.length];
		
		
		for(int i=0;i<addresses.length;i++) {
			String add = addresses[i];
			for(int j=0;j<libraries.length;j++) {
				if(add.equals(libraries[j].getAddress())) {
					sorted[i]=libraries[j];
					break;
				}
			}
		}
		
		return sorted;
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
		
		System.out.println("Sorting using address..\n\n");
		in.close();
		
		Library[] sorted = sortWithAddress(libraries);
		
		for(Library l:sorted) {
			l.display();
		}
		
	}

}
