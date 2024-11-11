import java.util.Random;

public class JoueurB extends Joueur{
    int[] chiffreJoueurB = {-1,1,-1,1,-1};

    @Override
    int trouveMeilleurLigne(Grille g, int chiffre){
       int meilleurLigne =0;
       for(int i =0; i<3;i++){
           for(int j =0; j<3;j++){
               if(g.grille[i][j]==0){
                if (g.sommeLigne(i)==1 && chiffre==-1){
                    meilleurLigne=i;
                }
                if(g.sommeLigne(i)<=0){
                    meilleurLigne=i;
                }
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
                    if (g.sommeColonne(j)==1 && chiffre==-1){
                        meilleurColonne=j;
                     
                    }
                    if(g.sommeColonne(j)<=0){
                        meilleurColonne=j;
                     
                    }
                    if(g.sommeColonne(j)==2 && chiffre==1){
                        meilleurColonne=j;
                      
                     }
                }
                
            }
        }
      
    return meilleurColonne;
    }
}