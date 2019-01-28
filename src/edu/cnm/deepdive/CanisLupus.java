package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  @Override
  public void vocalize() {
    System.out.println("Howl!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt prey in packs");
  }

}
