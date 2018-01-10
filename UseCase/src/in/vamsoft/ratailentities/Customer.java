package in.vamsoft.ratailentities;

public class Customer {

  private int customerId;
  private String customerName;
  private int contactNum;

  /**
   * @param customerId
   *          stores Customer Id.
   * @param customerName
   *          stores CustomerNmae
   * @param contactNum
   *          stores contact Number into the dataBase.
   */
  public Customer(int customerId, String customerName, int contactNum) {
    super();
    this.customerId = customerId;
    this.customerName = customerName;
    this.contactNum = contactNum;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public int getContactNum() {
    return contactNum;
  }

  public void setContactNum(int contactNum) {
    this.contactNum = contactNum;
  }

  

}
