package PackageFournisseur;

public class Produit {
	
	private String nom;
    private String reference;
    private double prix;

    public  Produit(String nom , String reference , double prix) {
        this.nom = nom;
        this.reference = reference;
        this.prix = prix;

}
    
    
    public String toString() {
        return "Produit Nom: " + nom + ", Référence: " + reference + ", Prix: " + prix ;
    }
    public String getNom(String nom) {
    	return nom;
    }
    public String getRefernce(String reference ) {
    	return reference;
    }
    public double getPrix(double prix ) {
    	return prix;
    }
    
}
