class Robot{
    Point p = new Point();
    
    String color = "red";
    int speed = 2;
    
    public void setGame(){
       p.x = (int)(Math.random()*10);
       p.y = (int)(Math.random()*10);
    }
    
    public void moveLeft(){
        if(p.x==0){p.x=9;}
        else{p.x--;}
    }
    public void moveRight(){
        if(p.x==9){p.x=0;}
        else{p.x++;}
    }
    public void moveUp(){
        if(p.y==0){p.y=9;}
        else{p.y--;}
    }
    public void moveDown(){
        if(p.y==9){p.y=0;}
        else{p.y++;}
    }
}