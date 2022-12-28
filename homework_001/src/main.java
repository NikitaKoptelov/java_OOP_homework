public class main{
    public static void main(String[] args) {
        Tree tree = new Tree();
        Humon humon1 = new Humon("Колбин", "Виктор Петрович", "муж", 1956);
        Humon humon2 = new Humon("Колбин", "Иван Викторович", "муж", 1986);
        Humon humon3 = new Humon("Колбин", "Александр Викторович", "муж", 1985);
        Humon humon4 = new Humon("Колбин", "Валерий Викторович", "муж", 1983);
        Humon humon5 = new Humon("Колбин", "Дмитрий Викторович", "муж", 1980);
        Humon humon6 = new Gena("Колбина", "Флегонтова", "Маргарита Викторовна", "жен", 1960);
        Humon humon7 = new Humon("Колбин", "Петр Степанович", "муж", 1920);
        Humon humon8 = new Gena("Колбина", "Лобастова", "Надежда Александрована", "жен", 1920);
        Humon humon9 = new Humon("Флегонтов", "Виктор Тимофеевич", "муж", 1937);
        Humon humon10 = new Gena("Флегонтовна", "Примак", "Вера Степановна", "жен", 1937);
        tree.addHumonList(humon1);
        tree.addHumonList(humon2);
        tree.addHumonList(humon3);
        tree.addHumonList(humon4);
        tree.addHumonList(humon5);
        tree.addHumonList(humon6);
        tree.addHumonList(humon7);
        tree.addHumonList(humon8);
        tree.addHumonList(humon9);
        tree.addHumonList(humon10);

        System.out.println(tree.getHumonList());
        System.out.println("\n");
        System.out.println(tree.getHumonFiltr("Колбин"));
        System.out.println("\n");
        System.out.println(tree.getHumonFiltr("Флегонтов"));

    }
}