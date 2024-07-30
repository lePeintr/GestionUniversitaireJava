package universite;

import java.util.Comparator;

public class SalaireComparator implements Comparator<Travailleur> {

    @Override
    public int compare(Travailleur o1, Travailleur o2) {
        return Float.compare(o1.calculSalaire(),o2.calculSalaire());
    }
}
