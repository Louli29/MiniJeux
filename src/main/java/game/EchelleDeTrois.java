package game;



public class EchelleDeTrois extends Game {

    public EchelleDeTrois() {
        super();
        super.jouerPartie();
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

   
}
