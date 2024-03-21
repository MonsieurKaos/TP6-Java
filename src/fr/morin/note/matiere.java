package fr.morin.note;

public class matiere {
    private String nom;
    private int coefficient;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
    public matiere(String nom, int coeff) {
        setNom(nom);
        setCoefficient(coeff);
    }
}
