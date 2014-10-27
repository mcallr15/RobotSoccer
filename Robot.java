class Robot{
    Point p = new Point();
    Ball b = new Ball();
    
    String color = "red";
    int speed = 2;
    
    public void setGame(){
       p.x = (int)(Math.random()*10);
       p.y = (int)(Math.random()*10);
    }
}