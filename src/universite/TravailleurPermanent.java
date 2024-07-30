package universite;

import java.util.Date;

public abstract class TravailleurPermanent extends Travailleur{
    protected int nombreAnneeExperiences;
    protected float salaireMensuel;

    public TravailleurPermanent(String name, Date dateDeNaissance, boolean isAssuree,int nombreAnneeExperiences,float salaireMensuel) {
        super(name, dateDeNaissance, isAssuree);
        this.nombreAnneeExperiences=nombreAnneeExperiences;
        this.salaireMensuel=salaireMensuel;
    }



    abstract float calculPrime();

    @Override
    float calculSalaire() {
        float salaire = salaireMensuel * 12;
        return salaire;
    }

}
