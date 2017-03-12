int gravity = 1;
int change = 3;
int rectMove = 400;
float r = random(400);
float i = r;
void setup(){
  background(0,170,255);
  size(500,500);
}
void draw(){
  background(0,170,255);
  rect(rectMove,i,20,500);
  rect(rectMove,i - 560,20,500);
  ellipse(50,gravity,20,20);
  gravity += change;
  rectMove -= 5;
  if(rectMove <= 0){
    float r2 = random(400);
    rectMove = 400;
    i = r2;
  }
}
void mouseClicked(){
    change = -change;
  }