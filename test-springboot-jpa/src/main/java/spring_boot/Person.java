package spring_boot;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Adrian.Flak on 6/21/2017.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personId")
    private Integer id;

    @Version
    private Integer version;

    private String firstName;
    private String middleName;
    private String lastName;
    private String SSN;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Email> emailList;

    public Person(){}

    public Person(String firstName){
        this.firstName = firstName;
    }

    public Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public List<Email> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<Email> emailList) {
        this.emailList = emailList;
    }
}
