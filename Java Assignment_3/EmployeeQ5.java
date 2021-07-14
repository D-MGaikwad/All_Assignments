package company;

import java.util.Objects;

public class Employee {
	
	int emp_id;
	String name;
	
 
public Employee(String name,int emp_id) {
   
	this.emp_id = emp_id;
	this.name = name;	
}


public int getEmp_id() {
	return emp_id;
}


public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Employee [Name= " + name + ", Employee_id= " + emp_id + "]";
}


@Override
public int hashCode() {
	return Objects.hash(emp_id);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return emp_id == other.emp_id;
}


}
