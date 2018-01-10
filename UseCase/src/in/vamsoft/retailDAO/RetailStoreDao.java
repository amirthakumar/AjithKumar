package in.vamsoft.retailDAO;

public interface RetailStoreDao {

  String INSERT_CUSTOMER_QUERY = "insert into customeraji values(?,?,?)";
  String INSERT_PRODUCT_QUERY = "insert into productaji values(?,?,?,?)";
  String CHECK_PRODUCT_AVAIL = "select quantity from productaji where productname=?";
  String INSERT_INVOICE_QUERY = "insert into invoiceaji values(?,?,?,?)";
  String CHECK_PRODUCT_PRICE = "select price from productaji where productname=?";

  /**
   * @param name
   *          used to give the customer name.
   * @param contactNo
   *          used to add the contact Number.
   */
  void addCustomer(String name, long contactNo);

  /**
   * @param name
   *          used to add the product name into the database.
   * @param price
   *          used to give the price for that particular product.
   * @param quantity
   *          used to give the total quantity of the particular product.
   */
  void addProduct(String name, double price, long quantity);

  int checkProductAvailability(String productName);

}