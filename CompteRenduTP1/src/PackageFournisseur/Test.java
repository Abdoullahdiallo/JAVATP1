package PackageFournisseur;

public class Test {
	public static void main(String[] args) {
		
		Fournisseur<Produit> f = new Fournisseur<Produit>("Fournisseur2", 2);
		Produit p = new Produit("dove", "ref2222", 2);
		Produit p2 = new Produit("PC" , "re123" ,1500);
				f.ajouterProduit(p);
        f.ajouterProduit(p2);
        f.afficherProduits();
	}
	
}
