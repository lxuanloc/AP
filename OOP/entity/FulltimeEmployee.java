package OOP.entity;

import OOP.Employee;

public class FulltimeEmployee extends Employee {
	private float _coefficients_salary;
	private Object _basic_salary;

	public float getCoefficients_salary() {
		return this._coefficients_salary;
	}

	public void setCoefficients_salary(float aCoefficients_salary) {
		this._coefficients_salary = aCoefficients_salary;
	}

	public void getBasic_salary() {
		return this._basic_salary;
	}

	public void setBasic_salary(Object aBasic_salary) {
		this._basic_salary = aBasic_salary;
	}

	public void showinfor() {
		throw new UnsupportedOperationException();
	}
}