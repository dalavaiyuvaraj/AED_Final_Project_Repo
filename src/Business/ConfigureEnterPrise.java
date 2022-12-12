/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Database.mysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static Business.ConfigureEcoSystem.DbConnection;

/**
 *
 * @author monika
 */
public class ConfigureEnterPrise {
    public int EnterPriseID;
    public String EnterPriseName;
    
    public ConfigureEnterPrise(){
    }
    
    
    public static ResultSet CheckEnterPriseTableforData(String EnterPriseName,String Ecosystem) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql4 = "SELECT * FROM enterprises WHERE EnterPrise_Name = ? and Ecosystem = ?;";
        PreparedStatement pst3 = DbConnection.prepareStatement(sql4);
        pst3.setString(1, EnterPriseName);
        pst3.setString(2, Ecosystem);
        return pst3.executeQuery();
        
    }
    
    public static boolean CreateDatainEnterPriseTable(int EnterPriseID,String EnterPriseName,String Ecosystem) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql3 = "INSERT INTO enterprises (EnterPrise_ID,EnterPrise_Name,Ecosystem) VALUES(?,?,?);";
        PreparedStatement pst2 = DbConnection.prepareStatement(sql3);
        pst2.setInt(1, EnterPriseID);
        pst2.setString(2,EnterPriseName );
        pst2.setString(3, Ecosystem);
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
    
    public static void UpdateDatainEnterPriseTable(int EnterPriseID, String UpdateEnterPriseName,String UpdateEcosystem, String OriginalEnterPriseName, String OriginalEcosystem) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "UPDATE enterprises SET EnterPrise_ID = ?, EnterPrise_Name = ?, Ecosystem = ? WHERE EnterPrise_Name = ? AND Ecosystem = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setInt(1, EnterPriseID);
        pst.setString(2, UpdateEnterPriseName );
        pst.setString(3,UpdateEcosystem );
        pst.setString(4, OriginalEnterPriseName);
        pst.setString(5, OriginalEcosystem);
        pst.execute();
        
        
    }
    
    public static void DeleteDatafromEnterPriseSystemTable(String EnterPriseName,String Ecosystem) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "DELETE FROM enterprises WHERE EnterPrise_Name = ? AND Ecosystem = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, EnterPriseName);
        pst.setString(2, Ecosystem);
        pst.execute();
    }
    
    public static ResultSet GetAllDataFromEnterPriseSystemTable() throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT * FROM enterprises;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        return pst.executeQuery();
    }
    
    public static ResultSet GetAllEnterPrisesNames(String Ecosystem) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT EnterPrise_Name FROM enterprises WHERE Ecosystem = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, Ecosystem);
        
        
        return pst.executeQuery();
        
    }
    
    


    public int getEnterPriseID() {
        return EnterPriseID;
    }

    public void setEnterPriseID(int EnterPriseID) {
        this.EnterPriseID = EnterPriseID;
    }

    public String getEnterPriseName() {
        return EnterPriseName;
    }

    public void setEnterPriseName(String EnterPriseName) {
        this.EnterPriseName = EnterPriseName;
    }
    
    
}
