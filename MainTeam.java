package dynamoKievTeam;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by user on 06.01.2017.
 * Program which includes Dynamo Kiev football players bio
 * Positions: goalkeeper, forward, semi-defender, defender
 * 2017 year
 * coach Sergey Rebrov
 * Players quantity: 10 (+1)
 */

public class MainTeam {
    public static void startPlayer() {
        String pathname = "E:\\Testing Libs\\Test1\\dynamoteam.txt";
        try {
            FileInputStream fio2 = new FileInputStream(pathname);
            ObjectInputStream ois2 = new ObjectInputStream(fio2);
            HashSet<FootballPlayer> playerList;
            playerList = (HashSet<FootballPlayer>) ois2.readObject();
            ois2.close();
            for (FootballPlayer h : playerList) {
                System.out.println(h.getName() + h.getSurname() + h.getPosition());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Dynamo - Chempion");
        String pathname = "E:\\Testing Libs\\Test1\\dynamoteam.txt";
        File f = new File(pathname);
        Scanner in = new Scanner(System.in);
        HashSet<FootballPlayer> listPlayer = new HashSet<>();
        HashSet<FootballPlayer> listPlayer2;

        MainTeam.startPlayer();

        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 2; i++) {
            FootballPlayer footballPlayer = new FootballPlayer();
            listPlayer.add(footballPlayer.playerCreator(in));
        }

        try {
            FileOutputStream fos1 = new FileOutputStream(pathname);
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

            FileInputStream fio2 = new FileInputStream(pathname);
            ObjectInputStream ois2 = new ObjectInputStream(fio2);

            try {
                oos1.writeObject(listPlayer);
                listPlayer2 = (HashSet<FootballPlayer>) ois2.readObject();
                Iterator iterator = listPlayer2.iterator();

                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                for (FootballPlayer h: listPlayer2){
                    System.out.println(h.getName()+h.getSurname()+h.getPosition());
                }
            } finally {
                oos1.close();
                ois2.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
