package in.vamsoft.ratailentities;

import in.vamsoft.retaildaoimpl.CustomerDaoImpl;

public class RetailStore {

  String storeName;

  public RetailStore(String storeName) {
    super();
    this.storeName = storeName;
  }

  public void addCustomer(String name,int contactNo)
  {
    int customerId=CustomerDaoImpl.getLastCustomerId();
  }
 
}
