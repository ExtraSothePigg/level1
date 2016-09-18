
public class SmurfRunner {
public static void main(String[] args){
	Smurf Handy = new Smurf("Handy");
	Smurf Papa = new Smurf("Papa");
	Smurf Smurfette = new Smurf("Smurfette");
	
	System.out.println(Handy.getName());
	System.out.println(Handy.getHatColor());
	System.out.println(Handy.isGirlOrBoy());
	Handy.eat();
	
	System.out.println(Papa.getName());
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	Papa.eat();
	
	System.out.println(Smurfette.getName());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
	Smurfette.eat();
	
	}
}
