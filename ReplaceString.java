public class ReplaceString {
    public static void main(String[] args) {
        String string1 = "Hallo Sehun Ganteng";
        String GantiKarakter = string1.replace('o', 'a');
        String GantiKalimat = string1.replace("Ganteng", "Sayang");
        System.out.println("Untuk Replace Karakter :" + GantiKarakter);
        System.out.println("Untuk Replace Kalimat :" + GantiKalimat);
    }
}
