package cadriciel;

public class CollectionDes {

    private De[] des;
    private int index;

    public void ajouterDe(De de){

        des[index] = de;
        index++;
    }

    public IterateurDe creerIterateur(){
        return new IterateurDe(des);
    }
}
