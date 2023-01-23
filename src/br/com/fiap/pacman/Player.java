package br.com.fiap.pacman;

public class Player extends GameObject{
    private int life, direction;
    private boolean isInvencivel;

    

    public Player() {
    }   
    public Player(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    public double getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public boolean isInvencivel() {
        return isInvencivel;
    }
    public void setInvencivel(boolean isInvencivel) {
        this.isInvencivel = isInvencivel;
    }
    public int getDirection() {
        return direction;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }

    private boolean podeMover(int direction){  
        boolean aux = false;
        
        if(direction == 0){
            if(this.getY() - 10 > 0)
            aux = true; 
            }
        if(direction == 180){
            if(this.getY() + 10 < this.getScreenSize())
            aux = true; 
        }
        if(direction == 270){
            if(this.getX() - 20 > 0)
            aux = true; 
        }
        if(direction == 90){
            if(this.getX() + 10 < this.getScreenSize())
            aux = true; 
        }
        return aux;
    }


    public void mover (int direction){
     
        if (podeMover(direction)){
        if (direction == 0)
        this.setY(this.getY() -50); 
    
        if (direction == 90)
        this.setX(this.getX() +50);
    
        if (direction == 180)
        this.setY(this.getY() +50);
    
        if (direction == 270)
        this.setX(this.getX() -50);       
    }
}

   

    
}
