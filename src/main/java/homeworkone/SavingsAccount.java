package homeworkone;

public class SavingsAccount extends Account {

    private int savingsAccountNumber;
    private boolean savings;
    public double availableSavingsBalance;

    //constructors
    public SavingsAccount(){
    }
    public SavingsAccount(int pinNumber, String accountType, int savingsAccountNumber, boolean savings){
        super(pinNumber, accountType);
        this.savingsAccountNumber = savingsAccountNumber;
        this.savings = savings;
    }
    //methods
    double balance = Math.random() * 10000 + 1;
    double newBal = Math.round(balance*100.0)/100.0;
    @Override
    public String withdraw(){
        return null;
    }
    @Override
    public String pinVerified(){
        String response = "";
        if(getPinNumber() == getPinNumber()){
            response = response + "Pin Verified, Welcome! ";
            return response;
        } else {
            return "Wrong Pin number";
        }
    }
    @Override
    public String deposit(){
        String response = "";
        balance = getDeposit() + newBal;
        response = response + "DEPOSIT successful! Your new Savings Account Balance is " + balance + ".";
        return response;
    }
    @Override
    public String balance(){
        return "BALANCE " + newBal;
    }

    @Override
    public String toString() {
        return "Savings Account {" +
                " Savings Account Number = " + savingsAccountNumber +
                " , Is this a Savings Account? " + savings +
                '}';
    }
}
