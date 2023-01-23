package br.com.fiap.pacman;

public class Ghost extends GameObject {

    private double direction;
    
    public Ghost() {
    }
    public Ghost(int x, int y, double direction) {
        super(x, y);
        this.direction = direction;
    }


    public double getDirection() {
        return direction;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void mover (int direction){
     
        if (direction == 0)
        this.setY(this.getY() -50); 
    
        if (direction == 90)
        this.setX(this.getX() +50);
    
        if (direction == 180)
        this.setY(this.getY() +50);
    
        if (direction == 270)
        this.setX(this.getX() -50);        
    }

    private boolean podeMover(int direction){  
        boolean aux = false;
        
        if(direction == 0){
            if(this.getY() - 10 > 0)
            aux = true; 
            }
        if(direction == 1){
            if(this.getY() + 10 < this.getScreenSize())
            aux = true; 
        }
        if(direction == 2){
            if(this.getX() - 20 > 0)
            aux = true; 
        }
        if(direction == 3){
            if(this.getX() + 10 < this.getScreenSize())
            aux = true; 
        }
        return aux;
    }

    public void mover(){ 
        
        int aux = 4;
        int random = (int)(Math.random() * aux) + 0;

        if (podeMover(random)){
           if(random == 0 ){
               this.setY(this.getY() -50); 
               this.setDirection(0);
           }
           if(random == 1){
               this.setY(this.getY() +50); 
               this.setDirection(180);
           }
           if(random == 2){
               this.setX(this.getX() -50);
               this.setDirection(270);
           } 
           if(random == 3){
               this.setX(this.getX() +50); 
               this.setDirection(90);
           }
        }
    }
   }

