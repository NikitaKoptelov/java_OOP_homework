import java.util.Iterator;
import java.util.List;

public class TreeIterator<T> implements Iterator<T> {
    private  List<T> humanList;
    private int index;

    public TreeIterator(List<T> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext(){
        return index < humanList.size();
    }

    @Override
    public T next(){
        return humanList.get(index++);
    }
}
