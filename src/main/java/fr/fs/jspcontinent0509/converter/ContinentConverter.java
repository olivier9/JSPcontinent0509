package fr.fs.jspcontinent0509.converter;

import fr.fs.jspcontinent0509.metier.Continent;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.inject.Inject;

public class ContinentConverter implements Converter {


    @Inject
    private fr.fs.jspcontinent0509.bean.ContinentBean continentBean;

    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {
            for (Continent continent : fr.fs.jspcontinent0509.bean.ContinentBean.getAllContinents()) {
                if (continent.getId() == Integer.parseInt(value)) {
                    return continent;
                }
            }
        }
        return null;
    }
    public String getAsString(FacesContext fc, UIComponent vic, Object object) {
        Continent continent = (Continent) object;
        return String.valueOf(continent.getId());
    }

}
