package game;

public class AtteindreX extends Game{

    int obj;

    public AtteindreX(int objectif) {
        super();
        obj=objectif;
        
        super.jouerPartie();

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



}
