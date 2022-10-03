import java.util.Arrays;

public class Main {

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 10}
    //Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)

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
    }
    public static String [] wordToStringArray(String word){

    String[] wordsInArray = word.split(",");

return wordsInArray;
       }
    }


