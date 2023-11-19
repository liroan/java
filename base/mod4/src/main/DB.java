package main;

import java.sql.*;

public class DB {
    private final String HOST = "localhost";
    private final String PORT = "3000";
    private final String DB_NAME = "mod4";
    private final String LOGIN = "root";
    private final String PASS = "root";
    private Connection dbConnect = null;

    private Connection getDbConnect() throws ClassNotFoundException, SQLException {
        String ConnectStr = "jdbc:mysql://" + HOST + ":" + PORT + "/" +DB_NAME;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnect = DriverManager.getConnection(ConnectStr, LOGIN, PASS);

        return dbConnect;
    }

    public void isConnect() throws SQLException, ClassNotFoundException {
        dbConnect = getDbConnect();

        System.out.println(dbConnect.isValid(1000));
    }

    public ResultSet getArtUser() throws SQLException, ClassNotFoundException{
        String query = "SELECT * FROM users WHERE login='john'";

        Statement statement = getDbConnect().createStatement();

        ResultSet user = statement.executeQuery(query);

        return user;
    }

    public ResultSet getArtItem() throws SQLException, ClassNotFoundException{
        String query = "SELECT * FROM items WHERE category='hats'";

        Statement statement = getDbConnect().createStatement();

        ResultSet item = statement.executeQuery(query);

        return item;
    }

    public ResultSet getArtUserId(String id) throws SQLException, ClassNotFoundException{
        String query = "SELECT * FROM users WHERE id=" + id;

        Statement statement = getDbConnect().createStatement();

        ResultSet user = statement.executeQuery(query);

        return user;
    }

    public ResultSet getArtOrd() throws SQLException, ClassNotFoundException{
        String query = "SELECT * FROM orders";

        Statement statement = getDbConnect().createStatement();

        ResultSet item = statement.executeQuery(query);

        return item;
    }

    public void insertArt(String user_id, String item_id) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO orders (user_id, item_id) VALUES (?, ?)";

        PreparedStatement preparedStatement = getDbConnect().prepareStatement(query);

        preparedStatement.setString(1, user_id);

        preparedStatement.setString(2, item_id);

        preparedStatement.executeUpdate();
    }

    public ResultSet getArtItemId(String id) throws SQLException, ClassNotFoundException{
        String query = "SELECT * FROM items WHERE id=" + id;

        Statement statement = getDbConnect().createStatement();

        ResultSet item = statement.executeQuery(query);

        return item;
    }
}
