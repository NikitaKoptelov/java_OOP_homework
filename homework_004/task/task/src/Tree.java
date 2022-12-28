import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree implements Iterable<Human> {
    private List<Human> humanList;
    private FailHandler failHandler = new FailHandler();

    public Tree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public Tree(){
        this(new ArrayList<>());
    }

    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public void addHumanList(Human human){
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
    public Iterator<Human> iterator(){
        return new TreeIterator(humanList);
    }

}
