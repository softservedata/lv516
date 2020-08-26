package com.softserve.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class App {
    public static final Logger logger = LoggerFactory.getLogger(App.class);
    
    public static void main(String[] args) throws SQLException {
        logger.info("Start Program");
        System.out.println("Hello World!");
        //
        Gson gson = new Gson();
        Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
        String ser = gson.toJson(student);
        System.out.println("ser = " + ser);
        //
        Student unknown = gson.fromJson(ser, Student.class);
        System.out.println("unknown = " + unknown);
        //
        String username = "postgres";
        String password = "root";
        String url = "jdbc:postgresql://localhost:5432/greencity";
        DriverManager.registerDriver(new org.postgresql.Driver());
        Connection con = DriverManager.getConnection(url, username, password);
        if (con != null) {
            //System.out.println("Connection Successful! \n");
            logger.info("Connection Successful! \n");
        } else {
            //System.out.println("Connection ERROR \n");
            logger.info("Connection ERROR \n");
            System.exit(1);
        }
        //
        Statement st = con.createStatement();
        //st.execute("INSERT INTO person (city,name) VALUES ('London','Michael');");
        //st.execute("INSERT INTO person (city,name) VALUES ('New-York','Tom');");
        //st.execute("INSERT INTO person (city,name) VALUES ('New Orleans','Petro');");
        //st.execute("UPDATE person SET city='Paris' WHERE city LIKE 'New%';");
        //st.execute("DELETE FROM person WHERE name='Tom';");
        ResultSet rs = st.executeQuery("SELECT * FROM person;");
        //
        int columnCount = rs.getMetaData().getColumnCount();
        // Resultset.getMetaData () get the information
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + "\t");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        //System.out.println("before close");
        logger.error("before close");
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
    }
}
