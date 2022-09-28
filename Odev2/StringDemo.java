public class Main {

System.out.println("eleman sayısı = " + mesaj.length());
        //Metinin 5. elemanı 0dan başladığı için değer +1 olrak düşünün
        System.out.println("5.eleman = " + mesaj.charAt(4));
        //Metnin sonna metin ekleme
        System.out.println(mesaj.concat(" Yaşaşın!"));
        //Metin  Baş harfi .. ile mi başlıyor true veya false
        System.out.println(mesaj.startsWith("B"));
        //Metin  son harfi .. ile mi başlıyor true veya false
        System.out.println(mesaj.endsWith("."));
        //Metninde belilrli aralıktaki yeri bulma
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        //Baştan kaçıncı harfi a dır. o dan sayar 01234
        System.out.println(mesaj.indexOf('a'));
        //Baştan kaçıncı hecesi av dır. o dan sayar 01234
        System.out.println(mesaj.indexOf("av"));
        //Fazladan yazılan harfler arasında sondaki baştan kaçınçı harftir
        System.out.println(mesaj.lastIndexOf("e"));
        //  ' ' karakterini '-'karakteri ile değiştir
        System.out.println(mesaj.replace(' ', '-'));
        // 2. indexinden itibaren AL
        System.out.println(mesaj.substring(2));
        // 2. indexinden başla 4. karaktere kadar al. 4.index almıyor
        System.out.println(mesaj.substring(2, 4));
        // Cümleyi kelimelere ayırma ÇOK ÖNEMLİ!!!!!!!!!!!!!!!!!!!!!!!!
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        //Küçük ve büyük harfe dönüştürme
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase());
        //Baş ve sonda olan boşluğu siler.
        System.out.println(mesaj.trim());

}
