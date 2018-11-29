package edu.cnm.deepdive;

import java.util.Random;

public class Toys {
private static  String[] toys = {"Car","Boat","Bicycle","Animal","Skis"};
public static Friend getAToy(Friend friend){
  Random rng = new Random();
  String toy = toys[rng.nextInt(toys.length-1)];
  friend.setToy(toy);
  return friend;
}
}
