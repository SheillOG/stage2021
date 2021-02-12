/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.sheill.projetstage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Theo
 */
public class SqlManager {

    /**
     * Membres static (de classe)
     *
     */
    private static String ip = "127.0.0.1";
    private static String port = "3308";
    private static String nomBdd = "stage";
    private static String nomUtilisateur = "root";
    private static String motDePasse = "";

//    private static String nomServeur = "10.0.10.130";
//    private static String port = "3306";
//    private static String nomBdd = "testtheo";
//    private static String nomUtilisateur = "root";
//    private static String motDePasse = "root";

    private static String chaineConnexion;

    //propriété non statique
    private Connection connexion;

    private static SqlManager monDao = null;

    /**
     * Constructeur privé ! pour construire un objet, il faut utiliser la
     * méthode publique statique getDaoSIO
     *
     */
    private SqlManager() {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            //Définition de l'emplacement de la BDD
            SqlManager.chaineConnexion = "jdbc:mysql://" + SqlManager.ip + ":" + SqlManager.port + "/" + SqlManager.nomBdd;

            //Création de la connexion à la BDD
            this.connexion = (Connection) DriverManager.getConnection(SqlManager.chaineConnexion, SqlManager.nomUtilisateur, SqlManager.motDePasse);

        } catch (SQLException ex) {
            Logger.getLogger(SqlManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * Permet d'obtenir l'objet instancié
     * @return un Objet SqlManager avec connexion active ... pour une certaine durée
     */
    public static SqlManager getInstance() {

        if (SqlManager.monDao==null ) {
            SqlManager.monDao = new SqlManager();
        }else{
            if(!SqlManager.monDao.connexionActive()){
                SqlManager.monDao = new SqlManager();
            }
        }
        return SqlManager.monDao;
    }

    public Boolean connexionActive() {
        Boolean connexionActive = true;
        try {
            if (this.connexion.isClosed()) {
                connexionActive = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connexionActive;
    }
    /**
     *
     * @param sql, comportera un ordre selec
     * @return
     */
    public ResultSet requeteSelection(String sql){

        try {
            Statement requete=new SqlManager().connexion.createStatement();
            return requete.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(SqlManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
    /**
     *
     * @param sql, comportera un ordre insert, update, select, alter, etc.
     * @return le nombre de lignes impactées par la requête action
     *
     */
    public Integer requeteAction(String sql){

        try {
            Statement requete=new SqlManager().connexion.createStatement();
            return requete.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(SqlManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

}
