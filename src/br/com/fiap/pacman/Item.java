package br.com.fiap.pacman;

public class Item extends GameObject {
    private boolean isVisivel;

    public Item() {}
    public Item(int x, int y) {
        super(x, y);
    }
    
    public boolean isVisivel() {
        return isVisivel;
    }
    public void setVisivel(boolean isVisivel) {
        this.isVisivel = isVisivel;
    }
    
}
