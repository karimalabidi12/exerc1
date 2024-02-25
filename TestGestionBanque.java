public class TestGestionBanque {
    public static void main(String[] args) {
        //banque
        Banque banque = new Banque("Ma Banque");

        //comptes
        Compte compte = new Compte("Tit1", 1000.0);
        CompteEpargne cmptEp = new CompteEpargne("Titulaire 2");

        // Ajout des comptes au banque
       banque.ajoutCompte(compte);
       banque.ajoutCompte(cmptEp);
   try {
            compte.debiter(2000.0);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Exception: " + e.getMsg());
        }
        // Credit
        cmptEp.crediter(500.0);
        // Debit  
        cmptEp.debiter(200.0);

        // Affichage des comptes
        System.out.println(compte);
        System.out.println(cmptEp);
    }
}
