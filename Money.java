class Money implements Expression {
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

  @Override
  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  @Override
  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  @Override
  public Money reduce(Bank bank, String to) {
    int rate = bank.rate(currency, to);
    return new Money(amount / rate, to);
  }

  String currency() {
    return currency;
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }
}
