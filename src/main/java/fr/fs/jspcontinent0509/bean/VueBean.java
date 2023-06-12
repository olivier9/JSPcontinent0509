package fr.fs.jspcontinent0509.bean;
import fr.fs.jspcontinent0509.DAO.DAOFactory;
import fr.fs.jspcontinent0509.metier.Continent;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named("vueBean")
@SessionScoped
public class VueBean implements Serializable {
    private static List<Continent> allContinents;
    private Continent continentSelected;
    @PostConstruct
    private void init() {
        allContinents = DAOFactory.getContinentDAO().getAll();
    }

    public List<Continent> getAllContinents() {
        return allContinents;
    }

    public void setContinentSelected(Continent countinentSelected) {
        this.continentSelected = continentSelected;
    }
    //newArray lsit
//couleurbean.getallCOuleur
}