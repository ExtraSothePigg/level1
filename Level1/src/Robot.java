
	public class Robot{
		int numberOfWheels;
		Knife knife;
		String name;
		boolean isEvil;
		
		public Robot(String name, boolean evil){
			numberOfWheels = 8;
			knife = new Knife();
			this.name = name;
			isEvil = evil;
		}
			void destroyHumans(){
				if(isEvil == true){
					System.out.println(name + "yes");
				}
				else if(isEvil == false){
					System.out.println(name + "no");
				}
			}
		}
	class Knife{
		double sharpness;
		public Knife(){
			sharpness = 0.99;
		}
	}
	

