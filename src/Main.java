public class Main {
    public static void main(String[] args) {
        isFeminineNoun("Katze");
        isFeminineNoun("Hund");

    }

    public static void isFeminineNoun(String alphabet) {
        if (alphabet.endsWith("e")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
