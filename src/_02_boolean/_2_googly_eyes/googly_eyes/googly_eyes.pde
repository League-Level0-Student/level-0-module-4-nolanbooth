PImage face;

void setup() {
size(840, 770);
face = loadImage("tomnaughtyface.png");
 face.resize(840,770);

}

void draw() {

  //int a1 = mouseX;
// int b1 = mouseY;
// int c2 = mouseX+75;
//  int d2 = mouseY;
background(face);
//white eyes part
fill(#ffffff);
ellipse(275,450,60,90);
ellipse(200,450,60,90);
//pupils (down here)
fill(#000000);
ellipse(mouseX,mouseY,30,45);
ellipse(mouseX+75,mouseY,30,45);
if(mouseX < 187){
mouseX = 187;
}
if (mouseX > 213){
 mouseX = 213; 
}
if (mouseY < 426){
mouseY = 426;
}
if(mouseY > 474){
  mouseY = 474; 
}
}
