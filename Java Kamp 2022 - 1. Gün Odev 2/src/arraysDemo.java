public class arraysDemo {
    public static void main(String[] args) {

        // String ogrenci1 = "Emre";
        // String ogrenci2 = "Fevzi";
        // String ogrenci3 = "Zeki";

        // System.out.println(ogrenci1);
        // System.out.println(ogrenci2);
        // System.out.println(ogrenci3);

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Emre";
        ogrenciler[1] = "Zeki";
        ogrenciler[2] = "Fevzi";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println("Öğrenci adı : " + ogrenciler[i]);
        }
    }
}
