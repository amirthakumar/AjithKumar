package in.vamsoft.retaildaoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.vamsoft.retailDAO.RetailStoreDao;

public class RetailStoreImpl implements RetailStoreDao {

  PreparedStatement prepare;
  Connection con = DbConnection.getConnection();
  ResultSet rs;

  @Override
  public void addCustomer(String name, long contactNo) {

    int lastCustomerId = CustomerDaoImpl.getLastCustomerId();
    try {
      prepare = con.prepareStatement(INSERT_CUSTOMER_QUERY);
      prepare.setInt(1, lastCustomerId + 1);
      prepare.setString(2, name);
      prepare.setLong(3, contactNo);
      int n = prepare.executeUpdate();
      if (n > 0) {
        System.out.println("Customer Added Successfully");
      } else {
        System.out.println("Customer Deatils Not Uploded into the dataBase");
      }

    } catch (SQLException e) {

      e.printStackTrace();
    }

  }

  public void addProduct(String name, double price, long quantity) {
    int lastProductId = ProductDaoImpl.getLastProductId();
    try {
      prepare = con.prepareStatement(INSERT_PRODUCT_QUERY);
      prepare.setInt(1, lastProductId + 1);
      prepare.setString(2, name);
      prepare.setDouble(3, price);
      prepare.setLong(4, quantity);
      int n = prepare.executeUpdate();
      if (n > 0) {
        System.out.println("Product Added Successfully");
      } else {
        System.out.println("Product Details Not Uploded into the dataBase");
      }

    } catch (SQLException e) {

      e.printStackTrace();
    }

  }

  public int checkProductAvailability(String productName) {

    try {
      prepare = con.prepareStatement(CHECK_PRODUCT_AVAIL);
      prepare.setString(1, productName);
      rs = prepare.executeQuery();
      while (rs.next()) {
        return rs.getInt(1);
      }

    } catch (SQLException e) {

      e.printStackTrace();
    }
    return 0;

  }

  /**
   * @param customerID
   *          used to book the product of the particular customer id .
   * @param productName
   *          used to get the product name from the customer .
   * @param qtyOfProduct
   *          used to get the quantity of the product as he want .
   * @return the total quantity of the product available in the database .
   */
  public int bookProduct(int customerID, String productName, int qtyOfProduct) {

    int avail = checkProductAvailability(productName);
    if (avail > 0) {
      int custavail = CustomerDaoImpl.checkCustomerId(customerID);
      if (custavail == 1) {
        try {
          prepare = con.prepareStatement(CHECK_PRODUCT_PRICE);
          prepare.setString(1, productName);
          rs = prepare.executeQuery();
          while (rs.next()) {
            int price = rs.getInt(1);
          }

        } catch (SQLException e) {

          e.printStackTrace();
        }

      }
    }

    return qtyOfProduct;

  }

}
