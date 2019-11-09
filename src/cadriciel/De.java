package cadriciel;

/**
 * Classe représentant un dé, implémente Comparable.
 */
public class De implements Comparable{

    /*
     * Attributs
     */

    private int nombreDeFaces;
    private int faceSuperieure;




    /*
     * Constructeur
     */

    public De (int nombreDeFaces){

        this.nombreDeFaces = nombreDeFaces;
    }



    /*
     * Accesseur
     */

    public int getNombreDeFaces() {
        return nombreDeFaces;
    }

    public int getFaceSuperieure() {
        return faceSuperieure;
    }



    /*
     * Mutateur
     */

    public void setNombreDeFaces(int nombreDeFaces) {
        this.nombreDeFaces = nombreDeFaces;
    }

    public void setFaceSuperieure(int faceSuperieure) {

        if (faceSuperieure >= 1 && faceSuperieure <= this.nombreDeFaces) {
            this.faceSuperieure = faceSuperieure;
        }
    }



    /*
     * Méthode
     */

    /**
     * Compare la face supérieure de deux dés.
     * @param o le deuxième dé avec lequel le premier dé sera comparé
     * @return un nombre qui dicte l'état de la comparaison :
     *         0 si les deux faces sont équivalentes;
     *         1 si la face du premier dé est supérieure au second;
     *         -1 si la face du premier dé est inférieure au second.
     *
     */
    @Override
    public int compareTo(Object o){

        De de = (De) o;
        return Integer.compare(this.faceSuperieure, de.faceSuperieure);
    }
}