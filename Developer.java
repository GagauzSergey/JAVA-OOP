package Developers;

public abstract class Developer {

	protected String name;
	protected double basicSalary;
	protected int experience;
	protected String type;
	
	public Developer(String type, String name, double basicSalary, int experience) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.experience = experience;
		this.type=type;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public abstract double getSalary();
}
