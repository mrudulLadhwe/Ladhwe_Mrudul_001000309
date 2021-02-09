/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mrudu
 */
public class DemographicInfo {
    
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String DOB;
    private String age;
    private String height;
    private String weight;
    private String SSN;
    AddressInfo address;
    BankAccountInfo bankAcc;
    DrivingLicenseInfo drive;
    MedicalRecordInfo mRecord;

    public BankAccountInfo getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(BankAccountInfo bankAcc) {
        this.bankAcc = bankAcc;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public DrivingLicenseInfo getDrive() {
        return drive;
    }

    public void setDrive(DrivingLicenseInfo drive) {
        this.drive = drive;
    }

    public MedicalRecordInfo getmRecord() {
        return mRecord;
    }

    public void setmRecord(MedicalRecordInfo mRecord) {
        this.mRecord = mRecord;
    }
    
    
    
}
