package cadriciel;

import java.util.Iterator;

public class IterateurDe implements Iterator {

    private int position;
    private De[] des;

    public IterateurDe(De[] des){
        this.des = des;
    }

    @Override
    public boolean hasNext() {

        if(position >= des.length || des[position] == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {

        De de = des[position];
        position++;

        return de;
    }
}
