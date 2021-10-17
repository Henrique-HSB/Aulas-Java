package lambda;


public class WelcomeLambda {

  interface SayHello{
    void sayHelloJava8();
  }

  public static void main(String[] args) {
    SayHello hello = () -> System.out.println("Java 8 Hello World");
    hello.sayHelloJava8();

    // Mesmo resultado

    new Thread(() -> System.out.println("Welcome Lambda!")).run();

    //mais um exemplo de lambda
    Runnable runnable = () -> System.out.println("Welcome to lambdas!");
    runnable.run();



  }

}
