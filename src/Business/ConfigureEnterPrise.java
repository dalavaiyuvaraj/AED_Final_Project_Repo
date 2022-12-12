/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ConfigureEnterPrise {
    public static ArrayList<ConfigureOrganization> OrganizationList;
    public int EnterPriseID;
    public String EnterPriseName;
    
    public ConfigureEnterPrise(){
    }
    
    

    public static ArrayList<ConfigureOrganization> getOrganizationList() {
        return OrganizationList;
    }

    public static void setOrganizationList(ArrayList<ConfigureOrganization> OrganizationList) {
        ConfigureEnterPrise.OrganizationList = OrganizationList;
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
