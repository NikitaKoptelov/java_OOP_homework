import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree<T> implements Iterable<T> {
    private List<T> humanList;
    private FailHandler failHandler = new FailHandler();

    public Tree(List<T> humanList) {
        this.humanList = humanList;
    }

    public Tree(){
        this(new ArrayList<>());
    }

    public List<T> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<T> humanList) {
        this.humanList = humanList;
    }

    public void addHumanList(T human){
        humanList.add(human);
    }

    public void save() {
        failHandler.seve(humanList);
    }

    public Object read(){
        Object object = new Object();
        object = failHandler.read();
        return object;
    }

    @Override
    public Iterator<T> iterator(){
        return new TreeIterator<T>(humanList);
    }




}
