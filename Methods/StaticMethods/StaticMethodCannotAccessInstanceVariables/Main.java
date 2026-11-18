import java.io.*;

public class Main {
  // static variable
  static int a = 40;

  //Instance variable
  int b = 50;

  void simpleDisplay() {
    System.out.println(a);
    System.out.println(b);
  }

  //Declaration of a static method
  static void staticDisplay() {
    System.out.println(a);
  }

  // main method
  public static void main(String[] args) {
    Main obj = new Main();
    obj.simpleDisplay();

    //calling static method
    staticDisplay();
  }
}
