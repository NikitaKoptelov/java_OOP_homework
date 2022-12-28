import java.io.*;

public class FailHandler {
    public void seve(Object object) {
        System.out.println("произведено сохранение записей в файл");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("Save_Data.out"));
            out.writeObject(object);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-OK-");

    }

    public Object read(){
        Object object = new Object();
        System.out.println("чтение из файла");
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Save_Data.out"));
            object = in.readObject();
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-OK-");
        return object;
    }



}
