package DataStructures.Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorImpl implements Iterator<Integer> {

    private Integer[] b;
    private int n;

    public IteratorImpl(Integer[] b) {
        this.b = b;
        n = -1;
        fixNext();
    }

    @Override
    public boolean hasNext() {
        return n < b.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {throw new NoSuchElementException();}
        return b[n];
    }

    private void fixNext() {
       n++;
       while ( hasNext() && b[n] % 2 == 1) n = n + 1;
    }
}
