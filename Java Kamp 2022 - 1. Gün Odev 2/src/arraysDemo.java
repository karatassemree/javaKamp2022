public class ArraysDemo {
    public static void main(String[] args) {

        String ogrenci1 = "Emre";
        String ogrenci2 = "Fevzi";
        String ogrenci3 = "Zeki";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-----------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Emre";
        ogrenciler[1] = "Zeki";
        ogrenciler[2] = "Fevzi";
        ogrenciler[3] = "Salih";
        // ogrenciler[4] = "Osman";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println("Öğrenci adı : " + ogrenciler[i]);
        }

        System.out.println("-----------------------------------");

        // diğer yöntem
        for (String ogrenci : ogrenciler) {
            System.out.println("Öğrenci Adı : " + ogrenci);
        }
    }
}
