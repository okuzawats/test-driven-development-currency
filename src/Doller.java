public class Doller {
  int amount;

  Doller(int amount) {
    this.amount = amount;
  }

  Doller times(int multiplier) {
    return new Doller(amount * multiplier);
  }

  @Override public boolean equals(Object object) {
    final Doller doller = (Doller) object;
    return this.amount == doller.amount;
  }
}
