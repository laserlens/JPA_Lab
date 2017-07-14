package mvc.models;

import javax.persistence.*;

/**
 * Created by Adrian.Flak on 6/23/2017.
 */
@Entity
public class ContactModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contactId;

    @Version
    private Integer version;


    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public ContactModel(){}

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String toString() {
        return "FirstName:  " + this.firstName + " LastName: " + this.lastName + " Address: " + this.address +
                ", " + this.city + " " + this.state + " " +this.zipCode;
    }
}
