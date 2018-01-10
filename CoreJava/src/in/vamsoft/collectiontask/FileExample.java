package in.vamsoft.collectiontask;

public class FileExample {
  
    
  public static void main(String[] args) {
    
    
    NumberFile nf=new NumberFile();
    nf.start();
    FactorialFun ff=new FactorialFun();
    ff.start();
    nf.setFf(ff);
    ff.setNf(nf);
 
    
  }

}
