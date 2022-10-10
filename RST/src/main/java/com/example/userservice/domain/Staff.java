package com.example.userservice.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StaffID", nullable = false, length = 50)
    private String staffId;
    @Basic
    @Column(name = "AddressID", nullable = true, length = 50)
    private String addressId;
    @Basic
    @Column(name = "Code", nullable = true, length = 10)
    private String code;
    @Basic
    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;
    @Basic
    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;
    @Basic
    @Column(name = "ImagePath", nullable = true, length = 100)
    private String imagePath;
    @Basic
    @Column(name = "DateOfBirth", nullable = true)
    private Date dateOfBirth;
    @Basic
    @Column(name = "NationalIdentification", nullable = true, length = 30)
    private String nationalIdentification;
    @Basic
    @Column(name = "MobileNo", nullable = true, length = 12)
    private String mobileNo;
    @Basic
    @Column(name = "StaffType", nullable = false, length = 2)
    private String staffType;
    @Basic
    @Column(name = "Status", nullable = false, length = 4)
    private String status;
    @Basic
    @Column(name = "Position", nullable = false, length = 3)
    private String position;
    @Basic
    @Column(name = "StartDate", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "EndDate", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "Email", nullable = true, length = 50)
    private String email;
    @Basic
    @Column(name = "CreatedBy", nullable = false, length = 50)
    private String createdBy;
    @Basic
    @Column(name = "CreatedDate", nullable = false)
    private Timestamp createdDate;
    @Basic
    @Column(name = "LastModifiedBy", nullable = false, length = 50)
    private String lastModifiedBy;
    @Basic
    @Column(name = "LastModifiedDate", nullable = false)
    private Timestamp lastModifiedDate;
    @Basic
    @Column(name = "LanguageCode", nullable = false, length = 4)
    private String languageCode;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 4)
    private String countryCode;
    @Basic
    @Column(name = "CityID", nullable = true)
    private Integer cityId;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdentification() {
        return nationalIdentification;
    }

    public void setNationalIdentification(String nationalIdentification) {
        this.nationalIdentification = nationalIdentification;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Timestamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (staffId != null ? !staffId.equals(staff.staffId) : staff.staffId != null) return false;
        if (addressId != null ? !addressId.equals(staff.addressId) : staff.addressId != null) return false;
        if (code != null ? !code.equals(staff.code) : staff.code != null) return false;
        if (firstName != null ? !firstName.equals(staff.firstName) : staff.firstName != null) return false;
        if (lastName != null ? !lastName.equals(staff.lastName) : staff.lastName != null) return false;
        if (imagePath != null ? !imagePath.equals(staff.imagePath) : staff.imagePath != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(staff.dateOfBirth) : staff.dateOfBirth != null) return false;
        if (nationalIdentification != null ? !nationalIdentification.equals(staff.nationalIdentification) : staff.nationalIdentification != null)
            return false;
        if (mobileNo != null ? !mobileNo.equals(staff.mobileNo) : staff.mobileNo != null) return false;
        if (staffType != null ? !staffType.equals(staff.staffType) : staff.staffType != null) return false;
        if (status != null ? !status.equals(staff.status) : staff.status != null) return false;
        if (position != null ? !position.equals(staff.position) : staff.position != null) return false;
        if (startDate != null ? !startDate.equals(staff.startDate) : staff.startDate != null) return false;
        if (endDate != null ? !endDate.equals(staff.endDate) : staff.endDate != null) return false;
        if (email != null ? !email.equals(staff.email) : staff.email != null) return false;
        if (createdBy != null ? !createdBy.equals(staff.createdBy) : staff.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(staff.createdDate) : staff.createdDate != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(staff.lastModifiedBy) : staff.lastModifiedBy != null)
            return false;
        if (lastModifiedDate != null ? !lastModifiedDate.equals(staff.lastModifiedDate) : staff.lastModifiedDate != null)
            return false;
        if (languageCode != null ? !languageCode.equals(staff.languageCode) : staff.languageCode != null) return false;
        if (countryCode != null ? !countryCode.equals(staff.countryCode) : staff.countryCode != null) return false;
        if (cityId != null ? !cityId.equals(staff.cityId) : staff.cityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = staffId != null ? staffId.hashCode() : 0;
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (nationalIdentification != null ? nationalIdentification.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (staffType != null ? staffType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedDate != null ? lastModifiedDate.hashCode() : 0);
        result = 31 * result + (languageCode != null ? languageCode.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        return result;
    }
}
