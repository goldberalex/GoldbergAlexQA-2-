package model;

public class ContactData {
    private final String alex;
    private final String goldber;
    private final String goldberalex;
    private final String f;
    private final String bearSheva;
    private final String bearSheba;

    public ContactData(String alex, String goldber, String goldberalex, String f, String bearSheva, String bearSheba) {
        this.alex = alex;
        this.goldber = goldber;
        this.goldberalex = goldberalex;
        this.f = f;
        this.bearSheva = bearSheva;
        this.bearSheba = bearSheba;
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
