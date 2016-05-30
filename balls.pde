int xspeed, yspeed, size, maxsize, xcor, ycor, state;
color tacos;


void setup(){
  xcor = (int)(Math.random()*300);
  ycor = (int)(Math.random()*600);
  state = 0;
  xspeed = (int)(Math.random()*50);
  yspeed = (int)(Math.random()*50);
  size = 10;
  tacos = ((int)(Math.random()*250), (int)(Math.random()*250), (int)(Math.random()*250));
}