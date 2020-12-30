abstract class Money {
  protected int amount;

  @Override public boolean equals(Object object) {
    // Javaは同一クラスであれば別のオブジェクトのprivateフィールドにアクセスできる
    final Money money = (Money) object;
    return this.amount == money.amount && getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier);

  static Money dollar(int amount) {
    return new Doller(amount);
  }

  static Money franc(int amount) {
    return new Franc(amount);
  }
}
