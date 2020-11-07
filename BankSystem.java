class BankSystem{
 
    private int accountNumber;
    private String accountName;
    private String branch;

    BankSystem(int accountnumber, String accountname, String branch) {


this.accountNumber = accountnumber;
this.accountName = accountname;
this.branch = branch;
    }

      int getAccountnumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountnumber){
        this.accountNumber = accountnumber;
    }
    public String getAccountName(){
        return accountName;
    }
    

public String getBranch(){
    return branch;
}
    public void setBranch(String branch){
         this.branch = branch;
    }

}






    
