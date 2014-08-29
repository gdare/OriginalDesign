int x = 400;
int y = 400;
boolean doorOpen = false;

void setup()
{
	size(500,500);
	background(255,255.255);
	noStroke();
}
void draw()
{   
	human();
	houseBase();
	window();
	door();
	instrution();
}
void houseBase(){
	fill(255,0,0);
	rect(100, 300, 150, 150);
	fill(50,255,50);
	triangle(175, 250, 75, 300, 275, 300);
}
void window(){
	fill(255,255,255);
	rect(125, 325, 50, 50);
	fill(100,100,255);
	rect(129,329,18,18);
	rect(153,329,18,18);
	rect(129, 353, 18, 18);
	rect(153, 353, 18, 18);
}
void door(){
	if (doorOpen == false){
		fill(100,100,100);
	    rect(200,375,50,75);
	}
	else{
		fill(100,100,255);
		rect(200,375,50,75);
	}
}
void human(){
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
void instrution(){
	text("a and d to move.",350,100);
	text("Move to the door.",350,120);
}

