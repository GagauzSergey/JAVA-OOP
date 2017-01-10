package dynamoKievTeam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 06.01.2017.
 */
public class TeamList implements Serializable{
    HashSet<FootballPlayer> list = new HashSet<>();

    public void addPlayer(String name, String surname, String position) {
        FootballPlayer footballPlayer = new FootballPlayer(name, surname, position);
        list.add(footballPlayer);
        System.out.println(list.toString());
    }

    public HashSet<FootballPlayer> getListPeople() {
        return list;
    }

    public static void veiwPlayers () {
        ArrayList <FootballPlayer> arr = new ArrayList<>();
        Iterator<FootballPlayer> itr = arr.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next().getName());
        }
    }
    }