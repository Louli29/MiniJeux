package player;

import grid.Grille;

public class Joueur{

    private String name;

    public Joueur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer[] getPlayables() {
        return new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public void remplirGrille(int ligneMeilleureCase, int colonneMeilleureCase, int chiffre, Grille g){
        g.grille[ligneMeilleureCase][colonneMeilleureCase]=chiffre;
    }
    
    
}