package model;

import java.util.Objects;

public class ContactData {
    private int id;
    private String firstname;
    private String lastname;
    private String nickname;
    private String company;
    private String address;
    private String home;
    private String birthday;



    public ContactData wihBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public ContactData wihtId(int id) {
        this.id = id;
        return this;
    }

    public ContactData wihtFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public ContactData wihtLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactData wihtNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public ContactData wihtCompany(String company) {
        this.company = company;
        return this;
    }

    public ContactData wihtAddress(String address) {
        this.address = address;
        return this;
    }

    public ContactData wihtHome(String home) {
        this.home = home;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() { return home; }
    public String getBirthday() { return birthday; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return id == that.id &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstname, lastname, birthday);
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
