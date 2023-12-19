package com.khushi.blooddonors.Models;

public class ModelUser {


    //go model k variable hotay hain firebase mn usi name sy variable bntay hain  mtlb wo fields go us din bnae thi

    String donorName;
    String donorCNIC;
    String donorDOB;  // ye naam hmny khud sy rkhy naaa
    String donorEmail;
    String donorAddress;
    String donorBloddGroup;


    public ModelUser() {
    }

    public ModelUser(String donorName, String donorCNIC, String donorDOB, String donorEmail, String donorAddress, String donorBloddGroup, String donorPassword) {
        this.donorName = donorName;
        this.donorCNIC = donorCNIC;
        this.donorDOB = donorDOB;
        this.donorEmail = donorEmail;
        this.donorAddress = donorAddress;
        this.donorBloddGroup = donorBloddGroup;
        this.donorPassword = donorPassword;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorCNIC() {
        return donorCNIC;
    }

    public void setDonorCNIC(String donorCNIC) {
        this.donorCNIC = donorCNIC;
    }

    public String getDonorDOB() {
        return donorDOB;
    }

    public void setDonorDOB(String donorDOB) {
        this.donorDOB = donorDOB;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorBloddGroup() {
        return donorBloddGroup;
    }

    public void setDonorBloddGroup(String donorBloddGroup) {
        this.donorBloddGroup = donorBloddGroup;
    }

    public String getDonorPassword() {
        return donorPassword;
    }

    public void setDonorPassword(String donorPassword) {
        this.donorPassword = donorPassword;
    }

    String donorPassword;
}