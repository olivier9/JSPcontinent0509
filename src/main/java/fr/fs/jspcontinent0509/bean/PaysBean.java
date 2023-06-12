package fr.fs.jspcontinent0509.bean;


import fr.fs.jspcontinent0509.DAO.DAOFactory;
import fr.fs.jspcontinent0509.metier.Continent;
import fr.fs.jspcontinent0509.metier.Pays;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("paysBean")
@SessionScoped
public class PaysBean implements Serializable {

    //    PaysAffiche
//    AllPays
//    AllPays
//    Selected
//    PaysSelected
    private static List<Pays> allPays;

    private Pays paysSelected;

    @PostConstruct
    private void init()
    {
        allPays = DAOFactory.getPaysDAO().getAll();
    }
    public List<Pays> getCountinent() {

        return allPays;
    }
    public void setPayselected(Pays paysSelected) {

        this.paysSelected = paysSelected;
    }

    public static List<Pays> getAllPays() {
        return allPays;
    }

    public static void setAllPays(List<Pays> allPays) {
        PaysBean.allPays = allPays;
    }

    public Pays getPaysSelected() {
        return paysSelected;
    }


    public void paysChanged(ValueChangeEvent e)
    {
        Pays nouvellePays = (Pays) e.getNewValue();
        //faire qq chose avec nouvelle pays
    }


}
