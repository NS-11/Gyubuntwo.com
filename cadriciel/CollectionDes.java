package cadriciel;

/**
 * Classe représentant l'ensemble des dés d'un jeu.
 */
public class CollectionDes {

    /*
     * Attributs
     */

    private De[] des;
    private int index;



    /*
     * Constructeur
     */

    public CollectionDes(){}



    /*
     * Accesseurs
     */

    public De[] getDes() {
        return des;
    }

    public int getIndex() {
        return index;
    }



    /*
     * Mutateurs
     */

    public void setDes(De[] des) {
        this.des = des;
    }

    public void setIndex(int index) {
        this.index = index;
    }



    /*
     * Méthodes
     */

    /**
     * Ajoute un dé à la collection (tableau) de dés.
     * @param de le dé ajouté
     */
    public void ajouterDe(De de){

        des[index] = de;
        index++;
    }

    /**
     * Cré un itérateur de dé.
     * @return l'itérateur de dé
     */
    public IterateurDe creerIterateur(){
        return new IterateurDe(des);
    }
}
