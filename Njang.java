/**
 * Ceci est une implémentation du message traditionnel "Hello world!"
 *
 * @author Alpha JOOB
 */
public class Njang {

  /** Le programme commence ici */
  public static void main(String[] args) {
    sayHelloTo("word");
  }

  /**
   * Affiche le message "hello" au destinataire fourni.
   *
   * @param recipient Le destinataire auquel dire bonjour.
   */
  private static void sayHelloTo(String recipient) {
    System.out.println("Hello " + recipient);
  }
  /*
   * Le code suivant est actuellement en commentaire, donc il ne sera pas exécuté.
   */

  /*
  public static void main(String[] args) {
    String name = "Alpha Joop";
    name = name.toUpperCase();
    System.out.println(name);
  }
  */

}
