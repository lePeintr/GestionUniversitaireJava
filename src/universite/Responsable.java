package universite;

import java.util.Date;

public class Responsable extends TravailleurPermanent{
    private Responsabilite responsabilite;
    public Responsable(String name, Date dateDeNaissance, boolean isAssuree,Responsabilite responsabilite,int nombreAnneeExperiences,float salaireMensuel) {
        super(name, dateDeNaissance, isAssuree,nombreAnneeExperiences,salaireMensuel);
        this.responsabilite=responsabilite;
    }

    public Responsabilite getResponsabilite() {
        return responsabilite;
    }

    public void setResponsabilite(Responsabilite responsabilite) {
        this.responsabilite = responsabilite;
    }

    @Override
    float calculPrime() {
        float prime = (float)(nombreAnneeExperiences + (0.8* salaireMensuel));
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + "Responsable{" +
                "responsabilite=" + responsabilite +
                '}';
    }
}
