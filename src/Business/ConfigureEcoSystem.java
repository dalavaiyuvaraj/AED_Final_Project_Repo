/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Database.mysqlConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class ConfigureEcoSystem {
    public static ArrayList<ConfigureEnterPrise> EnterPriseList = new ArrayList<>();
    public static ArrayList<ConfigureEcoSystem> EcoSystemList = new ArrayList<>();
    public int EcoSystemID;
    public String EcoSystemName;
    static Connection ecosystemConnection;
    
    public ConfigureEcoSystem(){
        
        
    }
    
    public static ResultSet GetAllDataFromEcoSystemTable() throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql = "SELECT * FROM ecosystems;";
        PreparedStatement pst = ecosystemConnection.prepareStatement(sql);
        return pst.executeQuery();
    }
    
    public static void DeleteDatafromEcoSystemTable(String EcoName) throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql = "DELETE FROM ecosystems WHERE EcosystemName = ?;";
        PreparedStatement pst = ecosystemConnection.prepareStatement(sql);
        pst.setString(1, EcoName);
        pst.execute();
        
        
        
    }
    
    public static ResultSet GetAllEcosystemNames() throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql = "SELECT EcosystemName FROM ecosystems;";
        PreparedStatement pst = ecosystemConnection.prepareStatement(sql);
        
        
        return pst.executeQuery();
        
    }
    
    public static void UpdateDatainEcoSystemTable(int EcoID, String UpdateEcoName, String OriginalEcoName) throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql = "UPDATE ecosystems SET EcosystemID = ?, EcosystemName = ? WHERE EcosystemName = ?;";
        PreparedStatement pst = ecosystemConnection.prepareStatement(sql);
        pst.setInt(1, EcoID);
        pst.setString(2, UpdateEcoName );
        pst.setString(3,OriginalEcoName );
        pst.execute();
        
        
    }
    
    public static ResultSet CheckDBforEcosystem() throws SQLException{
        
        ecosystemConnection = mysqlConnection.getConnection();
        String sql1 = """
                      SELECT table_name, table_schema, table_type
                      FROM information_schema.tables
                      WHERE table_name = 'ecosystems' and table_schema = 'projectdatabase'
                      ORDER BY table_name ASC;""";
       
            PreparedStatement pst = ecosystemConnection.prepareStatement(sql1);
            ResultSet rs = pst.executeQuery();
            return rs;
        
    }
    
    public static void CreateTableforEcosystem() throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql2 = "CREATE TABLE ecosystems (EcosystemID int NOT NULL,EcosystemName varchar(100) NOT NULL UNIQUE);";
        PreparedStatement pst1 = ecosystemConnection.prepareStatement(sql2);
        pst1.execute();
        
    }
    public static boolean CreateDatainEcosystemTable(int ecoID,String EcoName) throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql3 = "INSERT INTO ecosystems (EcosystemID,EcosystemName) VALUES(?,?);";
        PreparedStatement pst2 = ecosystemConnection.prepareStatement(sql3);
        pst2.setInt(1, ecoID);
        pst2.setString(2,EcoName );
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
    public static ResultSet CheckEcosystemTableforData(String EcosystemName) throws SQLException{
        ecosystemConnection = mysqlConnection.getConnection();
        String sql4 = "SELECT * FROM ecosystems WHERE EcosystemName = ?;";
        PreparedStatement pst3 = ecosystemConnection.prepareStatement(sql4);
        pst3.setString(1, EcosystemName);
        return pst3.executeQuery();
        
    }

    public int getEcoSystemID() {
        return EcoSystemID;
    }

    public void setEcoSystemID(int EcoSystemID) {
        this.EcoSystemID = EcoSystemID;
    }

    public String getEcoSystemName() {
        return EcoSystemName;
    }

    public void setEcoSystemName(String EcoSystemName) {
        this.EcoSystemName = EcoSystemName;
    }


    public ArrayList<ConfigureEnterPrise> getEnterPriseList() {
        return EnterPriseList;
    }

    public void setEnterPriseList(ArrayList<ConfigureEnterPrise> EnterPriseList) {
        this.EnterPriseList = EnterPriseList;
    }
    
}
