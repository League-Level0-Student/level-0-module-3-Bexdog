void setup(){
 size(200,200); 
}
void draw(){
  noFill();
 int x = 150;
  for(int i=10; i>0;i--){
 noFill();
    
    ellipse(100,100,x,x);
for(int y=0;y<15;y++){
x--;
}
}
}