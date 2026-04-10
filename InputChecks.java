public class InputChecks {
  //FIX ME: Добавлены пробелы после оператора if и перед {
  public double point(double number) {
    if (Math.abs(number) >= 1000000) {
      if (number > 0) {
        System.out.println(number + " - cлишком большое число! Будет установлено значение 10000");
        return 10000;
      } else {
        System.out.println(number + " - cлишком большое число! Будет установлено значение -10000");
        return -10000;
      }
    }
    return number;
  }
  public int fraction(int denominator) {
    if (denominator == 0) {
      System.out.println("Знаменатель не может быть равен 0. Установлен знаменатель = 1");
      return 1;
    }
    return denominator;
  }
  public Integer negativeNumber(int number) {
    if (number <= 0) {
      System.out.println("Стоимость не может быть меньше или равна 0. Установлено значение 1");
      return 1;
    }
    return number;
  }
}
