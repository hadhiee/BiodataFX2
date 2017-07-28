package ch.makery.address.model;

import java.util.Calendar;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Person {

	private String firstName;
	private String lastName;
	private String street;
	private int postalCode;
	private String city;
	private Calendar birthday;
        private String fileFoto;

	/**
	 * Default constructor.
	 */
	public Person() {
	}
	
	/**
	 * Constructor with some initial data.
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		// some initial dummy data
		this.street = "jalan";
		this.postalCode = 1234;
		this.city = "kota";
		this.birthday = Calendar.getInstance();
                this.fileFoto="file.png";
	}
	
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
        public String getFoto() {
		return fileFoto;
	}

	public void setFoto(String foto) {
		this.fileFoto = foto;
	}
}
