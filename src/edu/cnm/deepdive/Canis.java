package edu.cnm.deepdive;

public abstract class Canis {

  public static final int NUMBER_OF_LEGS = 4;
  
  private final int[] data;
  
  public Canis() {
    System.out.println("Canis::new");
  }
  
  public abstract void vocalize();
  
  public abstract void hunt();

  @Override
  public String toString() {
    return "I am a " + this.getClass().getSimpleName();
  }
  
  public static void about() {
    System.out.println("Canis is a genus of Canidae, distinguished by its large size, massive skull, and long legs.");
  }

  public int[] getData() {
    return data;
  }  
  
  {
    data = new int[] {1, 2, 3};
    System.out.println("Canis::initialize");
  }
  
}