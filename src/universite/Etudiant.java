package universite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Etudiant extends Personne{
    private List<Matiere> listeMatieresInscrite  ;

    public Etudiant(String name, Date dateDeNaissance, boolean isAssuree) {
        super(name, dateDeNaissance, isAssuree);
        listeMatieresInscrite = new ArrayList<>();
    }

    public List<Matiere> getListeMatieresInscrite() {
        return listeMatieresInscrite;
    }

    public void inscrireMatiere(Matiere matiere) {
        this.listeMatieresInscrite.add(matiere);
    }

    public float calculCoutTotalInscription(){
        int coutTotal=0;
        for(int i=0; i<listeMatieresInscrite.size();i++){
            coutTotal += listeMatieresInscrite.get(i).getFraisInscription();
        }
        //for(Matiere matiere:listeMatieresInscrite)
        //    coutTotal+=matiere.getFraisInscription();
        return coutTotal;
    }

    @Override
    public String toString() {
        return super.toString()+" Etudiant{" +
                "listeMatieresInscrite=" + listeMatieresInscrite +
                '}';
    }
}
