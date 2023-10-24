public class Loop {

  public static void main(String[] args) {
    // Cette boucle 'for' affiche un message de salutation pour chaque nombre de 1 à 10.
    for (int i = 1; i <= 10; i++) {
      bonjour("Jean " + Integer.toString(i));
    }

    // Appelle la méthode 'collection' avec un tableau d'arguments.
    collection(args);
  }

  // Cette méthode affiche un message de salutation en utilisant le nom passé en argument.
  static void bonjour(String nom) {
    System.out.println("Bonjour " + nom + " !");
  }

  // Cette méthode prend un tableau d'entiers et effectue deux boucles 'for' pour les parcourir.
  static void collection(String[] args) {
    int[] array = new int[] { 7, 2, 4 };

    // Boucle 'for' standard pour parcourir un tableau en utilisant un index.
    for (int i = 0; i < array.length; i++) {
      System.out.println("for " + array[i]);
    }

    // Boucle 'for each' pour parcourir le tableau sans utiliser d'index.
    for (int number : array) {
      System.out.println("for each " + number);
    }
  }
}
