package collections.handson;

public class Employ implements Comparable<Employ>
{
int id;
String name;
double salary;
String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employ(int id, String name, double salary, String email) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.email = email;
}
@Override
public String toString() {
	return "Employ [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
}
@Override
public int compareTo(Employ o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());

}

}
