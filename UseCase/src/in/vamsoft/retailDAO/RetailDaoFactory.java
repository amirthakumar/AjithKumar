package in.vamsoft.retailDAO;

import in.vamsoft.retaildaoimpl.RetailStoreImpl;

public class RetailDaoFactory {

  public static RetailStoreDao getInstance()
  {
    return new RetailStoreImpl();
  }
}
