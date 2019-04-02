package homeworkone;

public class Main {
    public static void main(String[] args) {
        CheckingAccount one = new CheckingAccount(1424, "checking account", 54213908, true);

        System.out.println(one);
        one.setPinNumber(1424);
        System.out.println(one.pinVerified());
        System.out.println(one.balance());
        one.setWithdraw(500.00);
        System.out.println(one.withdraw());
        one.setDeposit(600);
        System.out.println(one.deposit());


        SavingsAccount two = new SavingsAccount(5243, "savings account", 74792063, true);

        System.out.println(two);
        two.setPinNumber(5243);
        System.out.println(two.pinVerified());
        System.out.println(two.balance());
        two.setWithdraw(600.00);
        System.out.println(two.withdraw());
        two.setDeposit(1000);
        System.out.println(two.deposit());


        BusinessAccount three = new BusinessAccount(8675, "business account", 74200852, true);

        System.out.println(three);
        three.setPinNumber(5243);
        System.out.println(three.pinVerified());
        System.out.println(three.balance());
        three.setWithdraw(3204.54);
        System.out.println(three.withdraw());
        three.setDeposit(60);
        System.out.println(three.deposit());



    }
}
