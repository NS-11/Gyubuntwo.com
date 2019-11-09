package cadriciel;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

/**
 * La classe Jeu + Methode Template
 * Squelette d'un jeu de dés indépendant des variantes.
 * @authors Émilie Lu et Edouard Laforge
 */
public abstract class Jeu {

    // Attributs de la classe Jeu
    protected int nombreTours;
    protected int nombreJoueurs;
    protected int nombreDes;
    protected int nombreFacesDe;
    protected int tourEnCours = 1;
    protected IStrategie strategie;
    protected CollectionDes des;
    protected CollectionJoueurs joueurs;

    /********************* MÉTHODE TEMPLATE ***********************
     * Création d'une partie de jeu incluant les joueurs et les dés.
     **************************************************************/

    /**
     * La méthode template qui définit les étapes de l'algorithme:
     * Création du jeu, des joueurs, des dés et choix de la stratégie.
     */
    public void jouerJeu() throws IOException {

        System.out.println("Appuyez sur ENTER pour commencer");
        System.in.read();

        while(tourEnCours <= nombreTours){

            System.out.println("Début de la ronde #"+ tourEnCours);

            for(int i = 0; i < joueurs.getTaille(); i++){

                jouerTour(i);

            }

            tourEnCours++;

        }

       afficherVainqueur();

    }

    public Jeu(){

    }


    public void setStrategie(IStrategie strategie){

        this.strategie = strategie;

    }


    /**
     * Calcul le score à chaque tour pour un joueur selon la stratégie
     */
    public abstract int calculerScoreTour();

    /**
     * Calcul le vainqueur du jeu par comparaison des différents scores selon
     * la stratégie. Le vainqueur est celui qui a le plus de points.
     * @return leVainqueur Le gagnant du jeu
     */
    public abstract Joueur calculerLeVainqueur();

    public void jouerTour(int numeroJoueur) throws IOException {

        System.out.print("Au tour à : joueur #" + (numeroJoueur +1));

        do{

            System.out.println("\nAppuyer sur ENTER pour rouler les dés");
            System.in.read();
            System.out.println("Vous avez obtenu :");
            roulerDes();

            for(int j = 0; j < des.getTaille() ; j++){

                System.out.print(des.get(j).getFaceSuperieure() + " ");

            }

            System.out.print("Vous avez fait: " + calculerScoreTour() + " point(s) ");
            joueurs.get(numeroJoueur).setPoints(joueurs.get(numeroJoueur).getPoints() + calculerScoreTour());
            System.out.print("TOTAL: " + joueurs.get(numeroJoueur).getPoints() + " point(s)");


        }while(calculerScoreTour() != 0);



        System.out.println("\nAppuyez sur ENTER pour passer au prochain joueur");
        System.in.read();

    }

    public void afficherVainqueur(){

        System.out.println("GAME OVER!!!\nLe score final est: ");

        for(int i = 0; i < joueurs.getTaille(); i++){

            System.out.println("Joueur #" + (i+1) + ": " + joueurs.get(i).getPoints());

        }

        System.out.println("Le gagnant est le joueur #" + calculerLeVainqueur().getId());

    }

    //GETTERS
    public CollectionJoueurs getJoueurs(){
        return joueurs;
    }
    public CollectionDes getDes(){
        return des;
    }

    public int getTourEnCours(){
        return tourEnCours;
    }

    // SETTERS
    public void setTourEnCours(int tourEnCours){
        this.tourEnCours = tourEnCours;
    }

    public void roulerDes(){

        Random r = new Random();
        int min = 1;
        int max = nombreFacesDe;

        for(int i = 0; i < des.getTaille(); i++){

            des.get(i).setFaceSuperieure(r.nextInt((max - min) + 1 ) + min);

        }

    }

}