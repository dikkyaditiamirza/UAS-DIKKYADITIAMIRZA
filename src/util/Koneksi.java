/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DIKKY
 */
public class Koneksi {

    public Connection connect;
    public Statement state;
    public ResultSet res;
    String namaDatabase = "jdbc:mysql://localhost/DB_UAS_15311029_dikkyaditiamirza";

    public void koneksiDatabase() {
        try {
            connect = DriverManager.getConnection(namaDatabase, "pma", "");
            System.out.println("Terhubung");
            state = connect.createStatement();

        } catch(SQLException e)  {
            System.err.println("Cek Koneksi");
        }
    }

}
