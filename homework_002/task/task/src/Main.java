import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Tree tree = new Tree();
        HumanService humanService = new HumanService(tree);

        humanService.addTree("Отец", "Колбин", "Виктор Петрович", "муж", 1956);
        humanService.addTree("Сын_брат", "Колбин", "Иван Викторович", "муж", 1986);
        humanService.addTree("Сын_брат", "Колбин", "Александр Викторович", "муж", 1985);
        humanService.addTree("Сын_брат", "Колбин", "Валерий Викторович", "муж", 1983);
        humanService.addTree("Сын_брат", "Колбин", "Дмитрий Викторович", "муж", 1980);
        humanService.addTree("Мама", "Колбина", "Маргарита Викторовна", "жен", 1960);
        humanService.addTree("Дедушка", "Колбин", "Петр Степанович", "муж", 1920);
        humanService.addTree("Бабушка", "Колбина", "Надежда Александрована", "жен", 1920);


        System.out.println(tree.getHumanList());
        System.out.println();
        System.out.println(tree);


        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("External.out"));
        out.writeObject(tree);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("External.out"));
        tree = (Tree) in.readObject();

        System.out.println(tree.toString());

//        tree.save();

    }
}