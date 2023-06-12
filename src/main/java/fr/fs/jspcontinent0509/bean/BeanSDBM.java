package fr.fs.jspcontinent0509.bean;

import fr.fs.jspcontinent0509.DAO.DAOFactory;
import fr.fs.jspcontinent0509.metier.Continent;
import fr.fs.jspcontinent0509.metier.Couleur;

import java.util.ArrayList;

public class BeanSDBM {


    private ArrayList<Continent> continents;
    private ArrayList<Couleur> couleurs;

    public BeanSDBM() {
        continents = DAOFactory.getContinentDAO().getAll();
        couleurs = DAOFactory.getCouleurDAO().getAll();
    }

    public ArrayList<Continent> getContinents() {
        return continents;
    }

    public ArrayList<Couleur> getCouleurs() {
        return couleurs;
    }
}
