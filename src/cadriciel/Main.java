package cadriciel;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Veuillez choisir un jeu: \n" +
                "1- BUNCO+ \n" +
                "2- Call of Duty");

        int choix = myScan.nextInt();

        System.out.println("Combien de joueur (entre 1 et 6)");
        int nbJoueur = myScan.nextInt();

        Jeu jeu = Fabrique.genererJeu(choix, nbJoueur);
        jeu.jouerJeu();



    }

}
