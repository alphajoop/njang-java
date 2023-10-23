public class AccessControlExample {

  private int privateVariable;
  public int publicVariable;
  protected int protectedVariable;
  int defaultVariable;

  // Méthode privée accessible uniquement à l'intérieur de la classe.
  private void privateMethod() {
    System.out.println("This is a private method.");
  }

  // Méthode publique accessible depuis n'importe où.
  public void publicMethod() {
    System.out.println("This is a public method.");
  }

  // Méthode protégée accessible dans la classe et les sous-classes.
  protected void protectedMethod() {
    System.out.println("This is a protected method.");
  }

  // Méthode par défaut (package-private) accessible dans le même package.
  void defaultMethod() {
    System.out.println("This is a default method.");
  }
}
