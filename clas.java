package level1;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class clas {
public static void main(String[] args){
	
	Tortoise.setSpeed(10);
	Tortoise.setPenWidth(4);
	Tortoise.penDown();
	
	drawhouse("large");
	//for(int i = 0; i < 11; i++){
		//String highString = JOptionPane.showInputDialog("How many pixels tall should this house be?");
		//String widthString = JOptionPane.showInputDialog("What about the width in pixels?");
		//String rString = JOptionPane.showInputDialog("What should the red value be?");
		//String gString = JOptionPane.showInputDialog("Green value?");
		//String bString = JOptionPane.showInputDialog("Blue value?");
	//	String angleString = JOptionPane.showInputDialog("How many degrees should the point of your house be?");
		/*
		int height = Integer.parseInt(highString);
		
		int width = Integer.parseInt(widthString);
		width = width / 2;
		
		int point = Integer.parseInt(angleString);
		
		int r = Integer.parseInt(rString);
		
		int g = Integer.parseInt(gString);
		
		int b = Integer.parseInt(bString);
		
		drawHouse(r,b,g,height,width,point);
	}*/
}

static void drawhouse(String size){
	if(size.equals("small")){

}
/*static void drawHouse(int r, int b, int g, int height, int width, int point){
	int point2;
	int point3;
	point2 = 180 - width;
	point3 = point2 - point2 - point2;
	
	
			Tortoise.move(60);
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(90);
		Tortoise.move(60);
		Tortoise.setPenColor(Color.GREEN);
		Tortoise.turn(-90);
		Tortoise.move(20);
		Tortoise.turn(-90);
		Tortoise.setPenColor(Color.black);


	Tortoise.setPenColor(new Color(r,b,g));
	Tortoise.move(height);
	Tortoise.turn(point2);
	Tortoise.move(width);
	Tortoise.turn(point);
	Tortoise.move(width);
	Tortoise.turn(point2);
	Tortoise.move(height);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.GREEN);
	Tortoise.move(20);
	Tortoise.turn(-90);
}*/
}
