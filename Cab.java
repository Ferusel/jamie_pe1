class Cab implements Car {
  private String plate;
  private int timeToAvailable;

  public Cab(String plate, int timeToAvailable) {
    this.plate = plate;
    this.timeToAvailable = timeToAvailable;
  }
  
  public int getTimeToAvailable() {
    return this.timeToAvailable;
  }

  @Override
  public String toString() {
    String minOrMins = this.timeToAvailable > 1 ? "mins" : "min";
    return "Cab " + this.plate + 
      " (" + Integer.toString(this.timeToAvailable) + " " + minOrMins + " away)";
  }
}
