import java.util.Comparator;

public class HumanComparatorByYear implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2){
        return Integer.compare(o1.getYear_birth(), o2.getYear_birth());
    }
}
