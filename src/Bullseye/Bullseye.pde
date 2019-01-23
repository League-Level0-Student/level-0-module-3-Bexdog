void setup(){
 size(200,200); 
}
void draw(){
  noFill();
 int x = 150;
 
for(int y=18;y>2;y--){
if (y%2==0){
fill(255,3,3);  
ellipse(100,100,x,x);
}
 else {
   fill(3,0,0); 
ellipse(100,100,x,x);
 }
 
  x-=10;
}

  }