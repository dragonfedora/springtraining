package com.spring.model;

public class Person {

		private int id;
		private String firstName;
		private String lastName;
		private long contactNumber;
		private String address;
		private int adhaarNo;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getAdhaarNo() {
			return adhaarNo;
		}
		public void setAdhaarNo(int adhaarNo) {
			this.adhaarNo = adhaarNo;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
}
