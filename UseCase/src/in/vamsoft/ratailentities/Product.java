package in.vamsoft.ratailentities;

import org.apache.log4j.Logger;

public class Product {

  private int productId;
  private String productName;
  private double productPrice;
  private long quantity;
  public static Logger logger = Logger.getLogger(Product.class);

  /**
   * @param productId
   *          store productId.
   * @param productName
   *          stores productName.
   * @param productPrice
   *          store product Price .
   * @param quantity
   *          stores total quantity of the product .
   */
  public Product(int productId, String productName, double productPrice, long quantity) {
    super();
    this.productId = productId;
    this.productName = productName;
    this.productPrice = productPrice;
    this.quantity = quantity;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

}
