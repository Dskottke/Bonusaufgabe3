import java.util.Arrays;
import java.util.TreeMap;


public class Main {

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 10}
    //Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static void main(String[] args) {

        //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
        printWordBackwords("hallo");

        //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 10}
        int[] arrayInt = {6, 2, 8, 3, 9, 10};
        System.out.println("array before sort :");
        printArray(arrayInt);
        Arrays.sort(arrayInt);
        System.out.println("array after sort: ");
        printArray(arrayInt);

        //Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
        String word = ("peter,lust,hans");
        String[] arrayString = wordToStringArray(word);
        printArray(arrayString);

        //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
        System.out.println(getChecksum(125));

        //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
        intToRoman(52);
    }

    public static void printWordBackwords(String word) {
        for (int indexLast = word.length() - 1, indexFirst = 1; indexLast >= 0; indexLast--) {
            System.out.println(word.charAt(indexLast));

        }
    }

    public static void printArray(int[] arrayInt) {
        for (int elem : arrayInt) {
            System.out.print(elem == arrayInt[0] ? elem : ", " + elem);
        }
        System.out.println();
    }

    public static void printArray(String[] arrayString) {
        for (String string : arrayString) {
            System.out.print(string == arrayString[0] ? string : ", " + string);
        }
        System.out.println();
    }

    public static String[] wordToStringArray(String word) {

        String[] wordsInArray = word.split(",");

        return wordsInArray;
    }

    public static int getChecksum(int value) {

        int checksum = 0;
        for (; value > 0; value /= 10) {
            checksum += (value % 10);
        }
        return checksum;
    }

    public static void intToRoman(int value) {
        if (value > 100 || value < 0) {
            System.out.println("Die Zahl ist größer als 100 oder kleiner als 0");
            return;
        }

        int s = map.floorKey(value);
        if (value == s) {
            System.out.println(map.get(value));
            return;
        }
        System.out.print(map.get(s));
        intToRoman(value - s);

    }
}




