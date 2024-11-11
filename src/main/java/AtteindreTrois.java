import java.util.Random;

public class AtteindreTrois{
    static void appelAtteindreTrois(){
        Grille test = new Grille();
        JoueurA playerA = new JoueurA();
        JoueurB playerB =new JoueurB();
        int indexA =0;
        int indexB=0;
        for(int i =0; i<10;i++){
        if(i%2==0){     
        System.out.println("Joueur A");
        int ligne =   playerA.trouveMeilleurLigne(test,playerA.chiffreJoeurA[indexA]);
        int colonne = playerA.trouveMeilleurColonne(test, playerA.chiffreJoeurA[indexA]);
        playerA.remplirGrille(ligne,colonne , playerA.chiffreJoeurA[indexA], test);
        indexA++;
        test.affichage();
        if(BeatsAtteindreTrois.victoirColonne(colonne, test)||BeatsAtteindreTrois.victoirLigne(test, ligne)||BeatsAtteindreTrois.victoirDiage1(test)||BeatsAtteindreTrois.victoirDiage2(test)){
            System.out.println("Joueur A remporte");
            test.affichage();
            break;
        }

    }
    else{     
        System.out.println("Joueur B");
        int ligne = playerB.trouveMeilleurLigne(test, playerB.chiffreJoueurB[indexB]);
        int colonne = playerB.trouveMeilleurColonne(test,playerB.chiffreJoueurB[indexB]);
        playerB.remplirGrille( ligne,colonne,playerB.chiffreJoueurB[indexB], test);
        indexB++;
        test.affichage();
        if(BeatsAtteindreTrois.victoirColonne(colonne, test)||BeatsAtteindreTrois.victoirLigne(test, ligne)||BeatsAtteindreTrois.victoirDiage1(test)||BeatsAtteindreTrois.victoirDiage2(test)){
            test.affichage();
            System.out.println("Joueur B remporte");
            break;
        }
    }
    
   }
        
    }
    
   

    //A tour de role les joeur on le 1 puis le -1
}