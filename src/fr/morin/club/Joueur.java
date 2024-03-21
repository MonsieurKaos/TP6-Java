package fr.morin.club;

public class Joueur {
    private String Nom = "Pepito";
    private String Prenom = "Le roi des gateau";
    private int Age = 72;
    private boolean Licence = false;
    private boolean Cotisation = false;
    private int Presence = 0;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public boolean isLicence() {
        return Licence;
    }

    public void setLicence(boolean licence) {
        Licence = licence;
    }

    public boolean isCotisation() {
        return Cotisation;
    }

    public void setCotisation(boolean cotisation) {
        Cotisation = cotisation;
    }

    public int getPresence() {
        return Presence;
    }

    public void setPresence(int presence) {
        Presence = presence;
    }
}
