
import java.util.Arrays;
import java.util.Random;

public class AtteindreX {

    Grille grille;
    Joueur j1;
    Joueur j2;
    int[] listeChiffre = new int[9];
    int obj;
    Random rd = new Random();
    Joueur[] ordre = new Joueur[2];

    public AtteindreX(int objectif) {
        this.obj = objectif;
        this.grille = new Grille();
        this.j1 = new Joueur();
        this.j2 = new Joueur();
        this.ordre = choisirOrdreJoueur();
        for (int i = 0; i < listeChiffre.length; i++) {
            this.listeChiffre[i] = i + 1;
        }

        // System.out.println(choisirChiffreAl());
        jouerPartie();

    }

    public Joueur[] choisirOrdreJoueur() {
        Joueur[] ordreJ = new Joueur[2];
        int n = rd.nextInt(2);
        ordreJ[0] = n == 0 ? j1 : j2;
        ordreJ[1] = ordreJ[0].equals(j1) ? j2 : j1;
        return ordreJ;

    }

    public int choisirCaseAl() {
        return rd.nextInt(3);
    }

    public int choisirChiffreAl() {
        int ch;
        do {
            ch = rd.nextInt(listeChiffre.length) + 1;
        } while (listeChiffre[ch - 1] == 0);
        listeChiffre[ch - 1] = 0;
        return ch;
    }

    public boolean gagner() {
        for (int i = 0; i < 3; i++) {
            if (grille.sommeLigne(i) == obj) {
                System.out.println("Bravo ! La somme de la ligne  " + (i+1) + " est égale à " + obj);
                return true;
            } else if (grille.sommeColonne(i) == obj) {
                System.out.println("Bravo ! La somme de la colonne  " + (i+1) + " est égale à " + obj);
                return true;
            }
        }
        if (grille.sommeDiag1() == obj) {
            System.out.println("Bravo ! La somme de la diagonale 1 est égale à " + obj);
            return true;
        } else if (grille.sommeDiag2() == obj) {
            System.out.println("Bravo ! La somme de la diagonale 2 est égale à " + obj);
            return true;
        }
        return false;
    }

    public void jouer(Joueur j) {
        grille.afficherGrille();
        int l;
        int c;
        System.out.println(Arrays.toString(listeChiffre));
        do {
            l = choisirCaseAl();
            c = choisirCaseAl();
        } while (grille.grille[l][c] != 0);

        j.remplirGrille(l, c, choisirChiffreAl(), grille);
    }

    public void jouerPartie() {
        int i = 9;
        while (i > 0) {
            for (Joueur j : ordre) {
                jouer(j);
                if (gagner() || (i == 0)) {
                    break;
                }
                i--;
            }

        }
        if (i == 0) {
            System.out.println("Match nul");
        }

    }

}
