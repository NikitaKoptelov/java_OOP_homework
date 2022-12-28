import java.util.ArrayList;
import java.util.List;

public class Tree{
    private List<Humon> humonList;

    public Tree(List<Humon> humonList){
        this.humonList = humonList;
    }

    public Tree(){
        this(new ArrayList<>());
    }

    public List<Humon> getHumonList(){
        return humonList;
    }

    public void setHumonList(List<Humon> humonList){
        this.humonList = humonList;
    }

    public void addHumonList(Humon humon){
        humonList.add(humon);
    }

    public List<Humon> getHumonFiltr(String familiu){
        List<Humon> res = new ArrayList<>();
        for(Humon humon: humonList){
            if(humon.getfamiliu().equalsIgnoreCase(familiu)){
                res.add(humon);
            }
            if(humon.getpol().equalsIgnoreCase("жен")){
                if(humon.getfamiliu().length()>=familiu.length()){
                    String f = humon.getfamiliu().substring(0, familiu.length());
                    if(f.equalsIgnoreCase(familiu)){
                        res.add(humon);
                    }
    
                }
                // if(humon.getfamiliuDevich().length()>=familiu.length()){
                //     Gena gena.ge
                // }
            }
        }

        return res;
    }

}