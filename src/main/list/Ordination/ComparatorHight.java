package main.list.Ordination;

import java.util.Comparator;

public class ComparatorHight implements Comparator<People>{
    @Override
    public int compare(People p1, People p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}
