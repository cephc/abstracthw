package homeworkone;

public abstract class Account {

    private int pinNumber;
    private String accountType;
    private double withdraw;
    private double deposit;

    //constructors
    public Account(){
    }
    public Account(int pinNumber, String accountType) {
        this.pinNumber = pinNumber;
        this.accountType = accountType;
    }

    //methods
    public abstract String withdraw();
    public abstract String pinVerified();
    public abstract String deposit();
    public abstract String balance();

    //getters
    public int getPinNumber() {
        return this.pinNumber;
    }
    public String getAccountType() {
        return this.accountType;
    }
    public double getWithdraw() {
        return this.withdraw;
    }
    public double getDeposit() {
        return this.deposit;
    }

    //settings
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
