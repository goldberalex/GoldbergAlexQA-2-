package model;

public class ContactData {
    private String firstname;
    private String lastname;
    private String nickname;
    private String company;
    private String address;
    private String home;

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
}
