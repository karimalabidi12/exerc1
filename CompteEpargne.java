
public class CompteEpargne extends Compte {
    private double benefice;

    public CompteEpargne(String titulaire) {
        super(titulaire); 
        this.benefice = benefice; 
    }

    public void calculerBenefice(double tauxInteret) {
        benefice = getSolde() * tauxInteret;
    }

    public double getBenefice() {
        return benefice;
    }


    public String toString() {
        return super.toString() + " - Benefice : " + benefice;
    }
}