package fr.fs.jspcontinent0509.converter;

import fr.fs.jspcontinent0509.metier.Couleur;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;

@FacesConverter(value = "couleurConverter", managed = true)
public class CouleurConverter implements Converter {
    @Inject
    private fr.fs.jspcontinent0509.bean.CouleurBean couleurBean;

    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {
            for (Couleur couleur : fr.fs.jspcontinent0509.bean.CouleurBean.getAllCouleurs()) {
                if (couleur.getId() == Integer.parseInt(value)) {
                    return couleur;
                }
            }
        }
        return null;
    }
    public String getAsString(FacesContext fc, UIComponent vic, Object object) {
        Couleur couleur = (Couleur) object;
        return String.valueOf(couleur.getId());
    }
}
