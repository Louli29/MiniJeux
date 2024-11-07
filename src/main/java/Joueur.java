
public class Joueur{
    

    public void remplirGrille(int ligneMeilleureCase, int colonneMeilleureCase, int chiffre, Grille g){
        g.grille[ligneMeilleureCase][colonneMeilleureCase]=chiffre;
    }
    
    public int trouveMeilleurLigne(Grille g, int chiffre){
        int meilleurLigne =0;
        for(int i =0; i<3;i++){
            for(int j =0; j<3;j++){
                if(g.grille[i][j]==0){
                    if(g.sommeLigne(i)==2){
                        meilleurLigne = i;
                    }
                }
              
            }
                

        }
        return meilleurLigne;
    }
}