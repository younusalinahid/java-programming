package Oop;

public class StaticVariable {

  static int count = 0;

  StaticVariable(){
    count++;
  }

  void totalStudent(){
    System.out.println("Total student = "+count);
  }


}
