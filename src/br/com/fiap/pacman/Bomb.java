package br.com.fiap.pacman;

public class Bomb extends Item{
   private int tiraVidas;

public Bomb() {}
public Bomb(int x, int y) {
    super(x, y);
}
public int getTiraVidas() {
    return tiraVidas;
}
public void setTiraVidas(Player vidas) {
    int x = vidas.getX();
    int y = vidas.getY();
    if (x == getX()){
        if (y == getY()){
            vidas.setLife((int) (vidas.getLife()-1));
        }
    }   
} 


   
}
