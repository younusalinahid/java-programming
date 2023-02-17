package Oop;

public class ThisKeyword {

  void massage(){
      System.out.println("I am massage method ");
  }

  void display(){
      this.massage();
      System.out.println("I am display method ");
  }

}
