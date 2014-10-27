class Ball{
    
    Point p = new Point();
    
    public void setGame(){
       p.x = (int)(Math.random()*10);
       p.y = (int)(Math.random()*10);
   }
   
   public int direction = 1;
    
   public void north(){direction = 1;}
   public void east(){direction = 2;}
   public void south(){direction = 3;}
   public void west(){direction = 4;}
   
   public void kick(){
       if(direction == 1){p.y--;}
       else if(direction == 2){p.x++;}
       else if(direction == 3){p.y++;}
       else if(direction == 4){p.x--;}
   }


}