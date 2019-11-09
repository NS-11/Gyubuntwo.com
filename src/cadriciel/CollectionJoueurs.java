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
    private int taille;

    public CollectionJoueurs(int taille){

        joueurs = new Joueur[taille];
        this.taille = taille;


    }

    /*
     * Accesseurs
     */

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public Joueur get(int i){

        return joueurs[i];

    }

    public int getIndex() {
        return index;
    }

    public int getTaille(){
        return taille;
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