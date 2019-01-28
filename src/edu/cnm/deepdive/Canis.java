package edu.cnm.deepdive;

import edu.cnm.deepdive.Canis.override;

public abstract class Canis { // cannot directly create instances because abstract

  public @interface override {

  }


  public static final int NUMBER_OF_LEGS = 4;
  
  public abstract void vocalize();
  
  public abstract void hunt();
  
  /*
   * (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @override
  public String toString() {
    return "I am a " + this.getClass().getSimpleName();
  }

  
}
