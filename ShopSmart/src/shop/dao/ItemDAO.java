package shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import shop.entity.*;
import shop.util.*;

public class ItemDAO {

    // Add an item to the "items" table
    public void addItem(Item item) {
        String sql = "insert into items (item_name, price, category) VALUES (?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, item.getItemName());
            stmt.setDouble(2, item.getPrice());
            stmt.setString(3, item.getCategory());

            stmt.executeUpdate();
            System.out.println("Item added successfully!");

        } catch (SQLException e) {
            System.err.println("Error adding item: " + e.getMessage());
        }
    }

    // Update an item in the "items" table
    public void updateItem(int itemId, double newPrice) {
        String sql = "UPDATE items SET price = ? WHERE item_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setDouble(1, newPrice);
            stmt.setInt(2, itemId);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Item updated successfully!");
            } else {
                System.out.println("Item not found.");
            }

        } catch (SQLException e) {
            System.err.println("Error updating item: " + e.getMessage());
        }
    }

    // Delete an item from the "items" table
    public void deleteItem(int itemId) {
        String sql = "DELETE FROM items WHERE item_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, itemId);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Item deleted successfully!");
            } else {
                System.out.println("Item not found.");
            }

        } catch (SQLException e) {
            System.err.println("Error deleting item: " + e.getMessage());
        }
    }
}
