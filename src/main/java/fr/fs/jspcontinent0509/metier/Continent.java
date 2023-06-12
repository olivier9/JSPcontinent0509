package fr.fs.jspcontinent0509.metier;

public class Continent {


    private int id;
    private String libelle;

    public Continent()
    {

    }

    public Continent(Integer id, String libelle)
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

        Continent continent = (Continent) o;

        return id == continent.id;
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


}
