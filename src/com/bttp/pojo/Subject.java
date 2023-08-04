package com.bttp.pojo;

public class Subject {

    private String subjectcode;
    private String subjectname;

    public Subject() {
    }

    public Subject(String subjectcode, String subjectname) {
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }
}
