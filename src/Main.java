import universite.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Matiere matiere1= new Matiere(1,"infos",1,5000);
        Matiere matiere2= new Matiere(2,"math",2,4000);
        Matiere matiere3= new Matiere(3,"physique",3,3000);

        Etudiant etutiant1 = new Etudiant("etudiant3",new Date(),true);
        Etudiant etutiant2 = new Etudiant("etudiant2",new Date(),false);
        Etudiant etutiant3 = new Etudiant("etudiant3",new Date(),true);

        EnseignantVacataire enseignantVacataire1 =new EnseignantVacataire("vacataire1",new Date(),true,new int[]{10,5,3});
        EnseignantVacataire enseignantVacataire2 =new EnseignantVacataire("vacataire2",new Date(),false,new int[]{10,5,3});

        EnseignantCadre enseignantCadre1= new EnseignantCadre("cadre3",new Date(),true,5,1000);
        EnseignantCadre enseignantCadre2= new EnseignantCadre("cadre2",new Date(),true,1,1500);
        EnseignantCadre enseignantCadre3= new EnseignantCadre("cadre1",new Date(),true,4,3000);

        Employe employe1 = new Employe("employe2",new Date(),true,TypeFonction.COMPTABLE,2,5000);
        Employe employe2 = new Employe("employe1",new Date(),false,TypeFonction.GARDIEN,4,2000);
        Employe employe3 = new Employe("employe3",new Date(),true,TypeFonction.SECRETAIRE,7,1000);

        Responsable responsable1 = new Responsable("responsable1",new Date(),true,Responsabilite.PRESIDENT,8,100000);
        Responsable responsable2 = new Responsable("responsable2",new Date(),true,Responsabilite.CORDINATEUR,6,50000);

        CentreUniversitaire centreUniversitaire = new CentreUniversitaire("University");
        centreUniversitaire.ajoutMatiere(matiere1);
        centreUniversitaire.ajoutMatiere(matiere2);
        centreUniversitaire.ajoutMatiere(matiere3);

        centreUniversitaire.ajoutEtudiant(etutiant1);
        centreUniversitaire.ajoutEtudiant(etutiant2);
        centreUniversitaire.ajoutEtudiant(etutiant3);

        centreUniversitaire.ajoutTravailleur(enseignantVacataire1);
        centreUniversitaire.ajoutTravailleur(enseignantVacataire2);

        centreUniversitaire.ajoutTravailleur(enseignantCadre1);
        centreUniversitaire.ajoutTravailleur(enseignantCadre2);
        centreUniversitaire.ajoutTravailleur(enseignantCadre3);

        centreUniversitaire.ajoutTravailleur(employe1);
        centreUniversitaire.ajoutTravailleur(employe2);
        centreUniversitaire.ajoutTravailleur(employe3);

        centreUniversitaire.ajoutTravailleur(responsable1);
        centreUniversitaire.ajoutTravailleur(responsable2);


        centreUniversitaire.listeDesEtudiants();
        centreUniversitaire.listeDesTravailleurs();

        System.out.println("Bilant:"+centreUniversitaire.bilanAnnuel());

        NameComparator name = new NameComparator();
        SalaireComparator salaire = new SalaireComparator();

        centreUniversitaire.trierTravailleurParCritere(name);
        centreUniversitaire.listeDesTravailleurs();
        System.out.println("---------------------------");
        centreUniversitaire.trierTravailleurParCritere(salaire);
        centreUniversitaire.listeDesTravailleurs();

    }
}
