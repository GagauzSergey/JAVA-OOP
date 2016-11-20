package Developers;

public class SeniorDeveloper extends Developer {

	public SeniorDeveloper(String type, String name, int basicSalary, int experience) {
		super(type, name, basicSalary, experience);
	}

	@Override
	public double getSalary() {
		return (basicSalary * 1.5) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
	}
}
