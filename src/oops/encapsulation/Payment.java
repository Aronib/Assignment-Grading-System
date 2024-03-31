package oops.encapsulation;

public class Payment {
    private int accID;
    private float amount;
    private String beneficiaryName;

    public int getAccID() {
        return accID;
    }
    public void setAccID(int accID) {
        this.accID = accID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

}
