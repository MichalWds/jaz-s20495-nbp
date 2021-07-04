package pjatk.jazs20495nbp.model;

public class Rate {

    private String referenceNumber;
    private String effDate;
    private double middle_value;

    public Rate() {
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public double getMiddle_value() {
        return middle_value;
    }

    public void setMiddle_value(double middle_value) {
        this.middle_value = middle_value;
    }
}
