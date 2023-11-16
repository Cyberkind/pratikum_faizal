/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class koneksi {
    static Connection konek;
    static ResultSet rs;
    static Statement st;
    
 public koneksi(){
     try {
         Class.forName("com.mysql.jdbc.Driver");
         konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tahap_faizal","root","");
     } catch (Exception error) {
         JOptionPane.showMessageDialog(null, error);
     }
}
 public ResultSet ambildata(String sql){
     try {
         st = konek.createStatement();
         rs = st.executeQuery(sql);
         return rs;
     } catch (Exception i) {
         JOptionPane.showMessageDialog(null, i);
         return null;
     }
 }
 public boolean rubahdata(String sql){
     try {
         st = konek.createStatement();
         st.executeUpdate(sql);
         return true;
     } catch (Exception j) {
         return false;     }
 }
}
