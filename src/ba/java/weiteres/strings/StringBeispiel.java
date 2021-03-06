package ba.java.weiteres.strings;

public class StringBeispiel {

  public StringBeispiel() {
    // Konstruktoren:

    // Ein leerer String
    String leerer = new String();
    // Duplizierung
    String duplikat = new String("Hallo");
    // Mittels char-Arrays
    char[] array = {'H', 'a', 'l', 'l', 'o'};
    String charArray = new String(array);

    // Zeichenextraktion:

    // char charAt(int index)
    // Liefert das Zeichen am angegebenen nullbasierten Index.
    char charAt = duplikat.charAt(0);
    // String substring(int begin, int end)
    // Liefert den Teilstring von inklusiv Index begin bis exklusiv Index end.
    String subString1 = duplikat.substring(1, 3);
    // Eine Variante der Methode ohne end liefert stets den Teilstring bis zum Ende.
    String subString2 = duplikat.substring(3);
    // String trim()
    // Entfernt Leerzeichen am Anfang und Ende 
    String trim = "    Hallo    ".trim();

    // Übung:
    System.out.println(leerer);
    System.out.println(duplikat);
    System.out.println(charArray);
    System.out.println(charAt);
    System.out.println(subString1);
    System.out.println(subString2);
    System.out.println(trim);
  }

  public static void main(String[] args) {
    new StringBeispiel();
  }
}
