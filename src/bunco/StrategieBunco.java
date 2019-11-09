package bunco;

import cadriciel.*;

public class StrategieBunco implements IStrategie {

    /** Calcul celui qui a gagné la partie à partir du nombre de points
     * @param joueurs La collection des joueurs qui jouent à Bunco+
     * @return Le vainqueur de la partie
     */
    @Override
    public Joueur calculerLeVainqueur(CollectionJoueurs joueurs) {

        Joueur vainqueur = joueurs.get(0);

        for(int i = 1; i < joueurs.getTaille(); i++){

            if(vainqueur.compareTo(joueurs.get(i)) == -1){

                vainqueur = joueurs.get(i);

            }

        }

        return vainqueur;

    }

    @Override
    public int calculerScoreTour(int nbTour, CollectionDes des) {

        int score = 0;
        int nbDes = nbDesIdentiques(des, nbTour);

        if(nbDes == 3){

            score += 21;

        }else if(nbDes > 0 && nbDes < 3){

            score += nbDes;

        }else if(desSimilaires(des)){

            score += 5;

        }

        return score;

    }

    /**
     * Vérifie si tous les dés dans la liste sont identiques
     * @param des liste des dés
     * @return vrai ou faux dépendemment de la liste
     */
    public boolean desSimilaires(CollectionDes des){

        boolean similaire = true;
        int valeurDe = des.get(0).getFaceSuperieure();

        for(int i = 1; i < des.getTaille() && similaire; i++){

            if(valeurDe != des.get(i).getFaceSuperieure())
                similaire = false;

        }

        return similaire;

    }

    /**
     * Renvoit le nombre de dés qui dont leur valeur est identique au nombre de tour
     * @param des La liste des dés
     * @param nbTour  Tour auquelle les joueurs sont rendu
     * @return
     */
    public int nbDesIdentiques(CollectionDes des, int nbTour){

        int nbSimilaire = 0;

        for(int i = 0; i < des.getTaille(); i++){

            if(des.get(i).getFaceSuperieure() == nbTour){

                nbSimilaire++;

            }

        }

        return nbSimilaire;

    }

}
