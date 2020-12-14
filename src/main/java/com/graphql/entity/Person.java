package com.graphql.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name="person")
public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "person_id", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	

	public Person(int personId, String firstName, String lastName) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Person() {
		super();
	}

	
	
}
