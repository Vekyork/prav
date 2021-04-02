package ru.geekbrains.lesson9;

import java.sql.*;


public class DatabaseExample {
    //    private final static String QUERY = "select *";
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement ps;
    private static CallableStatement cs;

    public static void main(String[] args) {
        try {
            connect();
            dropCreate();
            prepareStatement();

//            cs = connection.prepareCall("{call insert_cat(?,?,?)}");
//            cs.setString(1, "dfgfgfg");

            try {
                connection.setAutoCommit(false);
                statement.executeUpdate("insert into cats (name, color, age) values ('Petya', 'Grey',8);");
//                Savepoint savepoint = connection.setSavepoint();
                statement.executeUpdate("insert into cats (name, color, age) values ('Vasya', 'Red', 9);");
//                connection.rollback(savepoint);
                statement.executeUpdate("insert into cats (name, color, age) values ('Jorik', 'White',5);");
//                connection.setAutoCommit(true);
            } catch (SQLException throwables) {
                connection.rollback();
            }

            connection.commit();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void readExample() throws SQLException {
        try (ResultSet rs = statement.executeQuery("select name, color from cats like 'Black', age = 2;")) {
            while (rs.next()) {
                System.out.printf("Cat: %s >>>>>> %d \n", rs.getString("name"), rs.getString("color"), rs.getInt("age"));
            }
        }
    }

//    private static void batchEx() throws SQLException {
//        long now = System.currentTimeMillis();
//        connection.setAutoCommit(false);
//        for (int i = 0; i < 30_000; i++) {
//            ps.setString(1, "Vasya_" + i);
//            ps.setInt(2, i);
//            ps.addBatch();
//        }
//        try {
//            ps.executeBatch();
//        } catch (Exception e) {
//            connection.rollback();
//        }
//        connection.commit();
//        System.out.println(System.currentTimeMillis() - now);
//    }

    private static void psInsertEx() throws SQLException {
        for (int i = 0; i < 30; i++) {
            ps.setString(1, "Vasya_" + i);
            ps.setString(2, "Rodjer" +i);
            ps.setInt(2, i * 10);
            ps.executeUpdate();
        }
    }

    private static void updateEx() throws SQLException {
        int upd1 = statement.executeUpdate("update cats set name = 'John' where score > 2;");
        int upd2 = statement.executeUpdate("update cats set color = 'Black' where name = 'John_0';");
        int upd3 = statement.executeUpdate("delete from cats where name like 'Vasya%';");
        System.out.println("Updated: " + upd1);
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("insert into cats (name, color, age) values ('Petya', 'Black', 3);");
    }

    private static void dropCreate() throws SQLException {
        statement.execute("drop table if exists cats;");
        statement.execute("create table if not exists cats (id integer primary key autoincrement, name text, color text, age integer);");
    }


    private static void disconnect() {
        try {
            if (statement != null) statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void prepareStatement() throws SQLException {
        ps = connection.prepareStatement("insert into cats (name, color, age) values (?, ?, ?);");
    }

    private static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:cats.db");
        statement = connection.createStatement();
    }
}