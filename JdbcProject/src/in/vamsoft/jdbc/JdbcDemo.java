package in.vamsoft.jdbc;

import org.apache.log4j.Logger;

public class JdbcDemo {
  
  public static Logger logger=Logger.getLogger(JdbcDemo.class);
  public static void main(String[] args) {
    try {
    logger.info("Main Method Strated");
    System.out.println("Main Excuting");
    int result=10/0;
    logger.info("Main Method Finished");
  }catch(ArithmeticException e)
    {
        logger.error("An Error Occured in Main",e);
    }

}

}