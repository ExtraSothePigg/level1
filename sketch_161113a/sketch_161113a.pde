void setup(){
     size(500, 500);
  background(5, 100, 86);
  
}
void draw(){
makeMagical();
    
  for(int i = 1; i < 500; i = i + 5){
      float rndmX = random(500);
      float rndmY = random(500);
      float rndmR = random(255);
      float rndmG = random(255);
      float rndmB = random(255);
      fill(rndmR,rndmG,rndmB);
  ellipse(getWormX(i),getWormY(i),10,10);
  }
}
float frequency = .001;
float noiseInterval = PI; 


void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}


float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}


float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}