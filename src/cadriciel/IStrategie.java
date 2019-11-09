package cadriciel;

/**
 * Interface pour les stratégies de Jeu.
 */
public interface IStrategie {

    public Joueur calculerLeVainqueur(CollectionJoueurs joueurs);
    public int calculerScoreTour(int nbTour, CollectionDes des);
}