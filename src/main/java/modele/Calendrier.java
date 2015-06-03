package modele;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by Pierre on 27/05/2015.
 */
@Entity
public class Calendrier {
    private Date datejour;
    private Collection<Obtient> obtientsByDatejour;

    @Id
    @Column(name = "DATEJOUR")
    public Date getDatejour() {
        return datejour;
    }

    public void setDatejour(Date datejour) {
        this.datejour = datejour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Calendrier that = (Calendrier) o;

        if (datejour != null ? !datejour.equals(that.datejour) : that.datejour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return datejour != null ? datejour.hashCode() : 0;
    }

    @OneToMany(mappedBy = "calendrierByDatejour", cascade= CascadeType.ALL)
    public Collection<Obtient> getObtientsByDatejour() {
        return obtientsByDatejour;
    }

    public void setObtientsByDatejour(Collection<Obtient> obtientsByDatejour) {
        this.obtientsByDatejour = obtientsByDatejour;
    }
}
