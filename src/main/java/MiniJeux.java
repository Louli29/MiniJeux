import java.util.Arrays;

public class MiniJeux {

    public static void main(String ...args){
        Grille test = new Grille();
        test.grille[0][1]=1;
        test.grille[0][2]=2;
        System.err.println(Arrays.toString(test.grille[0])+" La somme ligne "+test.sommeLigne(0));
    }
}