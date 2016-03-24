package models;


public class BankBaseInfo extends Entity{
    private int bankId;
    private String name;
    private String INN;
    private String corespondentAccount;
    private String BIK;
    private String address;
    private boolean isClosed = false;

    public BankBaseInfo() {
        super();
    }


    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getCorespondentAccount() {
        return corespondentAccount;
    }

    public void setCorespondentAccount(String corespondentAccount) {
        this.corespondentAccount = corespondentAccount;
    }

    public String getBIK() {
        return BIK;
    }

    public void setBIK(String BIK) {
        this.BIK = BIK;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }
}
