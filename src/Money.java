class Money {
  protected int amount;
  protected String currency;

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  @Override
  public boolean equals(Object object) {
    // Javaは同一クラスであれば別のオブジェクトのprivateフィールドにアクセスできる
    final Money money = (Money) object;
    return this.amount == money.amount && this.currency.equals(money.currency);
  }

  @Override
  public String toString() {
    return amount + " " + currency;
  }

  Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }
}
