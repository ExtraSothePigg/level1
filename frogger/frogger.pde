int frogX = 200;
int frogY = 370;
String winMessage = "WIN";
Car normalCar;
Car strangeCar;
Car niceCar;

void setup(){
  size(400,400);
  normalCar = new Car(400,100,40,20);
  strangeCar = new Car(0,200,20,40);
  niceCar = new Car(400,300,65,65);
}
void draw(){
  background(15,120,120);
  fill(0,255,0);
  ellipse(frogX,frogY,10,15);
  normalCar.display();
  normalCar.move(5);
  strangeCar.display();
  strangeCar.move(-5);
  niceCar.display();
  niceCar.move(5);
  
  if(intersects(normalCar)){
    frogY = 370;
  }else if(intersects(strangeCar)){
    frogY = 370;
  }else if(intersects(niceCar)){
    frogY = 370;
  }
  
  if(frogY < 50){
    text(winMessage,200,200);
    textSize(50);
  }
}
void keyPressed(){
  if(keyCode == UP){
    frogY = frogY - 10;
  }else if(keyCode == DOWN){
    frogY = frogY + 10;
  }else if(keyCode == LEFT){
    frogX = frogX - 10;
  }else if(keyCode == RIGHT){
    frogX = frogX + 10;
  }
  StayIn();
}
void StayIn(){
  if(frogX > 400){
    frogX = frogX - 10; 
  }else if(frogX < 0){
    frogX = frogX + 10;
  }else if(frogY > 400){
    frogY = frogY - 10;
  }else if(frogY < 0){
    frogY = frogY + 10;
  }
}
class Car{
int carX;
int carY;
int carSize;
int carSpeed;
Car(int carX, int carY, int carSize, int carSpeed){
  this.carX = carX;
  this.carY = carY;
  this.carSize = carSize;
  this.carSpeed = carSpeed;
}
  void display() 
  {
    fill(0,255,0);
    rect(carX , carY, carSize, 50);
  }
void move(int carSpeed){
  carX = carX - carSpeed;
  if(carX < 0){
   carX = carX + 400; 
  }else if(carX > 400){
    carX = carX - 400;
  }
}
int getX(){
  return carX;
}
int getY(){
  return carY;
}
int getSize(){
  return carSize;
}

}
  boolean intersects(Car car) {
if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getSize()))
          return true;
    else 
        return false;
}

