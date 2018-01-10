package in.vamsoft.threadtask;

public class Factorial implements Runnable{
  

  @Override
  public void run() {
    // TODO Auto-generated method stub
    int i,fact=1;  
    int number=5;
       
    for(i=1;i<=number;i++){    
        fact=fact*i;    
    }
    System.out.println("Factorial of "+number+" is: "+fact);   
  }    
   

}
