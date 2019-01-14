/* !!!TO SAVE US FROM TYPING THIS OUT TWICE - USE INHERITANCE FROM BIN!!!
public class RecyclingBin extends Bin{
	private String contents; //we needed to change private to protected
	public RecyclingBin() {
	contents = ""}
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
*/
public class RecyclingBin extends Bin {  //we can create RecyclingBin objects from this class
	private String wasteType;            //we create a new attribute that isn't visible to Bin
	public RecyclingBin(String wt) {     //RecyclingBin's constructor can take arguments even though Bin doesn't
		super();                       //call the Bin superconstructor using super(); - has to be the first line of the constructor
		this.wasteType = wt;             //use this. when there is ambiguity i.e. different attributes with same names in different classes - this. makes it clear we want to use the one defined in this class. On the contrary we can use super. to be clear that we want to use a method/object/whatever from a superclass
	}
	public String toString() {
		return "Recycling bin (" + wasteType + ") contains: " + contents; //Bin's toString method has been overwritten here but we can call super.toString() if we want to use it
	}
	public int weigh() {
		return contents.length();        //don't worry about the actual method - length of String is obvs not the weight of the bin but we'll do that later
	}
}