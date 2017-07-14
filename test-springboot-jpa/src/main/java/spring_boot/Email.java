package spring_boot;

import javax.persistence.*;

/**
 * Created by Adrian.Flak on 6/22/2017.
 */
@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emailId")
    private Integer id;

    @Version
    private Integer version;

    private String emailAddress;

    @ManyToOne
    @JoinColumn(name = "personId")
    private Person person;


    public Email(){}

    public Email (String emailAddress) {
        this.setEmailAddress(emailAddress);
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
