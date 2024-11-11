
public abstract class Joueur{
     
    public void remplirGrille(int ligneMeilleureCase, int colonneMeilleureCase, int chiffre, Grille g){
        g.grille[ligneMeilleureCase][colonneMeilleureCase]=chiffre;
    }
    
    abstract int trouveMeilleurLigne(Grille g, int chiffre);
    abstract int trouveMeilleurColonne(Grille g, int chiffre);
}