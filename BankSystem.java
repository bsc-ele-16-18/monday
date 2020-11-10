public abstract class BankSystem{
 // account number
    private int accountNumber;
    // account name
    private String accountName;
    // branch
    private String branch;
    // balance
   protected double balance;
    // default contructor
    public BankSystem(){
        super();
    
    }
      int getAccountnumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountnumber){
        this.accountNumber = accountnumber;
        balance = 0;
    }
    //
    public String getAccountName(){
        return accountName;
    }
    

public String getBranch(){
    return branch;
}
    public void setBranch(String branch){
         this.branch = branch;
    }
    public double getBalance(){
      return balance; 
    }
    public void setBalance(double balance){
        this.balance = balance;
    }


 public abstract void deposist(double amount);
 public abstract void withdraw(double amount);


}

