package fr.morin.note;

import java.util.HashMap;

public class Etudiants {
    private String nom = "pepito";
    private HashMap<matiere,ListeDeNotes> notes;

    public Etudiants(String nom){
        setNom(nom);
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<matiere, ListeDeNotes> getNotes() {
        return notes;
    }

    public void setNotes(HashMap<matiere, ListeDeNotes> notes) {
        this.notes = notes;
    }

    public float getMoyenne(matiere mat){
        float moyenne = 0;
        for(int i = 1; i<notes.get(mat).getListeNotes().size(); i++){
            moyenne = moyenne + notes.get(mat).getListeNotes().get(i);
        }
        moyenne = moyenne/notes.get(mat).getListeNotes().size();
        return moyenne;
    }
    public void addMatiere (matiere mat, ListeDeNotes Ln){
        notes.put(mat,Ln);
    }
}
