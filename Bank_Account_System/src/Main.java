class BankAccount{
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String name, int acc_num, double balance ){

        this.accountHolder = name;
        this.accountNumber = acc_num;
        this.balance = balance;
    }

    void Deposite(double amount){
        balance = balance+amount;
    }
    void Withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance-amount;
            System.out.println("withdrawl is done after your blance is "+balance);
        }else {
            System.out.println("Insufficient Balance");
        }
    }
    void Checkbalance(){
        System.out.println("your current balance is "+balance);

    }
    void DisPlayDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }



}


class Main{
    public static void main(String[] args){

        BankAccount b1 = new BankAccount("rahul", 1012, 10000);

        b1.Deposite(5000);
        b1.Withdraw(2000);
        b1.Checkbalance();
        b1.DisPlayDetails();


    }
}