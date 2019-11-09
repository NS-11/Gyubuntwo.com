package cadriciel;

import bunco.BuncoPlus;

/**
 * Classe qui sert à l'instantiation des composantes de la partie, soit les dés,
 * les joueurs et le jeu.
 */
public class Fabrique {

    /**
     * Instancie les dés.
     * @param nombreDes le nombre de dés nécessaire au jeu
     * @param nombreDeFaces le nombre de faces des dés du jeu
     * @return la collection de dés comprenant les dés instanciés
     */
    public static CollectionDes genererDes(int nombreDes, int nombreDeFaces){

        CollectionDes collectionDes = new CollectionDes(nombreDes);

        for(int i = 0; i < nombreDes; i++){

            De de = new De(nombreDeFaces);
            collectionDes.ajouterDe(de);
        }
        return collectionDes;
    }

    /**
     * Instancie les joueurs.
     * @param nombreJoueurs le nombre de joueurs qui jouent au jeu
     * @return la collection de joueurs comprenant les joueurs instanciés
     */
    public static CollectionJoueurs genererJoueur(int nombreJoueurs){

        CollectionJoueurs collectionJoueurs = new CollectionJoueurs(nombreJoueurs);

        for(int i = 0; i < nombreJoueurs; i++){

            Joueur joueur = new Joueur(i + 1);
            collectionJoueurs.ajouterJoueur(joueur);
        }

        return collectionJoueurs;
    }

    /**
     * Instancie le jeu.
     * @return l'instance de Jeu
     */
    public static Jeu genererJeu(int choix, int nbJoueur){

        Jeu jeu = null;

        switch(choix){

            case 1 :
                jeu = new BuncoPlus(nbJoueur);

        }

        return jeu;
    }
}