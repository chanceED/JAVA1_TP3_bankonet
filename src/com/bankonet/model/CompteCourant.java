package com.bankonet.model;



public class CompteCourant {
	
	private int identifiant;
	private String libelle;
	private float solde;
	private float decouvertAutorise;
	private static int nbComptesCourants=0;
		

	public CompteCourant() {
		
		nbComptesCourants++;
		
		
	}
	
	
	//surcharge du constructeur par d�faut

	public CompteCourant( String libelle, float solde,
			float decouvertAutorise) {
		
		//super(); appel le constructeur par d�faut de la classe mere
		
		this();//appel du constructeur par d�faut de la classe courante(de cette classe) donc public CompteCourant()
		this.identifiant = nbComptesCourants;
		this.libelle = libelle;
		this.solde = solde;
		this.decouvertAutorise = decouvertAutorise;
		//System.out.println(" id = "+identifiant+" solde  "+solde+ "\n\n");	
		//System.out.println(nbComptesCourants);	
	}

	public boolean creditAutorise(float montant){
	//	solde=solde+montant;
	//	System.out.println(" nouveau solde = "+solde);
		return true;
	}

	public boolean debitAutorise(float montant){
		if(this.getSolde()+this.getDecouvertAutorise()>=montant)
		{
			//System.out.println("Débit non autorisé");
			return true;
		}else
			//System.out.println("Débit autorisé");
		return false;
	}
	
	
	public String toString1(){
		return ("identifiant="+identifiant+ " solde =" +solde);
	}
	
	public String toString(){
		return "ID :"+this.getIdentifiant() +" - \n"+
				"Libelle :"+this.getLibelle() +" - \n"+
				"solde :"+this.getSolde() +" - \n"+
				"D�couvert autoris�' :"+this.getDecouvertAutorise() ;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}



	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public Float getSolde() {
		return solde;
	}


	

	public Float getDecouvertAutorise() {
		return decouvertAutorise;
	}



	public static int getNbComptesCourants() {
		return nbComptesCourants;
	}


	
	
	
	
	

}
