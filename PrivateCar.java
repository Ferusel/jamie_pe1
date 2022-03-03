class PrivateCar implements Car {
  private String plate;
  private int timeToAvailable;

  public PrivateCar(String plate, int timeToAvailable) {
    this.plate = plate;
    this.timeToAvailable = timeToAvailable;
  }

  public int getTimeToAvailable() {
    return this.timeToAvailable;
  }
  
  @Override
  public String toString() {
    String minOrMins = this.timeToAvailable > 1 ? "mins" : "min";
    return "PrivateCar " + this.plate 
      + " (" + Integer.toString(this.timeToAvailable) + " " + minOrMins + " away)";
  }
} 
