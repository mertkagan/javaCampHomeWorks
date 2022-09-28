package Hafta2Odev;

import java.security.PublicKey;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
		int [] sayilar = {1,3,5,7,9};
		int aranacak = 1;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "iyi gunler ";
		
		
		if (varMi == true) {
			mesajVer("Sayi mevcuttur: " + aranacak);
			mesajVer(mesaj);
		}
		else {
			mesajVer("Sayi mevcut degildir: " + aranacak);
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
