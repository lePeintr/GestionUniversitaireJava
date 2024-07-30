package universite;

public class Matiere {
    private int code;
    private String libelle;
    private int anneeEnseignee;
    private float fraisInscription;

    public Matiere(int code, String libelle, int anneeEnseignee, float fraisInscription) {
        this.code = code;
        this.libelle = libelle;
        this.anneeEnseignee = anneeEnseignee;
        this.fraisInscription = fraisInscription;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getAnneeEnseignee() {
        return anneeEnseignee;
    }

    public void setAnneeEnseignee(int anneeEnseignee) {
        this.anneeEnseignee = anneeEnseignee;
    }

    public float getFraisInscription() {
        return fraisInscription;
    }

    public void setFraisInscription(float fraisInscription) {
        this.fraisInscription = fraisInscription;
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "code=" + code +
                ", libelle='" + libelle + '\'' +
                ", anneeEnseignee=" + anneeEnseignee +
                ", fraisInscription=" + fraisInscription +
                '}';
    }
}
