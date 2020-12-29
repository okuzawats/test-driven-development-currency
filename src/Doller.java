public class Doller {
  private final int amount;

  Doller(int amount) {
    this.amount = amount;
  }

  Doller times(int multiplier) {
    return new Doller(amount * multiplier);
  }

  @Override public boolean equals(Object object) {
    // Javaは同一クラスであれば別のオブジェクトのprivateフィールドにアクセスできる
    final Doller doller = (Doller) object;
    return this.amount == doller.amount;
  }
}
