import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost/baza_de_date"; // Schimbați "nume_baza_de_date" cu numele bazei de date
    private static final String USER = "root"; // Schimbați "username" cu utilizatorul MySQL
    private static final String PASSWORD = ""; // Schimbați "parola" cu parola utilizatorului MySQL

    public void insertPerson(Person person) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO persoane (id, first_name, last_name, salary, hire_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, person.getId());
            stmt.setString(2, person.getFirstName());
            stmt.setString(3, person.getLastName());
            stmt.setDouble(4, person.getSalary());
            stmt.setString(5, person.getHireDate());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void displayAllPeople() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "SELECT * FROM persoane";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                double salary = rs.getDouble("salary");
                String hireDate = rs.getString("hire_date");

                Person person = new Person(id, firstName, lastName, salary, hireDate);
                person.displayInfo();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
