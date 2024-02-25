public class compte  {
    private String titulaire;
    private double solde;

    public Compte(String titulaire) {
        this.titulaire = titulaire;
       
    }

    public Compte(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void debiter(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println("Debit de " + montant + " effectuee. Nouveau solde : " + solde);
        } else {
            System.out.println("Debit impossible. Solde insuffisant.");
        }
    }

    public void crediter(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Credit de " + montant + " effectuee. Nouveau solde : " + solde);
        } else {
            System.out.println("Credit impossible. Montant invalide.");
        }
    }
     public String toString() {
        return "Compte de " + titulaire + " - Solde : " + solde;
    }
}