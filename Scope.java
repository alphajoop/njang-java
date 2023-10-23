public class Scope {

  static String exemple = "Hello word";

  public static void main(String[] args) {
    function1();
    function2();
  }

  public static void function1() {
    System.out.println(exemple);
  }

  public static void function2() {
    System.out.println(exemple);
  }
}
