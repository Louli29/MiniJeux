import java.util.Random;

public class JoueurA extends Joueur{
    int[] chiffreJoeurA = {1,-1,1,-1,1};
    
 @Override
     int trouveMeilleurLigne(Grille g, int chiffre){
        int meilleurLigne =0;
        for(int i =0; i<3;i++){
            for(int j =0; j<3;j++){
                if(g.grille[i][j]==0){
                   meilleurLigne=i;
                   if(g.sommeLigne(i)==2 && chiffre==1){
                    meilleurLigne=i;
                    break;
                 }
                } 
            }
        }
    return meilleurLigne;
    }

    public int trouveMeilleurColonne(Grille g, int chiffre){
        int meilleurColonne =0;
        for(int i =0; i<3;i++){
            for(int j =0; j<3;j++){
                if(g.grille[i][j]==0){
                    meilleurColonne=j;
                    if(g.sommeLigne(j)==2 && chiffre==1){
                        meilleurColonne=j;
                        break;
                     }
                }
            }
        }
    return meilleurColonne;
    }

}