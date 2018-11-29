package edu.cnm.deepdive;

public class Main extends Toys{

  public static void main(String[] args) {
    Friend pearl = new Friend("FUN","Pearl", "Female", 45,12343567);
    Friend pearlWithToy = getAToy(pearl);
    pearlWithToy.getInfo();
  }

}
