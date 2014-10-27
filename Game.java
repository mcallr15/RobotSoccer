import java.util.*;
import java.io.*;

class Game {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        Point p = new Point();
        Robot r = new Robot();
        Ball b = new Ball();
        
        r.setGame();
        b.setGame();
        
        System.out.println(pos.rob.x + " " + pos.rob.y);
        System.out.println(pos.ball.x + " " + pos.ball.y);
        
        String move;
        boolean loop = true;
        while(loop == true){
            //field[r.p.x][r.p.y]="-";
            //field[b.p.x][b.p.y]="-";
            
            System.out.println("enter move: ");
            move = scanner.next();
            move = move.toLowerCase();
            
            if(move.equals("l")){
                r.moveLeft(); 
                b.west();
            }
            else if(move.equals("r")){
                r.moveRight(); 
                b.east();
            }
            else if(move.equals("u")){
                r.moveUp(); 
                b.north();
            }
            else if(move.equals("d")){
                r.moveDown(); 
                b.south();
            }
            else if(move.equals("quit")){
                loop = false;
            }
            else if(move.equals("kick")){
                b.kick();
            }
            else if((int)r.p.x==(int)b.p.x && (int)r.p.y==(int)b.p.y){
                b.kick();
            }
            
            //field[r.p.x][r.p.x]="R";
            //field[b.p.x][b.p.y]="B";
            
            //printField();
            System.out.println("R: ("+r.p.x+","+r.p.y+")\nB: ("+b.p.x+","+b.p.y+")");
        }
    }
}

   
        Scanner scanner = new Scanner(System.in);

        Robot r = new Robot();
        Ball b = new Ball();
        
        r.setGame();
        b.setGame();
        setField();
        
        field[r.p.x][r.p.x]="R";
        field[b.p.x][b.p.y]="B";
        
        printField();

        System.out.println("R: ("+r.p.x+","+r.p.y+")\nB: ("+b.p.x+","+b.p.y+")");

        String move;
        boolean loop = true;
        while(loop == true){
            field[r.p.x][r.p.y]="-";
            field[b.p.x][b.p.y]="-";
            
            System.out.println("enter move: ");
            move = scanner.next();
            move = move.toLowerCase();
            
            if(move.equals("l")){
                r.moveLeft(); 
                b.west();
            }
            else if(move.equals("r")){
                r.moveRight(); 
                b.east();
            }
            else if(move.equals("u")){
                r.moveUp(); 
                b.north();
            }
            else if(move.equals("d")){
                r.moveDown(); 
                b.south();
            }
            else if(move.equals("quit")){
                loop = false;
            }
            else if(move.equals("kick")){
                b.kick();
            }
            else if((int)r.p.x==(int)b.p.x && (int)r.p.y==(int)b.p.y){
                b.kick();
            }
            
            field[r.p.x][r.p.x]="R";
            field[b.p.x][b.p.y]="B";
            
            printField();
            //System.out.println("R: ("+r.p.x+","+r.p.y+")\nB: ("+b.p.x+","+b.p.y+")");
        }
    }
    public static String[][] field = new String[10][10];
    private static void setField(){
        for(int y=0; y<10;  y++){
            for(int x=0; x<10; x++){
                field[x][y]="-";
            }
        }
    }
    /*
    private static void printField(){
        for(int y=0; y<10;  y++){
            for(int x=0; x<10; x++){
                System.out.print(field[x][y]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    */

