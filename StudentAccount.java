
// Student accountss
 class StudentAccount extends BankSystem {

    // defaul transaction fee
private static  double FEE = 1000;
// default constructor
 public StudentAccount(){  
    super();
 }
 public  StudentAccount(int accountNumber, double fee){
    
     FEE = fee; 

 }
    public void deposit(double amount) {
    // first check ammount
    if (amount > 0){ 
        balance += amount;
        System.out.println("Amount deposited");
        // Apply transaction fee
        balance += FEE;
        System.out.println("Show the application fee");
        System.out.println(" Show the balance amount");
    } else{
        System.out.println("A negative amount can not be deposited");
    }
}
    
        public void withdraw(double amount){
            // Same check
            if(amount > 0){
                // Check sufficient balance
                if((amount+FEE) <= balance){
                    System.out.printf("Amount withdrawn from Account");
                    balance -= amount;
                    balance -= FEE;
                    System.out.printf("Fee of applied from Account is");
                    System.out.printf("Current balance  is");
                }
            }else {
                System.out.println("Negative amount cannot be withdrawn");
              
            }
        }

          @Override
        public void deposist(double amount) {
            

        }
             
    } 
 
    