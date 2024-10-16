package shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import shop.util.DatabaseConnection;

public class OrderDAO {

    // Retrieve order history for a specific user
    public void displayOrderHistory(String userName) {
        String sql = "SELECT order_id, total_price FROM orders WHERE user_name = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, userName);
            ResultSet rs = stmt.executeQuery();

            if (!rs.isBeforeFirst()) {  // Check if the result set is empty
                System.out.println("No order history found for user: " + userName);
                return;
            }

            System.out.println("Order History for " + userName + ":");
            while (rs.next()) {
                System.out.println("Order ID: " + rs.getString("order_id") + 
                                   ", Total Price: $" + rs.getDouble("total_price"));
            }

        } catch (SQLException e) {
            System.err.println("Error retrieving order history: " + e.getMessage());
        }
    }
}
