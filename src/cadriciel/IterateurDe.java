package cadriciel;

import java.util.Iterator;

/**
 * Classe représentant l'itérateur de dé, implémente Iterator.
 */
public class IterateurDe implements Iterator {

    /*
     * Attributs
     */

    private De[] des;
    private int position;



    /*
     * Constructeur
     */

    public IterateurDe(De[] des){
        this.des = des;
    }



    /*
     * Accesseurs
     */

    public De[] getDes() {
        return des;
    }

    public int getPosition() {
        return position;
    }



    /*
     * Mutateurs
     */

    public void setDes(De[] des) {
        this.des = des;
    }

    public void setPosition(int position) {
        this.position = position;
    }



    /*
     * Méthodes
     */

    /**
     * Détermine si le dé a un à un dé qui le suit dans le tableau.
     * @return true si le dé en précède un autre et false si ce n'est pas le
     *         cas
     */
    @Override
    public boolean hasNext() {

        if(position >= des.length || des[position] == null){
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Renvoie le prochain dé du tableau.
     * @return le prochain dé du tableau
     */
    @Override
    public Object next() {

        position++;
        De de = des[position];

        return de;
    }
}