package cadriciel;

import java.util.Iterator;

public class IterateurJoueur implements Iterator {

    private int position;
    private Joueur[] joueurs;

    public IterateurJoueur(Joueur[] joueurs){
        this.joueurs = joueurs;
    }

    @Override
    public boolean hasNext() {

        if(position >= joueurs.length || joueurs[position] == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {

        Joueur joueur = joueurs[position];
        position++;

        return joueur;
    }
}
