package edu.cnm.deepdive;

public class CanisLupus extends Canis {

  public CanisLupus() {
    System.out.println("CanisLupusFamiliaris::new");
    System.out.println("Arrays.toString(getData());
  }

  @Override
  public void vocalize() {
    System.out.println("Howl!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt prey in packs");
  }
  
  public static void about() {
    System.out.println(
        "CanisLupus is a species of Canus, commonly known as the grey or timber wolf.");
  }

}
