public class DoWhile {

  public static void main(String[] args) {
    int pushUpGoal = 0;
    // La boucle 'do...while' effectuera au moins une itération.
    do {
      System.out.println("Push up!");
      // À chaque itération, un message "Push up!" est affiché et la variable 'pushUpGoal' est décrémentée de 1.
      pushUpGoal -= 1;
    } while (pushUpGoal > 0); // La boucle continue tant que 'pushUpGoal' est supérieur à 0.
  }
}
