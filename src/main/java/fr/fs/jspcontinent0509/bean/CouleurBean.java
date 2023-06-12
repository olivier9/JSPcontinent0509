package fr.fs.jspcontinent0509.bean;

import fr.fs.jspcontinent0509.DAO.DAOFactory;
import fr.fs.jspcontinent0509.metier.Couleur;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("couleurBean")
@SessionScoped
public class CouleurBean implements Serializable {

    private static List<Couleur> allCouleurs;

    private Couleur couleurSelected;

    @PostConstruct
    private void init()
    {
        allCouleurs = DAOFactory.getCouleurDAO().getAll();
    }

    public List<Couleur> getCouleurs() {

        return allCouleurs;
    }

    public void setCouleurSelected(Couleur couleurSelected) {

        this.couleurSelected = couleurSelected;
    }

    public static List<Couleur> getAllCouleurs() {
        return allCouleurs;
    }

    public static void setAllCouleurs(List<Couleur> allCouleurs) {
        CouleurBean.allCouleurs = allCouleurs;
    }

    public Couleur getCouleurSelected() {
        return couleurSelected;
    }

    public void couleurChanged(ValueChangeEvent e)
    {
        Couleur nouvelleCouleur = (Couleur) e.getNewValue();
        //faire qq chose avec nouvelle couleur
    }
}
