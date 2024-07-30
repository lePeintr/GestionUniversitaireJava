package universite;

import java.util.Comparator;

public class NameComparator implements Comparator<Travailleur> {
   @Override
    public int compare(Travailleur o1, Travailleur o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
