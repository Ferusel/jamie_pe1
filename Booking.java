class Booking implements Comparable<Booking> {
  private Car car;
  private Service svc;
  private Request req;

  public Booking(Car car, Service svc, Request req) {
    if (car instanceof Cab && svc instanceof ShareARide || 
        car instanceof PrivateCar && svc instanceof TakeACab) {
      throw new IllegalArgumentException(car.toString() + " does not provide the "
            + svc.toString() + " service.");
    }

    this.car = car;
    this.svc = svc;
    this.req = req;
  }

  public int getFare() {
    return this.svc.computeFare(this.req);
  }

  public int getTimeToAvailable() {
    return this.car.getTimeToAvailable();
  }

  @Override
  public int compareTo(Booking b) {
    int thisFare = this.getFare();
    int thatFare = b.getFare();
    int thisTime = this.getTimeToAvailable();
    int thatTime = b.getTimeToAvailable();

    if (thisFare < thatFare) {
      return -1;
    } else if (thisFare == thatFare) {
      if (thisTime < thatTime) {
        return -1;
      }
    }
    return 1;
  }
}
