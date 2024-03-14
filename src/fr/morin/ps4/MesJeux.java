package fr.morin.ps4;
import java.util.HashSet;
import java.util.Iterator;

public class MesJeux {
    private HashSet<JeuPS4> jeux;

    public MesJeux() {
        jeux = new HashSet<>();
    }
    public void ajouterJeu(JeuPS4 jeu) {
        for (JeuPS4 i : jeux) {
            if (i.getTitre().equals(jeu.getTitre())) {
                System.out.println("Le jeu \"" + jeu.getTitre() + "\" est déjà présent dans la collection.");
                return;
            }
        }
        jeux.add(jeu);
        System.out.println("Le jeu \"" + jeu.getTitre() + "\" a été ajouté à la collection.");
    }
    public void ajouterJeu(String titre, int pegi) {
        for (JeuPS4 i : jeux) {
            if (i.getTitre().equals(titre)) {
                System.out.println("Le jeu \"" + titre + "\" est déjà présent dans la collection.");
                return;
            }
        }
        jeux.add(new JeuPS4(titre,pegi));
        System.out.println("Le jeu \""+ titre + "\" a été ajouté à la collection");
    }
    public void retirerJeu(String titre) {
        Iterator<JeuPS4> iterator = jeux.iterator();
        while (iterator.hasNext()) {
            JeuPS4 jeu = iterator.next();
            if (jeu.getTitre().equals(titre)) {
                iterator.remove();
                System.out.println("Le jeu \"" + titre + "\" a été retiré de la collection.");
                return;
            }
        }
        System.out.println("Le jeu \""+ titre + "\" n'est pas dans la collection.");
    }

    public void retirerJeu(JeuPS4 jeu) {
        jeux.remove(jeu);
    }
    public int size(){
        return jeux.size();
    }
}
