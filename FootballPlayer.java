package dynamoKievTeam;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by user on 06.01.2017.
 */
public class FootballPlayer implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private String position;

    public FootballPlayer(String name, String surname, String position) {
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public FootballPlayer() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootballPlayer that = (FootballPlayer) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        return position != null ? position.equals(that.position) : that.position == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public FootballPlayer playerCreator(Scanner in) {
        FootballPlayer player = new FootballPlayer(name, surname, position);
        System.out.println("Please, enter FC Dynamo player bio:");

        System.out.println("Player name: ");
        player.setName(in.nextLine());

        System.out.println("Player surname: ");
        player.setSurname(in.nextLine());

        System.out.println("Player position: ");
        player.setPosition(in.nextLine());

        return player;
    }
}
