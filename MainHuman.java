package HumanClone;

import java.io.*;

/**
 * Created by user on 05.01.2017.
 */
public class MainHuman {
    public static void main(String[] args) {
        String serialPath = "E:\\Testing Libs\\Test1\\new2.txt";
        try {
            Human firstHuman = new Human("Alex", "Kyssa", 33, "Male");
            Human secondHuman = new Human("Sergey", "Gagauz", 33, "Male");

            try {
                System.out.println(firstHuman.clone().hashCode());
                System.out.println(secondHuman.hashCode());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

            boolean a = secondHuman.equals(firstHuman.clone());
            boolean b = firstHuman.equals(firstHuman.clone());
            System.out.println(a);
            System.out.println(b);

            System.out.println(firstHuman.getName());
            System.out.println(firstHuman.getSurname());
            System.out.println(firstHuman.getAge());
            System.out.println(firstHuman.getGender());

            System.out.println(secondHuman.getName());
            System.out.println(secondHuman.getSurname());
            System.out.println(secondHuman.getAge());
            System.out.println(secondHuman.getGender());

            FileOutputStream fos1 = new FileOutputStream(serialPath);
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

            FileOutputStream fos2 = new FileOutputStream(serialPath);
            ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
            try {
                oos1.writeObject(firstHuman);
                oos2.writeObject(secondHuman);
            } finally {
                oos1.close();
                oos2.close();
            }

            Human readHuman1;
            Human readHuman2;

            FileInputStream fio1 = new FileInputStream(serialPath);
            ObjectInputStream ois1 = new ObjectInputStream(fio1);

            FileInputStream fio2 = new FileInputStream(serialPath);
            ObjectInputStream ois2 = new ObjectInputStream(fio2);
            try {
                readHuman1 = (Human) ois1.readObject();
                readHuman2 = (Human) ois2.readObject();
            } finally {
                ois1.close();
                ois2.close();
            }
            System.out.println(readHuman1);
            System.out.println(readHuman2);

        } catch (IOException | ClassNotFoundException | CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
