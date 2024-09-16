package OneToManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AddressData {
	@Id
	private int id;
	private int hno;
	private String city;
	
	@ManyToOne
	private StudentData student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public StudentData getStudent() {
		return student;
	}

	public void setStudent(StudentData student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "AddressData [id=" + id + ", hno=" + hno + ", city=" + city + ", student=" + student + "]";
	}
	
	
}
