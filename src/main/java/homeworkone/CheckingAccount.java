package homeworkone;

public class CheckingAccount extends Account {

    private int checkingAccountNumber;
    private boolean checking;
    private double availableCheckingBalance;


    public CheckingAccount(){
    }
    public CheckingAccount(int pinNumber, String accountType, int checkingAccountNumber, boolean checking){
        super(pinNumber, accountType);
        this.checkingAccountNumber = checkingAccountNumber;
        this.checking = checking;
    }
    double balance = Math.random() * 10000 + 1;
    double newBal = Math.round(balance*100.0)/100.0;

    @Override
    public String withdraw(){
        String response = "";
        String newNewBal = "";
      //double balance = Math.random() * 10000 + 1;
      availableCheckingBalance = balance - getWithdraw();
      //double newBal = Math.round(balance*100.0)/100.0;
      double newAvailBal = Math.round(availableCheckingBalance*100.0)/100.0;
      response = response + "WITHDRAW: Your Checking Account balance is " + newBal + ". Your available balance is " + newAvailBal + ".";
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
            response = response + "Pin verified, Welcome! ";
            return response;
        } else {
            return "Wrong Pin number";
        }
    }
    @Override
    public String deposit(){
        String response = "";
        balance = getDeposit() + newBal;
        response = response + "Deposit successful! Your new Checking Account Balance is " + balance + ".";
        return response;
    }
    @Override
    public String balance(){
        return "BALANCE " + newBal;
    }

    @Override
    public String toString() {
        return "Checking Account {" +
                " Checking Account Number = " + checkingAccountNumber +
                " , Is this a Checking Account? " + checking +
                '}';
    }
}
