package fr.fs.jspcontinent0509.DAO;
import fr.fs.jspcontinent0509.metier.Continent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class ContinentDAO extends DAO<Continent, Continent, Integer> {
    public ArrayList<Continent> getAll() {
        ResultSet rs;
        ArrayList<Continent> liste = new ArrayList<Continent>();
        try (Statement stmt = connexion.createStatement()) {
            String strCmd = "SELECT id_continent ,nom_continent from continent order by nom_continent";
            rs = stmt.executeQuery(strCmd);
            while (rs.next()) {
                liste.add(new Continent(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }

    public boolean update(Continent continent) {
        try {

            Statement stmt = connexion.createStatement();

            // Determine the column set column


            String strCmd = "update Continent set nom_continent = " + continent.getLibelle() + " where id_continent = "
                    + continent.getId();
            stmt.execute(strCmd);

            return true;
        } catch (SQLException e) {

            return false;
        }
    }

    public boolean insert(Continent continent) {
        try {
            Statement stmt = connexion.createStatement();
            // Determine the column set column

            String strCmd = "insert into Continent values " + continent.getLibelle();
            stmt.execute(strCmd);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Continent getByID(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean delete(Continent object) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<Continent> getLike(Continent objet) {
        // TODO Auto-generated method stub
        return null;
    }
}
