
public class BeatsAtteindreTrois{
    public static boolean victoirLigne(Grille g, int ligne){
        return g.sommeLigne(ligne)==3;
    }
    public static boolean victoirColonne(int colonne, Grille g){
        return g.sommeColonne(colonne)==3;
    }
    public static boolean victoirDiage1(Grille g){
        
        return g.sommeDiag1()==3;
    }
    public static boolean victoirDiage2(Grille g){
        return g.sommeDiag2()==3;
    }
    
}