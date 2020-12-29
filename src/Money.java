public class Money {
  protected int amount;

  @Override public boolean equals(Object object) {
    // Javaは同一クラスであれば別のオブジェクトのprivateフィールドにアクセスできる
    final Money money = (Money) object;
    return this.amount == money.amount && getClass().equals(money.getClass());
  }
}
