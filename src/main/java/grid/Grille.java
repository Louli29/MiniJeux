package grid;
import java.util.Arrays;

public class Grille{
    public int [][] grille;

    public Grille(){
        this.grille= new int[3][3];
    }

    public int sommeLigne(int ligne){
        return grille[ligne][0]+grille[ligne][1]+grille[ligne][2];

    }

    public int sommeColonne(int colonne){
        return grille[0][colonne]+grille[1][colonne]+grille[2][colonne];
    }

    public int sommeDiag1(){
        return grille[0][0]+grille[1][1]+grille[2][2];
    }

    public int sommeDiag2(){
        return grille[0][2]+grille[1][1]+grille[2][0];
    }

    public void afficherGrille(){
        System.out.println(Arrays.toString(grille[0]));
        System.out.println(Arrays.toString(grille[1]));
        System.out.println(Arrays.toString(grille[2]));
    }

    public int[] getLigne(int i) {
        return new int[]{grille[i][0], grille[i][1], grille[i][2]};
    }
    
    public int[] getColonne(int i) {
        return new int[]{grille[0][i], grille[1][i], grille[2][i]};
    }
    
    public int[] getDiag1() {
        return new int[]{grille[0][0], grille[1][1], grille[2][2]};
    }
    
    public int[] getDiag2() {
        return new int[]{grille[0][2], grille[1][1], grille[2][0]};
    }
    


    
}
