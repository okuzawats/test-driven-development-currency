public class Franc {
  private final int amount;

  Franc(int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  @Override public boolean equals(Object object) {
    // Javaは同一クラスであれば別のオブジェクトのprivateフィールドにアクセスできる
    final Franc franc = (Franc) object;
    return this.amount == franc.amount;
  }
}