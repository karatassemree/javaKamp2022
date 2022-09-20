public class stringsDemo {
    public static void main(String[] args) {

        // string ler karakter dizisidir
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        // System.out.println(mesaj);
        
        //ilk harf B mi true false
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.startsWith("A"));

        //son harf . mı true false
        System.out.println(mesaj.endsWith("."));
        System.out.println(mesaj.endsWith("l"));

        //
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        // a karakteri mesaj icinde hangi index de oldugunu verir
        System.out.println(mesaj.indexOf("a"));

        //e karakteri mesaj icinde sondan hangi index de oldugunu verir
        System.out.println(mesaj.lastIndexOf("a"));
    }
}
