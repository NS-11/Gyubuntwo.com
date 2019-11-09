package cadriciel;


/**
 * Classe représentant l'ensemble des joueurs d'un jeu.
 */
public class CollectionJoueurs {

    /*
     * Attributs
     */

    private Joueur[] joueurs;
    private int index;



    /*
     * Constructeur
     */

    public CollectionJoueurs(){}



    /*
     * Accesseurs
     */

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public int getIndex() {
        return index;
    }



    /*
     * Mutateurs
     */

    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }

    public void setIndex(int index) {
        this.index = index;
    }



    /*
     * Méthodes
     */

    /**
     * Ajoute un joueur à la collection (tableau) de joueurs.
     * @param joueur le joueur ajouté
     */
    public void ajouterJoueur(Joueur joueur){

        joueurs[index] = joueur;
        index++;
    }

    /**
     * Cré un itérateur de joueur.
     * @return l'itérateur de joueur
     */
    public IterateurJoueur creerIterateur(){
        return new IterateurJoueur(joueurs);
    }
}
