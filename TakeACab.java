class TakeACab implements Service {
  private int bookingFare = 200;
  private int perKM = 33;
  
  public TakeACab() {
  }

  @Override
  public int computeFare(Request req) {
    int distance = req.getDistance();
    int fare = 0;

    // Distance
    fare += distance * perKM;

    // Booking
    fare += bookingFare;

    return fare;
  }

  @Override
  public String toString() {
    return "TakeACab";
  }
}
