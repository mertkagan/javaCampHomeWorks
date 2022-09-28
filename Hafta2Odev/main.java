package Hafta2Odev;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int [] sayilar1 = new int [] {10,20,30};
		int [] sayilar2 = new int [] {40,50,60};
		sayilar2 = sayilar1 ;
		sayilar1[0]=70;
		System.out.println(sayilar2[0]);

	}

}
