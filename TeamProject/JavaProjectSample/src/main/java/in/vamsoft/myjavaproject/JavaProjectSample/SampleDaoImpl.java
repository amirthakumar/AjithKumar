package in.vamsoft.myjavaproject.JavaProjectSample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleDaoImpl {

	static ResultSet rs;
	static ResultSet rs1, rs2, rs3;
	static Connection con = DbConnectionUtil.getConnection();
	static PreparedStatement statement;
	static PreparedStatement statement1;
	static PreparedStatement statement2, statement3, statement4, statement5, statement6;

	public static int getMax() throws SQLException {

		int lastRow = 0;
		statement4 = con.prepareStatement("select max(no) from details");

		// This is for get the last row in the details table

		rs2 = statement4.executeQuery();
		while (rs2.next()) {
			lastRow = rs2.getInt(1);
		}
		return lastRow;
	}

	public static void main(String args[]) throws SQLException {
		statement = con
				.prepareStatement("select sum(amount) from collection where loan_id=? and collection_type_id ='EMI_P'");

		statement2 = con
				.prepareStatement("select sum(amount) from collection where loan_id=? and collection_type_id='EMI_I';");

		statement3 = con.prepareStatement("update details set emi_i =? where no=?");

		statement5 = con.prepareStatement("select customer_id , customer_name from customer");

		statement6 = con.prepareStatement("update details set customer_id=? , customer_name=? where no = ?");

		// This is for EMI_P

		for (int i = 1; i <= 3; i++) {
			statement.setInt(1, i);
			rs = statement.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				statement1 = con.prepareStatement("insert into details (loan_id,emi_p) values(?,?)");
				statement1.setInt(1, i);
				statement1.setInt(2, rs.getInt(1));
				statement1.execute();
			}

		
		// This Is for calculate EMI_I from collection table
			statement2.setInt(1, i);
			rs1 = statement2.executeQuery();
			while (rs1.next()) {
				System.out.println(rs1.getInt(1));
				int lastRow = getMax();

				// This is for update EMI_I in the details table

				statement3.setInt(1, rs1.getInt(1));
				statement3.setInt(2, lastRow);
				statement3.execute();

			}
		

		// This is for select customer name and customer id from the customer table
			rs3 = statement5.executeQuery();
			while (rs3.next()) {
				// This is for update customer id and customer name into the details table

				statement6.setInt(1, rs3.getInt(1));
				statement6.setString(2, rs3.getString(2));
				statement6.setInt(3, getMax());
				statement6.execute();
			}
		}
	}
}
