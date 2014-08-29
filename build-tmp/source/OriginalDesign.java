import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x = 400;
int y = 400;
boolean doorOpen = false;

public void setup()
{
	size(500,500);
	background(255,255.255f);
	noStroke();
}
public void draw()
{   
	human();
	houseBase();
	window();
	door();
	instrution();
}
public void houseBase(){
	fill(255,0,0);
	rect(100, 300, 150, 150);
	fill(50,255,50);
	triangle(175, 250, 75, 300, 275, 300);
}
public void window(){
	fill(255,255,255);
	rect(125, 325, 50, 50);
	fill(100,100,255);
	rect(129,329,18,18);
	rect(153,329,18,18);
	rect(129, 353, 18, 18);
	rect(153, 353, 18, 18);
}
public void door(){
	if (doorOpen == false){
		fill(100,100,100);
	    rect(200,375,50,75);
	}
	else{
		fill(100,100,255);
		rect(200,375,50,75);
	}
}
public void human(){
	background(255);
	fill(0);
	ellipse(x, y, 25, 25);
	if (keyPressed == true){
		if (key == 'd'){
			x = x + 1;
		}
		if (key == 'a'){
			x = x - 1;
		}
	}
	if (x < 250 && x > 200){
		doorOpen = true;
	}
	else{
		doorOpen = false;
	}
}
public void instrution(){
	text("a and d to move",350,100);
	text("move to the door",350,120);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
