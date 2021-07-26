package OOP.entity;

import OOP.Employee;

public class Department {
	private String _id;
	private String _name;
	public Employee _unnamed_Employee_;

	public String getId() {
		return this._id;
	}

	public void setId(String aId) {
		this._id = aId;
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}
}