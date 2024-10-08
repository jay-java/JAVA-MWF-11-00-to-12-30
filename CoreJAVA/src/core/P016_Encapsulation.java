package core;
class Employee{
	private int id;
	private String name;
	private long contact;
	private double salary;
	Employee(){
		
	}
	Employee(int id,String name,long contact,double salary){
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public long getContact() {
		return contact;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" conatct "+contact+" salary : "+salary;
	}
}
public class P016_Encapsulation {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("java");
		e1.setContact(98764321);
		e1.setSalary(9666.23);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getContact());
		System.out.println(e1.getSalary());
		
		Employee e2 = new Employee(2, "pyuthon", 987654, 5222.32);
		System.out.println(e2);
	}
}
