package universite;

import java.util.Date;

public abstract class Travailleur extends Personne /*implements Comparable*/{

    public Travailleur(String name, Date dateDeNaissance, boolean isAssuree) {
        super(name, dateDeNaissance, isAssuree);
    }

    public int compareTo(Travailleur travailleur2)
    {
        return Float.compare(this.calculSalaire(),travailleur2.calculSalaire());
    }

    abstract float calculSalaire();
}
