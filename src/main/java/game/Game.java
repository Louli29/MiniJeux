package game;

import java.util.Arrays;
import java.util.Random;

import grid.Grille;
import player.Joueur;

public class Game {
    Grille grille;
    Joueur j1;
    Joueur j2;
    int[] listeChiffre = new int[9];
    Random rd = new Random();
    Joueur[] ordre = new Joueur[2];


    public Game(){
        this.grille = new Grille();
        this.j1 = new Joueur("lou");
        this.j2 = new Joueur("adrien");
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

    public int choisirChiffreAl() {
        int ch;
        do {
            ch = rd.nextInt(listeChiffre.length) + 1;
        } while (listeChiffre[ch - 1] == 0);
        listeChiffre[ch - 1] = 0;
        return ch;
    }

    public int choisirCaseAl() {
        return rd.nextInt(3);
    }

    public boolean gagner(){
        return false;
    }

    public void jouerPartie(){
        int i = 9;
        while (i > 0) {
            for (Joueur j : ordre) {
                jouer(j);
                i--;
                if (gagner()) {
                    grille.afficherGrille();
                    return;
                }
                else if (i == 0) {
                    grille.afficherGrille();
                    System.out.println("Liste chiffres : " + Arrays.toString(listeChiffre));
                    System.out.println("Match nul");
                    return;
                }
                

            }

        }
    }



}
