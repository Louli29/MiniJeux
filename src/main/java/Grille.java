public class Grille{
    int [][] grille;

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


    
}
