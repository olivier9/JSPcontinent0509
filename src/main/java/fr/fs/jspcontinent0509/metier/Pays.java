package fr.fs.jspcontinent0509.metier;

public class Pays {



    private int id;
    private String libelle;



    public Pays(Integer id, String libelle)
    {
        this.id = id;
        this.libelle = libelle;
    }

    public Integer getId()
    {
        return id;
    }

    public String getLibelle()
    {
        return libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pays pays = (Pays) o;

        return id == pays.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString()
    {
        return libelle;
    }
//newArray lsit
//couleurbean.getallCOuleur

}
