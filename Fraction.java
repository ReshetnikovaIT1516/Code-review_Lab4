public class Fraction {
  private int numerator;
  private int denominator;
  private InputChecks check = new InputChecks();
  //свойства
  public int getNumerator() {
    return numerator;
  }
  public int getDenominator() {
    return denominator;
  }
  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }
  public void setDenominator(int denominator) {
    this.denominator = check.fraction(denominator);
  }
  //нахождение НОД
  private int gcd(int x, int y) {
    x = Math.abs(x);
    y = Math.abs(y);
    while (y != 0) {
      int value = y;
      y = x % y;
      x = value;
    }
    return x;
  }
  //упрощение дроби
  private void simplify() {
    int gcd = gcd(Math.abs(numerator), Math.abs((denominator)));
    numerator /= gcd;
    denominator /= gcd;
    if (denominator < 0) {
      numerator = -numerator;
      denominator = -denominator;
    }
  }

  //конструкторы
  public Fraction() {
    this.numerator = 1;
    this.denominator = 3;
  }

  public Fraction(int numerator, int denominator) {
    setNumerator(numerator);
    setDenominator(denominator);
    simplify();
  }

  //операции с дробями
  //операция сложения
  public Fraction summa(Fraction fraction) {
    int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
    int newDenominator = this.denominator * fraction.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  //операция вычитания
  public Fraction subtract(Fraction fraction) {
    int newNumerator = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
    int newDenominator = this.denominator * fraction.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  //операция умножения
  public Fraction multiply(Fraction fraction) {
    int newNumerator = this.numerator * fraction.numerator;
    int newDenominator = this.denominator * fraction.denominator;
    return new Fraction(newNumerator, newDenominator);
  }

  //операция деления
  public Fraction divide(Fraction fraction) {
    int newNumerator = this.numerator * fraction.denominator;
    int newDenominator = this.denominator * fraction.numerator;
    return new Fraction(newNumerator, newDenominator);
  }

  //операции с целыми числами
  public Fraction summa(int number) {
    return summa(new Fraction(number, 1));
  }

  public Fraction subtract(int number) {
    return subtract(new Fraction(number, 1));
  }

  public Fraction multiply(int number) {
    return multiply(new Fraction(number, 1));
  }

  public Fraction divide(int number) {
    return divide((new Fraction(number, 1)));
  }

  @Override
  public String toString() {
    if (denominator == 1) {
      return numerator + "";
    }
    return numerator + "/" + denominator;
  }
}
