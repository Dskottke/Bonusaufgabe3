public class Main {

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    //Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    //Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)

    public static void main(String[] args) {

        printWordBackwords("hallo");

    }

    public static void printWordBackwords(String word) {
        String wordNew = "";
        for(int indexLast  = word.length()-1, indexFirst = 1;indexLast >= 0; indexLast--){
            System.out.println(word.charAt(indexLast));

        }
    }
}
