package fr.morin.ps4;

public class JeuPS4 {
    private String Titre = "pacman";
    private int pegi = 3;

    public JeuPS4(String titre, int pegi) {
        setTitre(titre);
        setPegi(pegi);
    }


    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    @Override
    public String toString() {
        return "Ce jeu est : "+getTitre()+". Sa classification est : Pegi "+getPegi();
    }
}
