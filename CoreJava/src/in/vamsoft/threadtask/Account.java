package in.vamsoft.threadtask;

public class Account {

  double balance;

  public Account(double balance) {
    super();
    this.balance = balance;
  }
  public double getBalance()
  {
    return balance;
  }
  public void withdraw(double amount) {
    
    if(balance-amount>0)
    {
      balance-=amount;
      System.out.println("Withdraw is Successful and Ur Acc Balance is : "+balance);
    }
    else
    {
      System.out.println("The Account does not have an insufficient Balance "+getBalance());
    }
  }
  
}
