package universite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnseignantCadre extends TravailleurPermanent{
    private List<Matiere> listeDesMatieresEnseignees;
    public EnseignantCadre(String name, Date dateDeNaissance, boolean isAssuree,int nombreAnneeExperiences,float salaireMensuel) {
        super(name, dateDeNaissance, isAssuree,nombreAnneeExperiences,salaireMensuel);
        listeDesMatieresEnseignees = new ArrayList<>();
    }

    @Override
    float calculPrime() {
        float prime = (float)(nombreAnneeExperiences + (0.5* salaireMensuel));
        return prime;
    }

    public void ajoutMatiere(Matiere matiere){
        listeDesMatieresEnseignees.add(matiere);
    }

    @Override
    float calculSalaire() {
        return 0;
    }
}
