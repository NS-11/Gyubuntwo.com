package test;

import bunco.BuncoPlus;
import bunco.StrategieBunco;
import cadriciel.*;
import  org.junit.*;
import static org.junit.Assert.assertEquals;

public class BuncoPlusTest {

    Jeu jeu = new BuncoPlus(5);
    StrategieBunco strategie = new StrategieBunco();


    @Test
    public void calculerVainqueurTest(){

        jeu.getJoueurs().get(0).setPoints(12);
        jeu.getJoueurs().get(1).setPoints(13);
        jeu.getJoueurs().get(2).setPoints(14);
        jeu.getJoueurs().get(3).setPoints(15);
        jeu.getJoueurs().get(4).setPoints(16);


        assertEquals("Test raté", 5,
                                             jeu.calculerLeVainqueur().getId());

    }

    @Test
    public void nbDesIdentiquesTest(){

        CollectionDes des = new CollectionDes(3);
        De de1 = new De(6);
        De de2 = new De(6);
        De de3 = new De(6);
        des.ajouterDe(de1);
        des.ajouterDe(de2);
        des.ajouterDe(de3);
        de1.setFaceSuperieure(2);
        de2.setFaceSuperieure(2);
        de3.setFaceSuperieure(3);

        // Le tour auquel on est rendu
        int tour = 2;

        assertEquals("Test raté", 2,
                                          strategie.nbDesIdentiques(des, tour));

    }

    public void desSimilairesTest(){

        CollectionDes des = new CollectionDes(3);
        De de1 = new De(6);
        De de2 = new De(6);
        De de3 = new De(6);
        des.ajouterDe(de1);
        des.ajouterDe(de2);
        des.ajouterDe(de3);
        de1.setFaceSuperieure(3);
        de2.setFaceSuperieure(3);
        de3.setFaceSuperieure(3);

    }

    @Test
    public void calculerScoreTourTest(){

        // TEST POUR 21 POINTS (3 DÉS ÉGAUX AU NOMBRE DE TOUR)
        CollectionDes des = new CollectionDes(3);
        De de1 = new De(6);
        De de2 = new De(6);
        De de3 = new De(6);
        des.ajouterDe(de1);
        des.ajouterDe(de2);
        des.ajouterDe(de3);
        de1.setFaceSuperieure(3);
        de2.setFaceSuperieure(3);
        de3.setFaceSuperieure(3);

        int tour = 3;

        assertEquals("Test raté", 21,
                                      strategie.calculerScoreTour(tour, des));

        // TEST POUR 5 POINTS (3 DÉS ÉGAUX MAIS DIFFÉRENT DU NOMBRE DE TOUR)
        de1.setFaceSuperieure(2);
        de2.setFaceSuperieure(2);
        de3.setFaceSuperieure(2);

        assertEquals("Test raté", 5,
                                        strategie.calculerScoreTour(tour, des));

        // TEST POUR 1 ou 2 POINTS
        de1.setFaceSuperieure(3);
        de2.setFaceSuperieure(3);
        de3.setFaceSuperieure(2);

        assertEquals("Test raté", 2,
                                        strategie.calculerScoreTour(tour, des));

    }

}
