int rainfall = 0;
int score = 0;
int randomNumber = (int)random(1000);
void setup(){
size(1000,1000);
}

void draw(){
background(30,200,100);
ellipse(randomNumber,rainfall,10,20);
fill(0,0,255);
stroke(10,40,60);

rainfall = rainfall + 7 + score;
rect(mouseX,900,30,60);

fill(0,0,0);
textSize(16);
text("score: " + score, 20, 20);

if(rainfall > 940){
  checkCatch(randomNumber);
  rainfall = 0;
  randomNumber = (int)random(1000);
}

if(rainfall >= 1000){
 ellipse(randomNumber,rainfall,10,20);
 rainfall = 0;
 randomNumber = (int)random(1000);
}


}

void checkCatch(int x){
if (x > mouseX && x < mouseX+100)
      score++;
   else if (score > 0)
     score--;
println("Your score is now: " + score);
}