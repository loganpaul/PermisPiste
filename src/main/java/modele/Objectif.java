package modele;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Pierre on 27/05/2015.
 */
@Entity
public class Objectif {
    private int numobjectif;
    private String libobectif;
    private Collection<EstAssocie> estAssociesByNumobjectif;
    private Collection<Fixe> fixesByNumobjectif;

    @Id
    @Column(name = "NUMOBJECTIF")
    public int getNumobjectif() {
        return numobjectif;
    }

    public void setNumobjectif(int numobjectif) {
        this.numobjectif = numobjectif;
    }

    @Basic
    @Column(name = "LIBOBECTIF")
    public String getLibobectif() {
        return libobectif;
    }

    public void setLibobectif(String libobectif) {
        this.libobectif = libobectif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Objectif objectif = (Objectif) o;

        if (numobjectif != objectif.numobjectif) return false;
        if (libobectif != null ? !libobectif.equals(objectif.libobectif) : objectif.libobectif != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numobjectif;
        result = 31 * result + (libobectif != null ? libobectif.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "objectifByNumobjectif")
    public Collection<EstAssocie> getEstAssociesByNumobjectif() {
        return estAssociesByNumobjectif;
    }

    public void setEstAssociesByNumobjectif(Collection<EstAssocie> estAssociesByNumobjectif) {
        this.estAssociesByNumobjectif = estAssociesByNumobjectif;
    }

    @OneToMany(mappedBy = "objectifByNumobjectif")
    public Collection<Fixe> getFixesByNumobjectif() {
        return fixesByNumobjectif;
    }

    public void setFixesByNumobjectif(Collection<Fixe> fixesByNumobjectif) {
        this.fixesByNumobjectif = fixesByNumobjectif;
    }
}
