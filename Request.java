class Request {
  private int distance;
  private int passengerCount;
  private int time;

  public Request(int distance, int passengerCount, int time) {
    this.distance = distance;
    this.passengerCount = passengerCount;
    this.time = time;
  }

  public int getDistance() {
    return this.distance;
  }

  public int getPassengerCount() {
    return this.passengerCount;
  }

  public int getTime() {
    return this.time;
  }


}
