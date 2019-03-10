
public class Gra {

    private int x, y;
    String imieGracza;
    int nrGracza;
    public Gra(int gracz) {
        nrGracza = gracz;
    }
    
    public String getImie () {
        return imieGracza;
    }
    
    public int getNumer () {
        return nrGracza;
    }
    
    public void setWspolrzedne (int x, int y) {
        if (x<3 & y<3 & x>=0 & y>=0) {
            this.x = x;
            this.y = y;
            }
        else System.out.println("Probujesz grac poza plansza! ;) ");
    }
    
    public int getX () {
        return x;
    }
    
    public int getY () {
        return y;
    }
}
