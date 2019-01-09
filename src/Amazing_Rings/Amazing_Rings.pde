void setup(){
 size(900,500); 
}
int Rx = 700;
int lx = 200;
void draw(){
  background(10,224,222);
  noFill();
 
 int Ro = 350;
  for(int i=70; i>0;i--){
 noFill();
    
    ellipse(Rx,200,Ro,Ro);
for(int y=0;y<10;y++){
Ro--;
}
}
Rx--;




noFill();
 
 int lo = 350;
  for(int i=70; i>0;i--){
     noFill();
     ellipse(lx,200,lo,lo);
     for(int y=0;y<10;y++){
         lo--;
     }
  }
  lx++;
  
}