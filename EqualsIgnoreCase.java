public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String string1 = "Sehun";
        String string2 = "sehun";
        String string3 = "Sehun";
        System.out.println("Hasilnya : " + string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya : " + string1.equalsIgnoreCase(string3));
    }
}