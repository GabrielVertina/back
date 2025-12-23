package com.javainuse.model;


import javax.persistence.*;

	@Entity
	@Table
			(name = "users")
	public class User {
		public User() {
		}

		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name = "name")
		private String name;

		@Column(name = "password")
		private String password;

		@Column(name = "type")
		private String type;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

