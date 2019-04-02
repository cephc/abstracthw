package homeworkone;

public class BusinessAccount extends Account {

    private int businessAccountNumber;
    private boolean business;
    private double availableBusinessBalance;

    //constructors
    public BusinessAccount(){
    }
    public BusinessAccount(int pinNumber, String accountType, int businessAccountNumber, boolean business){
        super(pinNumber, accountType);
        this.businessAccountNumber = businessAccountNumber;
        this.business = business;
    }
    double balance = Math.random() * 10000 + 1;
    double newBal = Math.round(balance*100.0)/100.0;
    @Override
    public String withdraw(){
        String newNewBal = "";
        String response = "";
        availableBusinessBalance = balance - getWithdraw();
        double newAvailBal = Math.round(availableBusinessBalance*100.0)/100.0;
        response = response + "WITHDRAW: Your Business Account balance is " + newBal + ". Your available balance is " + newAvailBal + ".";
        newNewBal = newNewBal + "You do not have enough to make this withdraw.";
        if(balance > getWithdraw()){
            return response;
        } else {
            System.out.println("Error! Insufficient funds. Cannot complete withdraw.");
        }
        return newNewBal + " Your available balance is " + newBal + ".";
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
        response = response + "DEPOSIT successful! Your new Business Account Balance is " + balance + ".";
        return response;
    }
    @Override
    public String balance(){
        return "BALANCE " + newBal;
    }

    @Override
    public String toString() {
        return "Business Account{" +
                " Business Account Number = " + businessAccountNumber +
                " , Is this a Business Account? " + business +
                '}';
    }
}
