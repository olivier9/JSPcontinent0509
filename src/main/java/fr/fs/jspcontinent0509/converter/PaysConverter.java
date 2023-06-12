package fr.fs.jspcontinent0509.converter;

import fr.fs.jspcontinent0509.metier.Continent;
import fr.fs.jspcontinent0509.metier.Pays;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;

public class PaysConverter {



    @Inject
    private fr.fs.jspcontinent0509.bean.PaysBean paysBean;

    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {
            for (Pays pays : fr.fs.jspcontinent0509.bean.PaysBean.getAllPays()) {
                if (pays.getId() == Integer.parseInt(value)) {
                    return pays;
                }
            }
        }
        return null;
    }
    public String getAsString(FacesContext fc, UIComponent vic, Object object) {
        Pays pays = (Pays) object;
        return String.valueOf(pays.getId());
    }

}


