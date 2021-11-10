/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeremie
 */
public class FonctionMetier implements Imetier {
    private Connection cnx;
    private ResultSet rs;
    private PreparedStatement ps;

   
public Utilisateur getUnUser(String login, String mdp) {
Utilisateur unUser = null;
try {
cnx = ConnexionBDD.getCnx();
ps = cnx.prepareStatement("select idUser, nomUser, statutUser from User where loginUser = '"+login+"', and pwdUser = '"+mdp+"'");
//rs = resultSet
rs = ps.executeQuery();
if (rs.next()) {
    unUser = new Utilisateur(rs.getInt(1),rs.getString(2), rs.getString(3));
    
}


} catch (SQLException ex) {
Logger.getLogger(FonctionMetier.class.getName()).log(Level.SEVERE, null, ex);
}
return unUser;
}

    @Override
    public Utilisateur getUnUsers(String login, String mdp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    
    }
    
    
    
    
}
