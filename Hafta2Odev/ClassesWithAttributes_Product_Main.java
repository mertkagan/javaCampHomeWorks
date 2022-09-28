package Hafta2Odev;

public class ClassesWithAttributes_Product_Main {

	public static void main(String[] args) {
		ClassesWithAttributes_Product classesWithAttributes_Product = new ClassesWithAttributes_Product();
		classesWithAttributes_Product.setName("Laptop"); 
		classesWithAttributes_Product.setId(1); 
		classesWithAttributes_Product.setDescription("Monster Notebook"); 
		classesWithAttributes_Product.setPrice(15000); 
		classesWithAttributes_Product.setStockAmount(25); 
		System.out.println("Name: "+classesWithAttributes_Product.name);
		System.out.println("Description: "+classesWithAttributes_Product.description);
		System.out.println("Id: "+classesWithAttributes_Product.id);
		System.out.println("Price: "+classesWithAttributes_Product.price);
		System.out.println("Stock Amount: "+classesWithAttributes_Product.stockAmount);
		
		ClassesWithAttributes_ProductManager classesWithAttributes_ProductManager = new ClassesWithAttributes_ProductManager();
		classesWithAttributes_ProductManager.Add(classesWithAttributes_Product);

	}

}
