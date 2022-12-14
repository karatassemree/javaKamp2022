public class StringsDemo {
    public static void main(String[] args) {

        // string ler karakter dizisidir
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*
         * System.out.println("Eleman sayısı : " + mesaj.length());
         * System.out.println("5. Eleman : " + mesaj.charAt(4));
         * System.out.println(mesaj.concat(" Yaşasın!"));
         * // System.out.println(mesaj);
         * 
         * //ilk harf B mi true false
         * System.out.println(mesaj.startsWith("B"));
         * System.out.println(mesaj.startsWith("A"));
         * 
         * //son harf . mı true false
         * System.out.println(mesaj.endsWith("."));
         * System.out.println(mesaj.endsWith("l"));
         * 
         * //
         * char[] karakterler = new char[5];
         * mesaj.getChars(0, 5, karakterler, 0);
         * System.out.println(karakterler);
         * 
         * // a karakteri mesaj icinde hangi index de oldugunu verir
         * System.out.println(mesaj.indexOf("a"));
         * 
         * //e karakteri mesaj icinde sondan hangi index de oldugunu verir
         * System.out.println(mesaj.lastIndexOf("a"));
         */

        // metin içindeki kelime değiştirme için.
        System.out.println(mesaj.replace("güzel", "kötü"));

        // gelen veriyi alma string e
        String yeniMesaj = mesaj.replace("güzel", "kötü");
        System.out.println("Yeni Mesaj = " + yeniMesaj);

        // metin içindeki karakteri değiştirme
        System.out.println(mesaj.replace('ü', 'u'));

        // metin belirtilen indexden sonrasını alır / parcalar
        System.out.println(mesaj.substring(5));

        // belirtilen indexler arası durur gerisi keser. örn: 5 de başla 9a kadar
        System.out.println(mesaj.substring(5, 9));
        System.out.println("-----------------------------");
        
        //metin içinde kelime kelime dönme
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        //tüm harfleri küçültme
        System.out.println(mesaj.toLowerCase());
        //büyük harf
        System.out.println(mesaj.toUpperCase());

        //baş ve sondaki boşlukları siler
        System.out.println(mesaj.trim());
    }
}
