import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	
	public static void main(String[] args){
		Random r1 = new Random();
	World world = new World();
	world.show();
	Bug bug = new Bug();
	Bug bug2 = new Bug();
	Flower flower = new Flower();
	bug2.setColor(Color.blue);
	bug2.turn();
for(int i = 0;i<300;i=i+2){
	int x = r1.nextInt(8);
	int y = r1.nextInt(8);
	if(i%2==1){
		i = i-1;
	}
	Location redLoc = new Location(x+i,y);
	Flower redFlower = new Flower();
	redFlower.setColor(Color.RED);
	world.add(redLoc, redFlower);
	}
	}
	
}
