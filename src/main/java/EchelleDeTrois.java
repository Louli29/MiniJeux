
import java.util.Arrays;
import java.util.Random;

public class EchelleDeTrois {

    Grille grille;
    Joueur j1;
    Joueur j2;
    int[] listeChiffre = new int[9];
    int obj;
    Random rd = new Random();
    Joueur[] ordre = new Joueur[2];

    public EchelleDeTrois() {
        this.grille = new Grille();
        this.j1 = new Joueur();
        this.j2 = new Joueur();
        this.ordre = choisirOrdreJoueur();
        for (int i = 0; i < listeChiffre.length; i++) {
            this.listeChiffre[i] = i + 1;
        }
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

    public boolean validerSequence(int[] sequence) {
        // Exclure le 0
        if (sequence[0] == 0 || sequence[1] == 0 || sequence[2] == 0) {
            return false;
        }
        // Séquence ascendante
        if (sequence[0] < sequence[1] && sequence[1] < sequence[2]) {
            return true;
            // Séquence descendante
        } else if (sequence[0] > sequence[1] && sequence[1] > sequence[2]) {
            return true;
        }
        return false;
    }

    public boolean gagner() {
        for (int i = 0; i < 3; i++) {
            if (validerSequence(grille.getLigne(i))) {
                System.out.println("La ligne " + (i + 1) + " contient une séquence valide.");
                return true;
            }
            if (validerSequence(grille.getColonne(i))) {
                System.out.println("La colonne " + (i + 1) + " contient une séquence valide.");
                return true;
            }
        }
        if (validerSequence(grille.getDiag1())) {
            System.out.println("La diagonale 1 contient une séquence valide.");
            return true;
        }
        if (validerSequence(grille.getDiag2())) {
            System.out.println("La diagonale 2 contient une séquence valide.");
            return true;
        }
        return false;
    }

    public void jouer(Joueur j) {
        grille.afficherGrille();
        int l;
        int c;
        System.out.println("Liste chiffres : " + Arrays.toString(listeChiffre));
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
                if (gagner()) {
                    grille.afficherGrille();
                    System.out.println("Liste chiffres : " + Arrays.toString(listeChiffre));
                    return;
                }
                i--;
                if (i == 0) {
                    grille.afficherGrille();
                    System.out.println("Liste chiffres : " + Arrays.toString(listeChiffre));
                    System.out.println("Match nul");
                    return;
                }

            }

        }
    }
}
