package infiniteskills.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @Column(name = "BANK_ID")
    long bankId;
    @Column(name = "NAME")
    public String name;
    @Column(name = "ADDRESS_TYPE")
    public String addressType;
    @Column(name = "IS_INTERNATIONAL")
    public boolean isInternational;
    @Column(name = "LAST_UPDATED_BY")
    public String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_DATE")
    public LocalDate last_updated_date;
    @Column(name = "CREATED_BY")
    public String createdBy;

    @Column(name = "CREATED_DATE")
    public LocalDate createdDate;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "userAddressLine1", column = @Column(name = "address_line_1")),
            @AttributeOverride(name = "userAddressLine2", column = @Column(name = "address_line_2"))
    })
    public Address address = new Address();

    public long getBankId() {
        return bankId;
    }

    public void setBankId(long bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public LocalDate getLast_updated_date() {
        return last_updated_date;
    }

    public void setLast_updated_date(LocalDate last_updated_date) {
        this.last_updated_date = last_updated_date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", name='" + name + '\'' +
                ", addressType='" + addressType + '\'' +
                ", isInternational=" + isInternational +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", last_updated_date=" + last_updated_date +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate=" + createdDate +
                ", address=" + address +
                '}';
    }
}
