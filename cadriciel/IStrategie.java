package cadriciel;

/**
 * Interface pour les stratégies de Jeu.
 */
public interface IStrategie {

    public void calculerLeVainqueur(Jeu jeu);
    public void calculerScoreTour(Jeu jeu);
}
