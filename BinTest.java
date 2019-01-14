
public class BinTest {
	public static void main(String[] args) {
		Bin normalBin = new Bin();
		normalBin.add("banana skin");
		normalBin.add("coke can"); 
		System.out.println(normalBin); //calls toString method
		normalBin.empty();
		System.out.println(normalBin);
		//normalBin.weigh(); we can't use this because weigh was defined in RecyclingBin so not visible to Bin
		
		RecyclingBin gBin = new RecyclingBin("Glass"); 
		/*can now pass String wasteType arguments to the RecyclingBin constructor method
		 *we didn't pass any arguments to the Bin constructor
		 */
		gBin.add("milk bottle");
		System.out.println(gBin);
		gBin.empty();
		
		RecyclingBin cBin = new RecyclingBin("Cardboard");
		cBin.add("shoebox, " + "juice carton"); //here we use the add method from Bin
		System.out.println(cBin.weigh());
	}
}
