/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sheill.projetstage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Theo
 */
public class Manager {
    
    private static String ipServer = "127.0.0.1";
    private static String port = "3308";
    private static String nomBDD = "stage";
    private static String login = "root";
    private static String password = "";
    
    private static String ChaineConnexion;
    
    private Connection connexion;
    
    private static Manager Connector = null;
    
    private Manager() {
        try{
            Manager.ChaineConnexion =  "jdbc:mysql://" + Manager.ipServer + ":" + Manager.port + "/" + Manager.nomBDD;
            this.connexion = (Connection) DriverManager.getConnection(Manager.ChaineConnexion, Manager.login, Manager.password);
            
        } catch (SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
    
    
}
