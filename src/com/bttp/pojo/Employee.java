package com.bttp.pojo;

public class Employee {

    private String employeeno;
    private String firstname;
    private String lastname;
    private String identityno;
    private String email;
    private String contactno;
    private String occupation;

    public Employee() {
    }

    public Employee(String employeeno, String firstname, String lastname, String identityno, String email, String contactno, String occupation) {
        this.employeeno = employeeno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.identityno = identityno;
        this.email = email;
        this.contactno = contactno;
        this.occupation = occupation;
    }

    public String getEmployeeno() {
        return employeeno;
    }

    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
