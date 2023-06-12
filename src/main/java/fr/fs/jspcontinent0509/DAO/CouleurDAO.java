package fr.fs.jspcontinent0509.DAO;

import fr.fs.jspcontinent0509.metier.Couleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CouleurDAO extends DAO<Couleur, Couleur, Integer>{

    public ArrayList<Couleur> getAll() {
        ResultSet rs;
        ArrayList<Couleur> liste = new ArrayList<Couleur>();
        try (Statement stmt = connexion.createStatement()) {
            String strCmd = "SELECT id_couleur ,nom_couleur from couleur order by nom_couleur";
            rs = stmt.executeQuery(strCmd);
            while (rs.next()) {
                liste.add(new Couleur(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }

    public boolean update(Couleur couleur) {
        try {

            Statement stmt = connexion.createStatement();

            // Determine the column set column


            String strCmd = "update Couleur set nom_couleur = " + couleur.getLibelle() + " where id_couleur = "
                    + couleur.getId();
            stmt.execute(strCmd);

            return true;
        } catch (SQLException e) {

            return false;
        }
    }

    public boolean insert(Couleur couleur) {
        try {
            Statement stmt = connexion.createStatement();
            // Determine the column set column

            String strCmd = "insert into Couleur values " + couleur.getLibelle();
            stmt.execute(strCmd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Couleur getByID(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(Couleur object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<Couleur> getLike(Couleur objet) {
        // TODO Auto-generated method stub
        return null;
    }

}
