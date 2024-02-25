import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nom;
    private List<Compte> listCompte;

    public Banque() {
        this.nom ="nom";
        this.listCompte = new ArrayList<>();
    }

    public void ajoutCompte(Compte compte) {
        listCompte.add(compte);
        System.out.println("Compte ajouter a la banque.");
         
    }
   
    public String toString(){
        return "Nom du banque : "+nom+", listeCompte "+listeCompte+"|";
    }
 
}
