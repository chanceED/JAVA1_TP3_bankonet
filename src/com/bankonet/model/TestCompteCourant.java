package com.bankonet.model;

public class TestCompteCourant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CompteCourant compteCourant1=new CompteCourant("livret A", 600, 20);
		CompteCourant compteCourant2=new CompteCourant("LIVRET JEUNE", 900, 90);
		CompteCourant compteCourant3=new CompteCourant("eparne", 600, 50);
		CompteCourant compteCourant4=new CompteCourant("totA", 700, 20);
		CompteCourant compteCourant5=new CompteCourant("compte fantome", 7500, 250);
		CompteCourant compteCourant6=new CompteCourant();
		CompteCourant compteCourant7=new CompteCourant();
		
		System.out.println("Nombre total de comptes crées= "+CompteCourant.getNbComptesCourants());
		compteCourant1.creditAutorise(400);
		compteCourant1.debitAutorise(1000);
		
		//compteCourant1.toString();
		
		
	System.out.println(compteCourant1.toString());
		/*System.out.println(compteCourant2.toString());
		System.out.println(compteCourant3.toString());
		System.out.println(compteCourant4.toString());
		System.out.println(compteCourant5.toString());
		System.out.println();*/
		
		
	
		
	}

}


 