package in.vamsoft.retailtest;

import in.vamsoft.retailDAO.RetailDaoFactory;
import in.vamsoft.retailDAO.RetailStoreDao;

public class RetailTest {

  /**
   * @param args
   *          used to get the command line arguements .
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    RetailStoreDao obj = RetailDaoFactory.getInstance();
    obj.addCustomer("Sathish", 123459876);
    obj.addProduct("Pc", 20000, 150);
    System.out.println(obj.checkProductAvailability("Pc"));

  }

}
