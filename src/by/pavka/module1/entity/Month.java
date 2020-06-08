package by.pavka.module1.entity;

public enum Month {
  JAN(31),
  FEB(28),
  MAR(31),
  APR(30),
  MAY(31),
  JUN(30),
  JUL(31),
  AUG(31),
  SEP(30),
  OCT(31),
  NOV(30),
  DEC(31);

  private int days;

  Month(int days) {
    this.days = days;
  }

  public int getDays() {
    return days;
  }
}
