package Hafta2Odev;

import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Hello canim";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(48, 60);
		System.out.println(sayi);
		
		ekle();
		sil();
		guncelle();
		
		double carpim = carpma(48, 60) ;
		System.out.println(carpim);
		
		int toplam = topla2(2,4,6,10,85,40);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi...");
	}

	public static void sil() {
		System.out.println("Silindi...");
	}

	public static void guncelle() {
		System.out.println("Guncellendi...");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Istanbul" ;
	}

	public static double carpma(double sayi1 , double sayi2) {
		
		return sayi1 * sayi2;
		
		
		
	}
	
	public static int topla2 (int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam +=sayi;
		}
		return toplam;
	}
}

