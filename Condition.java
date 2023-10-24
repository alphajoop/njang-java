public class Condition {

  // Énumération définissant toutes les directions possibles
  enum Direction {
    north,
    east,
    south,
    west,
  }

  public static void main(String[] args) {
    // Utilisation d'une structure conditionnelle 'if-else' pour déterminer le nombre d'arguments passés au programme.
    if (args.length == 1) {
      sayHelloTo(args[0]);
    } else if (args.length == 2) {
      sayHelloTo(args[0] + " " + args[1]);
    } else {
      sayHelloTo("world");
    }

    // Utilisation d'une structure de commutation 'switch' basée sur le nombre d'arguments.
    switch (args.length) {
      case 0: // Aucun argument n'a été envoyé.
        sayHelloTo("world");
        break;
      case 1: // L'utilisateur a fourni un argument dans le terminal.
        sayHelloTo(args[0]);
        break;
      case 2: // L'utilisateur a fourni 2 arguments.
        sayHelloTo(args[0] + "-" + args[1]);
        break;
      default: // L'utilisateur a fourni plus d'arguments que ce qui est géré.
        System.out.println(
          "Désolé, je ne sais pas comment gérer plus de 2 noms !"
        );
    }

    // Utilisation d'une structure de commutation 'switch' pour gérer différentes directions.
    Direction direction = Direction.south;
    switch (direction) {
      case north:
        System.out.println("Vous allez vers le nord");
        break;
      case east:
        System.out.println("Vous allez vers l'est");
        break;
      case south:
        System.out.println("Vous allez vers le sud");
        break;
      case west:
        System.out.println("Vous allez vers l'ouest");
        break;
    }
  }

  // Cette méthode affiche un message de salutation en utilisant le nom du destinataire passé en argument.
  static void sayHelloTo(String recipient) {
    System.out.println("Bonjour " + recipient);
  }
}
