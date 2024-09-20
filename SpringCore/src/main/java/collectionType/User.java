package collectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private List<String> contactList;
	private Set<Long> contacts;
	private Map<Integer, String> bankAccount;
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
	public List<String> getContactList() {
		return contactList;
	}
	public void setContactList(List<String> contactList) {
		this.contactList = contactList;
	}
	public Set<Long> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Long> contacts) {
		this.contacts = contacts;
	}
	public Map<Integer, String> getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(Map<Integer, String> bankAccount) {
		this.bankAccount = bankAccount;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contactList=" + contactList + ", contacts=" + contacts
				+ ", bankAccount=" + bankAccount + "]";
	}
	
	
}
