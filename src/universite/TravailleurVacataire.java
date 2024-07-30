package universite;

import java.util.Date;

public abstract class TravailleurVacataire extends Travailleur{
    private int [] nombreHeureParMois;
    private float prixParHeure;


    public TravailleurVacataire(String name, Date dateDeNaissance, boolean isAssuree,int [] nombreHeureParMois) {
        super(name, dateDeNaissance, isAssuree);
        this.nombreHeureParMois=nombreHeureParMois;
    }

    public int[] getNombreHeureParMois() {
        return nombreHeureParMois;
    }

    public float getPrixParHeure() {
        return prixParHeure;
    }

    @Override
    float calculSalaire() {
        int cumulDesHeuresAnnees=0;
        for(int i=0;i<nombreHeureParMois.length;i++){
            cumulDesHeuresAnnees += nombreHeureParMois[i];
        }
        float salaire = cumulDesHeuresAnnees * prixParHeure;
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nombreHeureParMois=" + nombreHeureParMois +
                ", prixParHeure=" + prixParHeure +
                '}';
    }
}
