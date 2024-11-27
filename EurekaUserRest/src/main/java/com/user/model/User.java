package com.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class User {

	@Id
	private int id;
	private String name;
	private String address;
	private long contat;
}
