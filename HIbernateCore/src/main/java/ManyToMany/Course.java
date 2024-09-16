package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="c_data")
public class Course {

	@Id
	private int id;
	private String course_name;
	private int fees;
	
	@ManyToMany
	private List<StudentD> stu_list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public List<StudentD> getStu_list() {
		return stu_list;
	}

	public void setStu_list(List<StudentD> stu_list) {
		this.stu_list = stu_list;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", fees=" + fees + ", stu_list=" + stu_list + "]";
	}
	
}
