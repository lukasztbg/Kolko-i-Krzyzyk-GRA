
import java.util.Scanner;
public class GraStart {
    public static int[][] tablica = new int[3][3];
    Scanner scan = new Scanner(System.in);
    String imie1, imie2;
    Gra pierwszy = new Gra(1);
    Gra drugi = new Gra(2);
    // utworzenie obiektow - graczy
    
    public void pobranieImion() {
        System.out.println("Wpisz imie pierwszego gracza");
        pierwszy.imieGracza = scan.nextLine();
        System.out.println("Wpisz imie drugiego gracza");
        drugi.imieGracza = scan.nextLine();
    }
    
    public void przygotowanieGry() {
       
        for (int[] tablica1 : tablica) {
            for (int j = 0; j < tablica1.length; j++) {
                tablica1[j] = 0;
            }
        } //wyzerowanie tablicy
        
        int x=0;
        while (x<9) {
        System.out.println(pierwszy.getImie() +" podaj wspolrzedna x i y Twojego ruchu");
        pierwszy.setWspolrzedne(scan.nextInt(), scan.nextInt());
        umieszczenie(pierwszy.getX(),pierwszy.getY(),pierwszy.getNumer());
        wyswietlenieTablicy();
        sprawdzenie();
        System.out.println(drugi.getImie() +" podaj wspolrzedna x i y Twojego ruchu");
        drugi.setWspolrzedne(scan.nextInt(), scan.nextInt());
        umieszczenie(drugi.getX(),drugi.getY(),drugi.getNumer());
        wyswietlenieTablicy();
        sprawdzenie();
        x++;
        } //wlasciwy przebieg gry
        
    }
    
    public void umieszczenie(int x, int y, int z) {
            if (tablica[x][y]==0) {
                tablica[x][y]=z;
            }
            else {
                System.out.println("Na tym polu nie możesz postawic znaku, sprobuj jeszcze raz");
            }
    } // metoda umieszczajaca ruch gracza na planszy
    
        public static void wyswietlenieTablicy() {
        for (int[] tablica1 : tablica) {
            for (int j = 0; j < tablica1.length; j++) {
                System.out.print(tablica1[j]);
                }
            System.out.println();
            }
        } 
        
        
        public void sprawdzenie() {
        int b=0;
        while (b<3) {
            if (tablica[b][0]==tablica[b][1] && tablica[b][1]==tablica[b][2] && tablica[b][2]!=0) {
                zwyciestwo(tablica[b][2]);
                System.exit(0);
            }
            if (tablica[0][b]==tablica[1][b] && tablica[1][b]==tablica[2][b] && tablica[2][b]!=0) {
                zwyciestwo(tablica[2][b]);
                System.exit(0);
            }
            b++;  
        }
            if (tablica[0][0]==tablica[1][1] && tablica[1][1]==tablica[2][2] && tablica[1][1]!=0) {
                zwyciestwo(tablica[1][1]);
                System.exit(0);
            }
            if (tablica[0][2]==tablica[1][1] && tablica[1][1]==tablica[2][0] && tablica[1][1]!=0) {
                zwyciestwo(tablica[1][1]);
                System.exit(0);
            }
            if (tablica[0][0]!=0 && tablica[0][1]!=0 && tablica[0][2]!=0 &&
                tablica[1][0]!=0 && tablica[1][1]!=0 && tablica[1][2]!=0 &&
                tablica[2][0]!=0 && tablica[2][1]!=0 && tablica[2][2]!=0) {
                System.out.println("REMIS!!");
                System.exit(0);
            }
    }
         
    public void zwyciestwo (int x) {
        
        if (x==1) {
            System.out.println("Gratulacje, wygrywa " + pierwszy.getImie());
        }
        else {
            System.out.println("Gratulacje, wygrywa " + drugi.getImie());
    }
}
}