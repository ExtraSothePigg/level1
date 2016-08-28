
public class driver {
public static void main(String[] args){
	
	Robot name1 = new Robot("name, ", true);
	Robot name2 = new Robot("name2, ", false);
	Robot name3 = new Robot("name3, ", false);
name1.destroyHumans();
name2.destroyHumans();
name3.destroyHumans();
	}
}
