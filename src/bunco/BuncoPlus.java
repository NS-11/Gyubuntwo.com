package bunco;

import cadriciel.*;

/**
 * Bunco+ : Variante du jeu de dés qui se joue en 6 tours avec 3 dés de 6 faces.
 * @author Emilie Lu et Edouard Laforge
 */

public class BuncoPlus extends Jeu{

    // Constantes spécifiques au jeu Bunco+
    private static final int NOMBRE_TOURS = 6;
    private static final int NOMBRE_DES = 3;
    private static final int NOMBRE_FACES = 6;


    /**
     * Constructeur: Initialiser le jeu spécifiquement à BuncoPlus
     */
    public BuncoPlus(int nbJoueur) {

        this.nombreDes = NOMBRE_DES;
        this.nombreTours = NOMBRE_TOURS;
        this.nombreFacesDe = NOMBRE_FACES;
        this.nombreJoueurs = nbJoueur;
        setStrategie(new StrategieBunco());

        this.des = Fabrique.genererDes(nombreDes, nombreFacesDe);
        this.joueurs = Fabrique.genererJoueur(nombreJoueurs);

    }

    @Override
    public void setStrategie(IStrategie strategie) {
        this.strategie = new StrategieBunco();
    }

    @Override
    public int calculerScoreTour() {
        return this.strategie.calculerScoreTour(this.tourEnCours, this.des);
    }

    @Override
    public Joueur calculerLeVainqueur() {
        return this.strategie.calculerLeVainqueur(this.joueurs);
    }

}
