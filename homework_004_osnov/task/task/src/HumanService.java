import java.util.Collections;

public class HumanService<T extends Human> {
    private Tree<T> tree;

    public HumanService(Tree<T> tree) {
        this.tree = tree;
    }

    public void addTree(String family_status, String surname, String name_patronymic, String pol, int year_birth){
        Human human = new Human(family_status, surname, name_patronymic, pol, year_birth);
        tree.addHumanList((T) human);
    }

    public void sortByName(){
        Collections.sort(tree.getHumanList());
    }

    public void sortByYear(){
        Collections.sort(tree.getHumanList(), new HumanComparatorByYear());
    }

}
