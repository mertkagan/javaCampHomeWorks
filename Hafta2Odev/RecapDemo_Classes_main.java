package Hafta2Odev;

public class RecapDemo_Classes_main {

	public static void main(String[] args) {
		RecapDemo_Classes recapDemo_Classes = new RecapDemo_Classes();
		int toplamSonuc = recapDemo_Classes.Topla(50, 70);
		System.out.println("Islemin sonucu = " + toplamSonuc);
		
		int cikanSonuc = recapDemo_Classes.Cikar(95, 56);
		System.out.println("Islemin sonucu = " + cikanSonuc);
		
		int carpimSonuc = recapDemo_Classes.Carp(40, 60);
		System.out.println("Islemin sonucu = " + carpimSonuc);
		
		int bolumSonuc = recapDemo_Classes.Bol(60, 20);
		System.out.println("Islemin sonucu = " + bolumSonuc);

	}

}
