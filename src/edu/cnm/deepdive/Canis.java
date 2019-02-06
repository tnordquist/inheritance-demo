package edu.cnm.deepdive;

import edu.cnm.deepdive.Canis.override;

public abstract class Canis { // cannot directly create instances because abstract
                              // But, it can have a constructor.

 

  public @interface override {

  }


   // final promises to compiler that it will be initialized. Before or after the constructor?
  public static final int NUMBER_OF_LEGS = 4;

  public abstract void vocalize();

  public abstract void hunt();
  public Canis() {
    System.out.println("Canis::new");
    final int[] data = {1,2,3};
  }
  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @override
  public String toString() {
    return "I am a " + this.getClass().getSimpleName();
  }

  public static void about() {
    System.out.println(
        "Canis is a genus of Canidae, distinguished by its large size, massive skull, and long legs.");
  }


}
