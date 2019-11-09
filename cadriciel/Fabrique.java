package cadriciel;

/**
 * Classe qui sert à l'instantiation des composantes de la partie, soit les dés,
 * les joueurs et le jeu.
 */
public class Fabrique {

    /*
     * Méthodes
     */

    /**
     * Instancie les dés.
     * @param nombreDes le nombre de dés nécessaire au jeu
     * @param nombreDeFaces le nombre de faces des dés du jeu
     * @return la collection de dés comprenant les dés instanciés
     */
    public CollectionDes genererDes(int nombreDes, int nombreDeFaces){

        CollectionDes collectionDes = new CollectionDes();

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
    public CollectionJoueurs genererJoueur(int nombreJoueurs){

        CollectionJoueurs collectionJoueurs = new CollectionJoueurs();

        for(int i = 0; i < nombreJoueurs; i++){

            Joueur joueur = new Joueur();
            collectionJoueurs.ajouterJoueur(joueur);
        }
        return collectionJoueurs;
    }

    /**
     * Instancie le jeu.
     * @param nomJeu le nom du jeu
     * @return l'instance de Jeu
     */
    public Jeu genererJeu(String nomJeu){

        return new Jeu(nomJeu);
    }
}
