public class While {

  public static void main(String[] args) {
    int i = 0;
    // La boucle 'while' continue tant que la valeur de 'i' est inférieure à 90.
    while (i < 90) {
      // À chaque itération, la méthode 'randomNumber' génère un nombre aléatoire
      // et met à jour la valeur de 'i' avec ce nombre.
      i = randomNumber();
      // Appelle la méthode 'print' pour afficher la valeur actuelle de 'i'.
      print(i);
    }
  }

  // Cette méthode affiche la valeur passée en argument sous la forme "nombre: x".
  static void print(int number) {
    System.out.println("nombre: " + Integer.toString(number));
  }

  // Cette méthode génère un nombre aléatoire entre 1 et 100 (compris).
  static int randomNumber() {
    return (int) ((Math.random() * ((100 - 1) + 1)) + 1);
  }
}
