package jp.co.sample.answer.ex_medalfactory;

/**
 * 従業員を表すクラス.
 * 
 * @author igamasayuki
 * 
 */
public class Employee {
	/** 従業員名 */
	private String name;

	/** 給与額 */
	private int salary;

	public Employee() {
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}