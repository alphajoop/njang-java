public class Polymorphism2 {

  public static void main(String[] args) {
    // Crée des objets de différentes sous-classes et les affecte à des références de type Animal
    Animal a1 = new Animal(); // Animal de base
    Animal a2 = new Chien(); // Chien est un Animal
    Animal a3 = new Oiseau(); // Oiseau est un Animal
    Animal a4 = new Pigeon(); // Pigeon est un Oiseau

    // Appelle la méthode deplacer() sur chaque objet
    a1.deplacer(); // Appelle la méthode de la classe Animal
    a2.deplacer(); // Appelle la méthode deplacer() de Chien et ajoute "ouaf ouaf"
    a3.deplacer(); // Appelle la méthode deplacer() de Oiseau
    a4.deplacer(); // Appelle la méthode deplacer() de Pigeon
    // Remarque : Le polymorphisme permet d'appeler les méthodes appropriées en fonction du type réel des objets.
  }
}

class Animal {

  // Méthode de base de la classe Animal
  void deplacer() {
    System.out.println("Je me déplace");
  }
}

class Chien extends Animal {

  // Redéfinition de la méthode deplacer() de la classe Animal
  @Override
  void deplacer() {
    super.deplacer(); // Appelle la méthode deplacer() de la classe Animal
    System.out.println("ouaf ouaf");
  }
}

class Oiseau extends Animal {

  // Redéfinition de la méthode deplacer() de la classe Animal
  void deplacer() {
    System.out.println("Je vole");
  }
}

class Pigeon extends Oiseau {

  // Redéfinition de la méthode deplacer() de la classe Oiseau
  void deplacer() {
    System.out.println("Je vole surtout en ville");
  }
}
