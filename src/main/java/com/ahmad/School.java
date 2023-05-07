package com.ahmad;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class School {

    @Id
    @SequenceGenerator(
            name = "school_id_sequence",
            sequenceName = "school_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "school_id_sequence"
    )
    private Integer id;
    private String schoolName;
    private String schoolAddress;
    private String schoolEmail;
    private String schoolHead;
    private String schoolOwner;

    public School(Integer id,
                  String schoolName,
                  String schoolAddress,
                  String schoolEmail,
                  String schoolHead,
                  String schoolOwner) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolEmail = schoolEmail;
        this.schoolHead = schoolHead;
        this.schoolOwner = schoolOwner;
    }

    public School() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolHead() {
        return schoolHead;
    }

    public void setSchoolHead(String schoolHead) {
        this.schoolHead = schoolHead;
    }

    public String getSchoolOwner() {
        return schoolOwner;
    }

    public void setSchoolOwner(String schoolOwner) {
        this.schoolOwner = schoolOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(id, school.id) && Objects.equals(schoolName, school.schoolName) && Objects.equals(schoolAddress, school.schoolAddress) && Objects.equals(schoolEmail, school.schoolEmail) && Objects.equals(schoolHead, school.schoolHead) && Objects.equals(schoolOwner, school.schoolOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, schoolName, schoolAddress, schoolEmail, schoolHead, schoolOwner);
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                ", schoolEmail='" + schoolEmail + '\'' +
                ", schoolHead='" + schoolHead + '\'' +
                ", schoolOwner='" + schoolOwner + '\'' +
                '}';
    }
}
