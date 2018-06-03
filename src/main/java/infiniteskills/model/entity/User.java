package infiniteskills.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="FINANCES_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    @Access(value = AccessType.PROPERTY)
    private long userId;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAdress;
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    private LocalDate lastUpdatedDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "CREATED_DATE")
    private LocalDate createdDate;

    public long getUserId() {
        return userId;
    }

    public User setUserId(long userId) {
        this.userId = userId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public User setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public User setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
        return this;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public User setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public LocalDate getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public User setLastUpdatedDate(LocalDate lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public User setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public User setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }
}
