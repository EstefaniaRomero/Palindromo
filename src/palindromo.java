import java.util.Scanner;

public class palindromo {

   /* Demanar a l’usuari una paraula i que el programa ens retorni si és o no
    palíndromo (si es llegeix igual d’esquerra a dreta que de dreta a esquerra).*/

    public static void main(String[] args) {

        String word = askWord();
        palindromeResult(word);
    }

    private static String palindromeResult(String word) {

        String result = "";

        for (int i = word.length()-1; i >= 0 ; i--) {

            result += word.charAt(i);
        }
        if(!result.equals(word)){

            System.out.println(word + " no es Palíndroma");

        } else System.out.println("La paraula " + word + " és Palíndroma");

        return result;
    }

    private static String askWord() {
        Scanner sc = new Scanner(System.in);
        String wordUser = "";
        System.out.println("Introdueix una paraula: " );
        return  wordUser = sc.nextLine();
    }
}
