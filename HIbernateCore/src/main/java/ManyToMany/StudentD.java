package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="s_data")
public class StudentD {

	@Id
	private int id;

	private String name;
	private long contact;
	@ManyToMany
	private List<Course> course_list;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public List<Course> getCourse_list() {
		return course_list;
	}
	public void setCourse_list(List<Course> course_list) {
		this.course_list = course_list;
	}
	@Override
	public String toString() {
		return "StudentD [id=" + id + ", name=" + name + ", contact=" + contact + ", course_list=" + course_list + "]";
	}
	
}
