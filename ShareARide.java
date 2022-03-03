class ShareARide implements Service {
  private int surcharge = 500;
  private int perKM = 50;
  private int lowerTime = 600;
  private int upperTime = 900;

  public ShareARide() {
  }

  @Override
  public int computeFare(Request req) {
    int distance = req.getDistance();
    int time = req.getTime();
    int passengers = req.getPassengerCount();
    int fare = 0;

    fare += distance * perKM;
    
    if (time >= lowerTime && time <= upperTime) {
      fare += surcharge;
    }
    
    return fare / passengers;
  }

  @Override
  public String toString() {
    return "ShareARide";
  }
}
