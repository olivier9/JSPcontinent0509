package fr.fs.jspcontinent0509.bean;

import fr.fs.jspcontinent0509.DAO.DAOFactory;
import fr.fs.jspcontinent0509.metier.Continent;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("continentBean")
@SessionScoped
public class ContinentBean implements Serializable {

    //    PaysAffiche
//    AllContinent
//    AllPays
//    ContinentSelected
//    PaysSelected
    private static List<Continent> allContinents;

    private Continent continentSelected;

    @PostConstruct
    private void init()
    {
        allContinents = DAOFactory.getContinentDAO().getAll();
    }
    public List<Continent> getCountinent() {

        return allContinents;
    }
    public void setContinentSelected(Continent continentSelected) {

        this.continentSelected = continentSelected;
    }

    public static List<Continent> getAllContinents() {
        return allContinents;
    }

    public static void setAllContinents(List<Continent> allContinents) {
        ContinentBean.allContinents = allContinents;
    }

    public Continent getContinentSelected() {
        return continentSelected;
    }


    public void continentChanged(ValueChangeEvent e)
    {
        Continent nouvelleContinent = (Continent) e.getNewValue();
        //faire qq chose avec nouvelle continent
    }


}
