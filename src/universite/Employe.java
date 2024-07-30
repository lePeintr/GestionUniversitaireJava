package universite;

import java.util.Date;

public class Employe extends TravailleurPermanent{
    private TypeFonction typeFonction;
    public Employe(String name, Date dateDeNaissance, boolean isAssuree,TypeFonction typeFonction,int nombreAnneeExperiences,float salaireMensuel) {
        super(name, dateDeNaissance, isAssuree,nombreAnneeExperiences,salaireMensuel);
        this.typeFonction=typeFonction;
    }

    public TypeFonction getTypeFonction() {
        return typeFonction;
    }

    public void setTypeFonction(TypeFonction typeFonction) {
        this.typeFonction = typeFonction;
    }

    @Override
    float calculPrime() {
        float prime = (float)(nombreAnneeExperiences + (0.2* salaireMensuel));
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + "Employe{" +
                "typeFonction=" + typeFonction +
                '}';
    }
}
