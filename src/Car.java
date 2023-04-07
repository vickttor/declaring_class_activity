public class Car {
  // Car properties
  private int maxVelocity = 0;
  private int actualVelocity = 0;
  private String model = ""; 

  // Constructor
  public Car(int maxVelocity, String model) {
    this.maxVelocity = maxVelocity;
    this.model = model;
  }
   
  // Getters
  public int getMaxVelocity() {
    return maxVelocity;
  }

  public int getActualVelocity() {
    return actualVelocity;
  }

  public String getModel() {
    return model;
  }
  
  // Car actions
  public void speedUp(int velocityAmount) {
    int newVelocity = this.actualVelocity + velocityAmount;

    if(newVelocity <= this.maxVelocity) this.actualVelocity = newVelocity;
    else System.out.println("Warn: It's not possible to increase the car velocity.");
  }

  public void stop(int velocityAmount) {
    int newVelocity = this.actualVelocity - velocityAmount;

    if(newVelocity >= 0) this.actualVelocity = newVelocity;
    else System.out.println("Warn: It's not possible to decrease the car velocity");
  }

  public void switchOff() {
    if(this.actualVelocity != 0) this.actualVelocity = 0;
    else  System.out.println("Warn: The car is already switched off");
  }
}
