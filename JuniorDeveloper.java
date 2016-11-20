package Developers;

public class JuniorDeveloper extends Developer {

	public JuniorDeveloper(String type, String name, double basicSalary, int experience) {
		super(type, name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
