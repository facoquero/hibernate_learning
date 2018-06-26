package infiniteskills.model.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(value = AccessType.FIELD)
public class Address {
    @Column(name = "USER_ADDRESS_LINE_1")
    private String userAddressLine1;
    @Column(name = "USER_ADDRESS_LINE_2")
    private String userAddressLine2;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIP_CODE")
    private String zipCode;

    public String getUserAddressLine1() {
        return userAddressLine1;
    }

    public Address setUserAddressLine1(String userAddressLine1) {
        this.userAddressLine1 = userAddressLine1;
        return this;
    }

    public String getUserAddressLine2() {
        return userAddressLine2;
    }

    public Address setUserAddressLine2(String userAddressLine2) {
        this.userAddressLine2 = userAddressLine2;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "userAddressLine1='" + userAddressLine1 + '\'' +
                ", userAddressLine2='" + userAddressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
