public class HelloWorld {
  public static void main(String[] args) {
    // sayHello("John");
    // sayHello("Susan");
    // sayHello("James");
    // sayHello("Santa");
    showBanner();
    sayHelloToAll(new String[] { "John", "Susan", "James", "Santa" });
  }

  public static void sayHello(String name) {
    // Given a name to say hello to, like "John", prints "Hello John"
    // If the name is "Santa", say Merry Christmas instead.
    if (name.equals("Santa")) {
      System.out.println("Merry Christmas");

    } else {
      System.out.println("Hello " + name);
    }
  }

  public static void sayHelloToAll(String[] names) {
    // Say hello to each of the people whose names are in the list
    for (int i = 0; i < names.length; i++) {
      sayHello(names[i]);
    }
  }

  public static void showBanner() {
    System.out.println("---------------");
    System.out.println("|    Hello!   |");
    System.out.println("---------------");
  }
}
