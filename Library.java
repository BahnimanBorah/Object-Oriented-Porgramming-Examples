package ObjectOrientedLibrary;

public final class Library{
	
	private int id;
	private String name;
	private String address;
	
	protected Library(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public int getId() {return this.id;}
	public String getName() {return this.name;}
	public String getAddress() {return this.address;}
	
	public void display() {
		System.out.println(this.id+" "+this.name+" "+this.address);
	}
}