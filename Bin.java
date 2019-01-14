
public class Bin {
	protected String contents; //needs to be protected to use in RecyclingBin and other visible subclasses
	public Bin() { //bin constructor - we don't pass any arguments to this constructor
		contents = ""; //provide this empty string or we will get nullbanana skin... try it
	}
	public void add(String thing) {  
		contents += thing + ", "; //thing is the String argument we pass to this method i.e. the item we want to put in the bin
		                          //when we call the method elsewhere, (binObject.add) we will get prompted to type in "thing" - try it if you don't get it!
	}
	public String toString() {
		return "Bin contains: " + contents;
	}
	public void empty() {  //empty bin method
		contents = "";
	}
}
