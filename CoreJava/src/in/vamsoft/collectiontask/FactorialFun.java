package in.vamsoft.collectiontask;

public class FactorialFun extends Thread {
  NumberFile nf;
  
 

  public NumberFile getNf() {
    return nf;
  }



  public void setNf(NumberFile nf) {
    this.nf = nf;
  }



  @Override
  public void run() {
   
    synchronized (this) {
      try {
        wait();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    int num=nf.getNum();
       int fact=1;
     
    for(int i=0;i<num;i++){ 
      
      
         fact+=fact*i;    
         
   
    }
    System.out.println("Factorial of "+5+" is: "+fact);
    synchronized (nf) {
      nf.notify();
    }
    
  }    

    
    
  }


