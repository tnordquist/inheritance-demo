package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {
  
  private boolean goodBoy;
  
  public  CanisLupusFamiliaris() {

    System.out.println("CanisLupusFamiliaris::new");
    this(true);
    getData()[2] = 5;
   // data = new int[]//can't point the array to have another array object but individual values can be changed.
    
  }
  
  public CanisLupusFamiliaris (boolean goodBoy)

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.CanisLupus#vocalize()
   */
  @Override
  public void vocalize() {
    System.out.println("Bark!");
  }

  /* (non-Javadoc)
   * @see edu.cnm.deepdive.Canis#toString()
   */
  @Override
  public String toString() {
    return super.toString() + " and I am a good boy.";
  }
  
  public static void about() {
    System.out.println(
        "CanisLupusFamiliaris is a subspecies of Canis.");
  
  
  }
}
