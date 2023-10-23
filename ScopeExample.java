public class ScopeExample {

  public static void main(String[] args) {
    int globalVariable = 5; // Variable globale

    if (globalVariable > 3) {
      int localVariable = 10; // Variable locale dans le bloc if
      System.out.println("Local variable inside if: " + localVariable);
    }

    // Vous ne pouvez pas accéder à localVariable ici, car elle est hors de portée.
    System.out.println("Global variable: " + globalVariable);
  }
}
