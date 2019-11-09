package cadriciel;

import java.util.Iterator;

/**
 * Classe représentant l'itérateur de dé, implémente Iterator.
 */
public class IterateurJoueur implements Iterator {

    /*
     * Attributs
     */

    private Joueur[] joueurs;
    private int position;



    /*
     * Constrcuteur
     */

    public IterateurJoueur(Joueur[] joueurs){
        this.joueurs = joueurs;
    }



    /*
     * Accesseurs
     */

    public Joueur[] getJoueurs() {
        return joueurs;
    }

    public int getPosition() {
        return position;
    }



    /*
     * Mutateurs
     */

    public void setJoueurs(Joueur[] joueurs) {
        this.joueurs = joueurs;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    /*
     * Méthodes
     */

    /**
     * Détermine si le joueur a un à un joueur qui le suit dans le tableau.
     * @return true si le joueur en précède un autre et false si ce n'est pas le
     *         cas
     */
    @Override
    public boolean hasNext() {

        if(position >= joueurs.length || joueurs[position] == null){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Renvoie le prochain joueur du tableau.
     * @return le prochain joueur du tableau
     */
    @Override
    public Object next() {

        Joueur joueur = joueurs[position];
        position++;

        return joueur;
    }
}
