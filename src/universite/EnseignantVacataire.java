package universite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnseignantVacataire extends TravailleurVacataire{
    private List<Matiere> listeDesMatieresEnseignees;
    public EnseignantVacataire(String name, Date dateDeNaissance, boolean isAssuree,int [] nombreHeureParMois) {
        super(name, dateDeNaissance, isAssuree,nombreHeureParMois);
        listeDesMatieresEnseignees=new ArrayList<>();
    }

    public void ajoutMatiere(Matiere matiere){
        listeDesMatieresEnseignees.add(matiere);
    }


    @Override
    public String toString() {
        return super.toString()+ "EnseignantVacataire{" +
                "listeDesMatieresEnseignees=" + listeDesMatieresEnseignees +
                '}';
    }

}
