package cadriciel;

/**
 * Classe représentant un joueur, implémente Comparable.
 */
public class Joueur implements Comparable {

    /*
     * Attribut
     */
    private int points;



    /*
     * Accesseur
     */
    public int getPoints() {
        return points;
    }



    /*
     * Mutateur
     */
    public void setPoints(int points) {
        this.points = points;
    }



    /*
     * Méthode
     */

    /**
     * Compare le nombre de points de deux joueurs.
     * @param o le deuxième joueur avec lequel le premier joueur sera comparé
     * @return un nombre qui dicte l'état de la comparaison :
     *         0 si les points des deux joueurs sont équivalents;
     *         1 si les points du premier joueur sont supérieurs au second;
     *         -1 si les points du premier joueur sont inférieurs au second.
     *
     */
    @Override
    public int compareTo(Object o){

        Joueur joueur = (Joueur) o;
        return Integer.compare(this.points, joueur.points);
    }
}
