package Developers;

public class TeamLeadDeveloper extends Developer {

	public TeamLeadDeveloper(String type, String name, double basicSalary, int experience) {
		super(type, name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return (basicSalary * 4) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
