package fr.fs.jspcontinent0509.DAO;

public class DAOFactory {
    public static CouleurDAO getCouleurDAO() {
        return new CouleurDAO();
    }
    public static ContinentDAO getContinentDAO() {
        return new ContinentDAO();
    }
    public static PaysDAO getPaysDAO() {
        return new PaysDAO();
    }
}
