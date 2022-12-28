public class HumanService {
    private Tree tree;

    public HumanService(Tree tree) {
        this.tree = tree;
    }

    public void addTree(String family_status, String surname, String name_patronymic, String pol, int year_birth){
        Human human = new Human(family_status, surname, name_patronymic, pol, year_birth);
        tree.addHumanList(human);
    }
}
