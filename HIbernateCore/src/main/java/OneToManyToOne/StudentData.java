package OneToManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentData {

	@Id
	private int id;
	private String name;
	private long contact;
	
	@OneToMany(mappedBy = "student")
	private List<AddressData> address;

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

	public List<AddressData> getAddress() {
		return address;
	}

	public void setAddress(List<AddressData> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
	
	
}
