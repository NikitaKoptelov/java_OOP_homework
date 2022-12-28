import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tree implements Serializable {
    private List<Human> humanList;

//    Writable writable;

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

//    public void setWritable(Writable writable){
//        this.writable = writable;
//    }

//    public void save(){
//        writable.save(this);
//    }

}
