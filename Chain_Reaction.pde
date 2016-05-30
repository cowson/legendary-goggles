Ball[] balls;

boolean reactionStarted;

void setups() {
  size(600, 600);
  reactionStarted = false;
  balls =  new balls[25];
  for (int i = 0; i < balls.length; i++)
    balls[i] = new Balls();
   balls[0].state = Ball.DEAD;
}