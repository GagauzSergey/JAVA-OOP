package Developers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		DevelopersList devlist = new DevelopersList();
		String developerType [] = {"Junior", "MidToSenior", "Senior", "TeamLead"};

		System.out.println("Enter Junior Developer Info: Name, Salary, Experience");
		String name1 = d.readLine();
		JuniorDeveloper junior = new JuniorDeveloper(developerType[0], name1, inpSalary(), inpExperience());
		devlist.add(junior);
		System.out.println("Junior "+junior.getName()+" with "+ junior.getBasicSalary()+" dollars salary");

		System.out.println("Enter MiddleToSenior Developer Info: Name, Salary, Experience");
		String name2 = d.readLine();
		MiddleToSenior mid2sin = new MiddleToSenior(developerType[1],name2, inpSalary(), inpExperience());
		devlist.add(mid2sin);
		System.out.println("MiddleToSenior "+mid2sin.getName()+" with "+ mid2sin.getBasicSalary()+" dollars salary");

		System.out.println("Enter Senior1 Developer Info: Name, Salary, Experience");
		String name3 = d.readLine();
		SeniorDeveloper senior1 = new SeniorDeveloper(developerType[2],name3, inpSalary(), inpExperience());
		devlist.add(senior1);
		System.out.println("Senior1 "+senior1.getName()+" with "+ senior1.getBasicSalary()+" dollars salary");

		System.out.println("Enter Senior2 Developer Info: Name, Salary, Experience");
		String name4 = d.readLine();
		SeniorDeveloper senior2 = new SeniorDeveloper(developerType[2], name4, inpSalary(), inpExperience());
		devlist.add(senior2);
		System.out.println("Senior2 "+senior2.getName()+" with "+ senior2.getBasicSalary()+" dollars salary");

		System.out.println("Enter TeamLeadDeveloper Developer Info: Name, Salary, Experience");
		String name5 = d.readLine();
		TeamLeadDeveloper teamlead = new TeamLeadDeveloper(developerType[3],name5, inpSalary(), inpExperience());
		devlist.add(teamlead);
		System.out.println("TeamLeadDeveloper "+teamlead.getName()+" with "+ teamlead.getBasicSalary()+" dollars salary");

		DevelopersList.findDev();
		DevelopersList.newListDevelopers();

	}

	public static int inpSalary() throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		int i1 = 0;
		String salary = d.readLine();
		try {
			i1 = Integer.valueOf(salary);}
		catch (NumberFormatException e) {
			System.err.println("Wrong string format!");
		}
		return i1;
	}

	public static int inpExperience() throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		int i2 = 0;
		String experience = d.readLine();
		try {
			i2 = Integer.valueOf(experience);
		} catch (NumberFormatException e) {
			System.err.println("Wrong string format!");
		}
		return i2;
	}
}



//		StringBuilder sb;
//
//		for (Developer d : list) {
//			sb = new StringBuilder() // !!!
//				.append(d.getName())
//				.append(": ")
//				.append(d.getBasicSalary())
//				.append(" -> ")
//				.append(d.getSalary());
//
//			System.out.println(sb.toString());
//		}
