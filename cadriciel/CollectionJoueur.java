package cadriciel;


public class CollectionJoueur {

    private Joueur[] joueurs;
    private int index;

    public void ajouterJoueur(Joueur joueur){

        joueurs[index] = joueur;
        index++;
    }

    public IterateurJoueur creerIterateur(){
        return new IterateurJoueur(joueurs);
    }
}
