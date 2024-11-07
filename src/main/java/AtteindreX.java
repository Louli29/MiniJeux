import java.sql.Array;
import java.util.Arrays;

public class AtteindreX {

    Grille grille;
    Joueur j1;
    Joueur j2;
    int[] listeChiffre = new int[9];
    int obj;

    public AtteindreX(int objectif) {
        this.obj=objectif;
        this.grille = new Grille();
        this.j1 = new Joueur();
        this.j2 = new Joueur();
        for (int i = 0; i < listeChiffre.length; i++) {
            this.listeChiffre[i]=i+1;
        }

        System.out.println(Arrays.toString(listeChiffre));
        
    }



}