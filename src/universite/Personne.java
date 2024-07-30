package universite;

import java.util.Date;

public abstract class Personne {
    private String name;
    private Date dateDeNaissance;
    private boolean isAssuree;


    public Personne(String name, Date dateDeNaissance, boolean isAssuree) {
        this.name = name;
        this.dateDeNaissance = dateDeNaissance;
        this.isAssuree = isAssuree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public boolean isAssuree() {
        return isAssuree;
    }

    public void setAssuree(boolean assuree) {
        isAssuree = assuree;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "name='" + name + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", isAssuree=" + isAssuree +
                '}';
    }
}
