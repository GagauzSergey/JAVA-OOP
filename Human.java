package HumanClone;

import java.io.Serializable;

/**
 * Created by user on 05.01.2017.
 */
public class Human implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Human(String name, String surname, int age, String gender) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        return gender != null ? gender.equals(human.gender) : human.gender == null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 17 * result + (surname != null ? surname.hashCode() : 0);
        result = 17 * result + age;
        result = 17 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
