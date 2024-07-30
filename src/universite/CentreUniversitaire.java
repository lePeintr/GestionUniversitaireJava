package universite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CentreUniversitaire {
    private String nomDuCentre;
    private List<Travailleur> listeDesTravailleurs;
    private List<Etudiant> listeDesEtudiants;
    private List<Matiere> listeDesMatieres;

    public CentreUniversitaire(String nomDuCentre) {
        this.nomDuCentre = nomDuCentre;
        listeDesEtudiants = new ArrayList<>();
        listeDesMatieres = new ArrayList<>();
        listeDesTravailleurs = new ArrayList<>();
    }

    public String getNomDuCentre() {
        return nomDuCentre;
    }

    public void setNomDuCentre(String nomDuCentre) {
        this.nomDuCentre = nomDuCentre;
    }

    public void ajoutMatiere(Matiere matiere){
        listeDesMatieres.add(matiere);
    }

    public void ajoutEtudiant(Etudiant etudiant){
        listeDesEtudiants.add(etudiant);
    }

    public void ajoutTravailleur(Travailleur travailleur){
        listeDesTravailleurs.add(travailleur);
    }

    public void listeDesEtudiants(){
        for(Etudiant etudiant:listeDesEtudiants)
            System.out.println(etudiant);
    }

    public void listeDesTravailleurs(){
        for(Travailleur travailleur:listeDesTravailleurs)
            System.out.println(travailleur);
    }

    public float bilanAnnuel(){
        //total des frais d'inscription des etudiants - les total salaire
        float fraisTotalInscription = 0;
        float fraisTotalSalaire = 0;
        for(Etudiant etudiant: listeDesEtudiants){
            fraisTotalInscription += etudiant.calculCoutTotalInscription();
        }
        for(Travailleur travailleur: listeDesTravailleurs){
            fraisTotalSalaire += travailleur.calculSalaire();
        }

        float bilan = fraisTotalInscription - fraisTotalSalaire;

        return bilan;
    }
    //Faire les suppressions

    public void trierTravailleurParCritere(Comparator<Travailleur> critere){
        Collections.sort(listeDesTravailleurs, critere);
    }

    @Override
    public String toString() {
        return super.toString() + "CentreUniversitaire{" +
                "nomDuCentre='" + nomDuCentre + '\'' +
                ", listeDesTravailleurs=" + listeDesTravailleurs +
                ", listeDesEtudiants=" + listeDesEtudiants +
                ", listeDesMatieres=" + listeDesMatieres +
                '}';
    }
}
