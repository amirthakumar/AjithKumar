package in.vamsoft.exception;

import java.util.Scanner;

public class TestSal {
    public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    Salary.sal s1;
    try{System.out.println("Enter the Salary");
    System.out.println("-----------------");
    int sal=ss.nextInt();
    if(sal<25000)
    {  
      s1=Salary.sal.MIN_SAL;
      if(s1==Salary.sal.MIN_SAL)
    throw new SalException("The Amount is Less Than 25000");
    }
    else if(sal>300000)
    {
      s1=Salary.sal.MAX_SAL;
    throw new SalException("The Amount is Higher Than 300000");
    }
    else
    {
      new Salary().setSalary();
      
    }
  }catch(SalException e)
    {
      System.out.println(e.getMessage());
      //System.out.println("The Amount is invalid");
    
    }
    finally {
    ss.close();
    }
}
}