package com.bttp.pojo;

public class Learner {

    private String learnerno;
    private String firstname;
    private String lastname;
    private String identityno;
    private String grade;
    private String pfirstname;
    private String plastname;
    private String pidentityno;
    private String contactno;
    private String residentialaddress;
    private String dateofregistration;

    public Learner() {
    }

    public Learner(String learnerno, String firstname, String lastname, String identityno, String grade, String pfirstname, String plastname, String pidentityno, String contactno, String residentialaddress, String dateofregistration) {
        this.learnerno = learnerno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.identityno = identityno;
        this.grade = grade;
        this.pfirstname = pfirstname;
        this.plastname = plastname;
        this.pidentityno = pidentityno;
        this.contactno = contactno;
        this.residentialaddress = residentialaddress;
        this.dateofregistration = dateofregistration;
    }

    public String getLearnerno() {
        return learnerno;
    }

    public void setLearnerno(String learnerno) {
        this.learnerno = learnerno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIdentityno() {
        return identityno;
    }

    public void setIdentityno(String identityno) {
        this.identityno = identityno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPfirstname() {
        return pfirstname;
    }

    public void setPfirstname(String pfirstname) {
        this.pfirstname = pfirstname;
    }

    public String getPlastname() {
        return plastname;
    }

    public void setPlastname(String plastname) {
        this.plastname = plastname;
    }

    public String getPidentityno() {
        return pidentityno;
    }

    public void setPidentityno(String pidentityno) {
        this.pidentityno = pidentityno;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getResidentialaddress() {
        return residentialaddress;
    }

    public void setResidentialaddress(String residentialaddress) {
        this.residentialaddress = residentialaddress;
    }

    public String getDateofregistration() {
        return dateofregistration;
    }

    public void setDateofregistration(String dateofregistration) {
        this.dateofregistration = dateofregistration;
    }
}
