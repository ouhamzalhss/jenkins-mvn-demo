package com.ouhamza;
public class HelloWorld {
  public static void main(String[] args) {
    HelloWorld myWorld = new HelloWorld();
    String said = myWorld.sayHelloTo("Mes chérs développeurs");
    System.out.println(said);
    }
  public String sayHelloTo(String to) {
    return "Essalam 3likom "+to+"!";
    }
}
