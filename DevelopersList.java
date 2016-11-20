package Developers;

import Phones.Phone;
import Student.Student.Student;

/**
 * Created by user on 20.11.2016.
 */
public class DevelopersList {
    private static Developer[] list = new Developer[5];
    private static Developer[] list2 = new JuniorDeveloper[5];
    private static Developer[] list3 = new SeniorDeveloper[5];
    private static Developer[] list4 = new TeamLeadDeveloper[5];

    private static int p = 0;

    public void add(Developer developer) {
        list[p++] = developer;
    }


    public Developer get(int n) {
        return list[n];
    }

    public Developer getNumber(int n) {
        return list[n];
    }

    //Find Developers with salary greater then 1500
    public static void findDev() {
        System.out.println("");
        System.out.println("RESULTS:");
        System.out.println("");
        System.out.println("Developers with salary greater than 1500 dollars: ");
        System.out.println("----------------");

        String sen = "Senior";
        for (int i = 0; i < list.length; i++) {
            if ((list[i].getType().equalsIgnoreCase(sen)) && (1500 < list[i].getSalary())) {
                System.out.println(list[i].getName() + " ");
            }
        }
    }
    //New Developers List Creating
    public static void newListDevelopers() {
        System.out.println("");
        System.out.println("");
        System.out.println("Junior Developers List:");
        System.out.println("----------------");

        int j = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getType().equalsIgnoreCase("Junior")) {
                list2[j] = list[i];
                System.out.println(list2[j].getName());
                j++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Senior Developers List:");
        System.out.println("----------------");

        int k = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getType().equalsIgnoreCase("Senior")) {
                list3[k] = list[i];
                System.out.println(list3[k].getName());
                k++;
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("TeamLead Developers List:");
        System.out.println("----------------");

        int t = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].getType().equalsIgnoreCase("TeamLead")) {
                list4[t] = list[i];
                System.out.println(list4[t].getName());
                t++;
            }
        }
    }
}


