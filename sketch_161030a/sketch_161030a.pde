Button fireButton = new Button(18,10,20,"Launch");
PImage photo;
PImage pumpkin;
PImage crow;
int pumpX;
int pumpY = 520;
int crowX = 800;
int crowY = 500;
static final int gravity = -10;
double vx = 24;
double vy = -20;
static final int READY = 0;
static final int FIRE = 1;
int mode = READY;
void setup(){
  size(1300,862);
   photo = loadImage("13776791-Illustration-of-an-empty-farm-Stock-Vector-farm-cartoon.jpg");
   background(photo);
   
//  size(100,100);
  pumpkin = loadImage("AbrahamLincolnPumpkinCarvingPattern.png");
  
 // size(300,352);
  crow = loadImage("ScareCrow.png");
  crow.resize(300,352);

}
void draw(){
   background(photo);
  if(mode == FIRE){
    pumpX += vx;
    pumpY += vy;
    vy -= gravity / 10.0;
  }else if(mode == READY){
    
  }
  
  image(crow,crowX,crowY);

  image(pumpkin,pumpX,pumpY);
  if(pumpY > 520){
    pumpY = 520;
    pumpX = 0;
    vx = 24;
    vy = -20;
  }
}

void buttonActionPerformed(Button button){
  if(button == fireButton){
    mode = FIRE;
  }
}
