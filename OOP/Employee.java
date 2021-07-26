package OOP;

import OOP.entity.Department;

public class Employee {
	private String _name;
	private Date _dob;
	private String _address;
	private int _phone;
	private int _id;
	private Department _department;
	public Department _unnamed_Department_;

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public Date getDob() {
		return this._dob;
	}

	public void setDob(Date aDob) {
		this._dob = aDob;
	}

	public String getAddress() {
		return this._address;
	}

	public void setAddress(String aAddress) {
		this._address = aAddress;
	}

	public int getPhone() {
		return this._phone;
	}

	public void setPhone(int aPhone) {
		this._phone = aPhone;
	}

	public int getId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	public Department getDepartment() {
		return this._department;
	}

	public void setDepartment(Department aDepartment) {
		this._department = aDepartment;
	}

	public void showinfor() {
		throw new UnsupportedOperationException();
	}
}