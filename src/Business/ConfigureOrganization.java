/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Database.mysqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static Business.ConfigureEcoSystem.DbConnection;

/**
 *
 * @author ASUS
 */
public class ConfigureOrganization {
    public int OrganizationID;
    public String OrganizationName;

    public int getOrganizationID() {
        return OrganizationID;
    }

    public void setOrganizationID(int OrganizationID) {
        this.OrganizationID = OrganizationID;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }
    
    public static ResultSet CheckOrganizationTableforData(String OrganizationName,String EnterPrise,String Ecosystem) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql4 = "SELECT * FROM organizations WHERE Organization_Name = ? AND EnterPrise = ? AND Ecosystem = ?;";
        PreparedStatement pst3 = DbConnection.prepareStatement(sql4);
        pst3.setString(1, OrganizationName);
        pst3.setString(2, EnterPrise);
        pst3.setString(3, Ecosystem);
        return pst3.executeQuery();
        
    }
    
    public static boolean CreateDatainOrganizationTable(int OrganizationID,String OrganizationName,String Ecosystem,String EnterPrise) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql3 = "INSERT INTO organizations (Organization_ID,Organization_Name,EnterPrise,Ecosystem) VALUES(?,?,?,?);";
        PreparedStatement pst2 = DbConnection.prepareStatement(sql3);
        pst2.setInt(1, OrganizationID);
        pst2.setString(2,OrganizationName );
        pst2.setString(3, EnterPrise);
        pst2.setString(4,Ecosystem );
        var isCreated = pst2.execute();
        
        return isCreated;
        
    }
    
    public static void UpdateDatainOrganizationTable(int OrganizationID, String UpdateOrganizationName,String UpdateEcosystem,String UpdateEnterPrise, String OriginalOrganizationName, String OriginalEcosystem,String OriginalEnterPriseName) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "UPDATE organizations SET Organization_ID = ?, Organization_Name = ?, Ecosystem = ?,EnterPrise = ? WHERE Organization_Name = ? AND Ecosystem = ? AND EnterPrise = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setInt(1, OrganizationID);
        pst.setString(2, UpdateOrganizationName );
        pst.setString(3,UpdateEcosystem );
        pst.setString(4, UpdateEnterPrise);
        pst.setString(5, OriginalOrganizationName);
        pst.setString(6, OriginalEcosystem);
        pst.setString(7, OriginalEnterPriseName);
        pst.execute();
        
        
    }
    
    public static void DeleteDatafromOrganizationSystemTable(String OrganizationName,String Ecosystem,String EnterPrise) throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "DELETE FROM organizations WHERE Organization_Name = ? AND Ecosystem = ? AND EnterPrise = ?;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        pst.setString(1, OrganizationName);
        pst.setString(2, Ecosystem);
        pst.setString(3, EnterPrise);
        pst.execute();
    }
    
    public static ResultSet GetAllDataFromOrganizationSystemTable() throws SQLException{
        DbConnection = mysqlConnection.getConnection();
        String sql = "SELECT * FROM organizations;";
        PreparedStatement pst = DbConnection.prepareStatement(sql);
        return pst.executeQuery();
    }
}
