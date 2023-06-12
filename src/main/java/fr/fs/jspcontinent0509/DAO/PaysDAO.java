package fr.fs.jspcontinent0509.DAO;

import fr.fs.jspcontinent0509.metier.Continent;
import fr.fs.jspcontinent0509.metier.Pays;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PaysDAO extends DAO<Pays, Pays, Integer> {
    public ArrayList<Pays> getAll() {
        ResultSet rs;
        ArrayList<Pays> liste = new ArrayList<Pays>();
        try (Statement stmt = connexion.createStatement()) {
            String strCmd = "SELECT id_pays ,nom_pays from pays order by nom_pays";
            rs = stmt.executeQuery(strCmd);
            while (rs.next()) {
                liste.add(new Pays(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }

    public boolean update(Pays pays) {
        try {

            Statement stmt = connexion.createStatement();

            // Determine the column set column


            String strCmd = "update Pays set nom_pays = " + pays.getLibelle() + " where id_pays = "
                    + pays.getId();
            stmt.execute(strCmd);

            return true;
        } catch (SQLException e) {

            return false;
        }
    }

    public boolean insert(Pays pays) {
        try {
            Statement stmt = connexion.createStatement();
            // Determine the column set column

            String strCmd = "insert into Pays values " + pays.getLibelle();
            stmt.execute(strCmd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Pays getByID(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(Pays object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<Pays> getLike(Pays objet) {
        // TODO Auto-generated method stub
        return null;
    }
}
