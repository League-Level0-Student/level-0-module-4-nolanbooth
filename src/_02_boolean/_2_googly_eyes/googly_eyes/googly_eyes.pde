PImage face;

void setup() {
  //print("HELLLOLLOLOLOLOLOLOLOLOLOLOLOLOL"); 

size(840, 770);
face = loadImage("tomnaughtyface.png");
 face.resize(840,770);

}

void draw() {
  background(face);
fill(#ffffff);
ellipse();
ellipse(200,450,60,90);
fill(#000000);
ellipse(200,450,30,45);





}
