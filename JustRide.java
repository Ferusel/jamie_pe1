class JustRide implements Service {
  private int surcharge = 500;
  private int perKM = 22;
  private int lowerTime = 600;
  private int upperTime = 900;

  public JustRide() {
  }

  @Override
  public int computeFare(Request req) {
    int distance = req.getDistance();
    int time = req.getTime();
    int fare = 0;

    // Distance
    fare += distance * perKM;

    // Surcharge
    if (time >= lowerTime && time <= upperTime) {
      fare += surcharge;
    }

    return fare;
  }

  @Override
  public String toString() {
    return "JustRide";
  }
}
