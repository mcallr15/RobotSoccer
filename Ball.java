class Ball{
    
    Point p = new Point();
    
    public void setGame(){
       p.x = (int)(Math.random()*10);
       p.y = (int)(Math.random()*10);
   }
}