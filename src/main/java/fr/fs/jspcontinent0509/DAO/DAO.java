package fr.fs.jspcontinent0509.DAO;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class DAO<T,TSearch,TId> {
    protected Connection connexion;

    public DAO()
    {
        connexion = SDBMConnect.getInstance();
    }
    public abstract T getByID(TId id);
    public abstract ArrayList<T> getAll();
    public abstract ArrayList <T> getLike(TSearch objet);
    public abstract boolean insert(T objet);
    public abstract boolean update(T object);
    public abstract boolean delete( T object);
}