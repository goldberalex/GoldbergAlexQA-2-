package model;

public class ContactData {
    private String alex;
    private String goldber;
    private String goldberalex;
    private String f;
    private String bearSheva;
    private String bearSheba;

    public ContactData wihtAlex(String alex) {
        this.alex = alex;
        return this;
    }

    public ContactData wihtGoldber(String goldber) {
        this.goldber = goldber;
        return this;
    }

    public ContactData wihtGoldberalex(String goldberalex) {
        this.goldberalex = goldberalex;
        return this;
    }

    public ContactData wihtF(String f) {
        this.f = f;
        return this;
    }

    public ContactData wihtBearSheva(String bearSheva) {
        this.bearSheva = bearSheva;
        return this;
    }

    public ContactData wihtBearSheba(String bearSheba) {
        this.bearSheba = bearSheba;
        return this;
    }

    public String getAlex() {
        return alex;
    }

    public String getGoldber() {
        return goldber;
    }

    public String getGoldberalex() {
        return goldberalex;
    }

    public String getF() {
        return f;
    }

    public String getBearSheva() {
        return bearSheva;
    }

    public String getBearSheba() { return bearSheba; }
}
