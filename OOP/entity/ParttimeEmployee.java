package OOP.entity;

import OOP.Employee;

public class ParttimeEmployee extends Employee {
	private float _work_hours;
	private float _price_per_hours;

	public float getWork_hours() {
		return this._work_hours;
	}

	public void setWork_hours(float aWork_hours) {
		this._work_hours = aWork_hours;
	}

	public float getPrice_per_hours() {
		return this._price_per_hours;
	}

	public void setPrice_per_hours(float aPrice_per_hours) {
		this._price_per_hours = aPrice_per_hours;
	}

	public void showinfor() {
		throw new UnsupportedOperationException();
	}
}