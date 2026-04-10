import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//FIX ME: Все строки теперь не более 100 символов
//FIX ME: Все открывающие фигурные скобки находятся на той же строке, что и объявление
//FIX ME: Все переменные теперь соответствуют кодстайлу
//FIX ME: Добавлены пробелы после оператора if и перед {
//FIX ME: Отступы по 2 пробела вместо 4
//FIX ME: Убрала пустые строки
public class Main {
  //FIX ME: public static void main(String[] args) {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String test;
    while (true) {
      System.out.println("Выберете задачу: ");
      System.out.println("Задача 1.1");
      System.out.println("Задача 1.3");
      System.out.println("Задача 2.1");
      System.out.println("Задача 3.3");
      System.out.println("Задача 4.8");
      System.out.println("Задача 5.5");
      System.out.println("Выход - 0");
      System.out.print("Ваш выбор: ");
      test = scanner.next();
      switch (test) {
        case "1.1": {
          System.out.println("Задача 1.1");
          Point point1 = new Point();
          Point point2 = new Point(55, 103);
          Point point3 = new Point(-5, 12);
          System.out.println("Текстовое представление точек: ");
          System.out.println("Точка 1 (конструктор по умолчанию): " + point1.toString());
          System.out.println("Точка 2 (конструктор с параметром): " + point2.toString());
          System.out.println("Точка 3 (конструктор c параметром): " + point3.toString());
          System.out.println();
          break;
        }
        case "1.3": {
          System.out.println("Задача 1.3");
          Name people = new Name();
          Name people2 = new Name("Пушкин", "Александр", "Сергеевич");
          Name people3 = new Name("Маяковский", "Владимир", null);
          System.out.println("Созданные имена: ");
          System.out.println("Конструктор по умолчанию");
          System.out.println(people.toString());
          System.out.println("Конструктор с параметром");
          System.out.println(people2.toString());
          System.out.println(people3.toString());
          System.out.println();
          break;
        }
        case "2.1": {
          System.out.println("Задача 2.1");
          Line line1 = new Line();
          Line line2 = new Line(5, 25, 10);
          Line line3 = new Line(line1.getStart(), line2.getEnd());
          System.out.println("Линии до их изменений: ");
          System.out.println("Линия 1: " + line1.toString());
          System.out.println("Линия 2: " + line2.toString());
          System.out.println("Линия 3: " + line3.toString());
          line1.getStart().setX(5);
          line1.getStart().setY(4);
          line1.getEnd().setX(12);
          line1.getEnd().setY(34);
          line2.getStart().setX(0);
          line2.getStart().setY(15);
          line2.getEnd().setX(-5);
          line2.getEnd().setY(15);
          System.out.println();
          System.out.println("Линии после их первого изменения: ");
          System.out.println("Линия 1: " + line1.toString());
          System.out.println("Линия 2: " + line2.toString());
          System.out.println("Линия 3: " + line3.toString());
          System.out.println();
          Point newStart = new Point(50, 20);
          Point newEnd = new Point(80, 25);
          line1.setStart(newStart);
          line1.setEnd(newEnd);
          System.out.println("Линии после их второго изменения: ");
          System.out.println("Линия 1: " + line1.toString());
          System.out.println("Линия 2: " + line2.toString());
          System.out.println("Линия 3: " + line3.toString());
          System.out.println();
          break;
        }
        case "3.3": {
          System.out.println("Задача 3.3");
          City a = new City("A");
          City b = new City("B");
          City c = new City("C");
          City d = new City("D");
          City e = new City("E");
          City f = new City("F");
          a.addRoute("B", 5);
          a.addRoute("D", 6);
          a.addRoute("F", 1);
          b.addRoute("A", 5);
          b.addRoute("C", 3);
          c.addRoute("B", 3);
          c.addRoute("D", 4);
          d.addRoute("C", 4);
          d.addRoute("E", 2);
          d.addRoute("A", 6);
          e.addRoute("F", 2);
          f.addRoute("B", 1);
          f.addRoute("E", 2);
          System.out.println("Схема на рисунке 2: ");
          System.out.println(a.toString());
          System.out.println(b.toString());
          System.out.println(c.toString());
          System.out.println(d.toString());
          System.out.println(e.toString());
          System.out.println(f.toString());
          System.out.println();
          break;
        }
        case "4.8": {
          System.out.println("Задача 4.8");
          City A = new City("A");
          A.addRoute("B", 5);
          A.addRoute("D", 6);
          A.addRoute("F", 1);
          Map<String, Integer> bWay = new HashMap<>();
          bWay.put("A", 5);
          bWay.put("C", 3);
          City B = new City("B", bWay);
          Map<String, Integer> cWay = new HashMap<>();
          cWay.put("B", 3);
          cWay.put("D", 4);
          City C = new City("C", cWay);
          City D = new City("D");
          D.addRoute("C", 4);
          D.addRoute("E", 2);
          D.addRoute("A", 6);
          Map<String, Integer> eWay = new HashMap<>();
          eWay.put("F", 2);
          City E = new City("E", eWay);
          City F = new City("F");
          F.addRoute("B", 1);
          F.addRoute("E", 2);
          City G = new City("G");
          System.out.println(A.toString());
          System.out.println(B.toString());
          System.out.println(C.toString());
          System.out.println(D.toString());
          System.out.println(E.toString());
          System.out.println(F.toString());
          System.out.println(G.toString());
          System.out.println();
          break;
        }
        case "5.5": {
          System.out.println("Задача 5.5");
          Fraction fraction1 = new Fraction();
          Fraction fraction2 = new Fraction(2, 3);
          Fraction fraction3 = new Fraction(5, 8);
          Fraction fraction4 = new Fraction(2, 7);
          System.out.println("Созданные дроби: ");
          System.out.println("f1 = " + fraction1.toString());
          System.out.println("f2 = " + fraction2.toString());
          System.out.println("f3 = " + fraction3.toString());
          System.out.println("f4 = " + fraction4.toString());
          System.out.println();
          System.out.println("Примеры выполнения операций: ");
          Fraction sumResult = fraction1.summa(fraction2);
          System.out.println(fraction1.toString() + " + " + fraction2.toString() + " = " + sumResult);
          Fraction subtractResult = fraction3.subtract(fraction4);
          System.out.println(fraction3.toString() + " - " + fraction4.toString() + " = " +
              subtractResult);
          Fraction multiplyResult = fraction1.multiply(fraction3);
          System.out.println(fraction1.toString() + " * " + fraction3.toString() + " = "
              + multiplyResult);
          Fraction divideResult = fraction2.divide(fraction4);
          System.out.println(fraction2.toString() + " / " + fraction4.toString()
              + " = " + divideResult);
          Fraction addInt = fraction1.summa(3);
          System.out.println(fraction1.toString() + " + " + 3 + " = " + addInt);

          Fraction subtractInt = fraction2.subtract(4);
          System.out.println(fraction2.toString() + " - " + 4 + " = " + subtractInt);
          Fraction multiplyInt = fraction3.multiply(8);
          System.out.println(fraction3.toString() + " * " + 8 + " = " + multiplyInt);
          Fraction divideInt = fraction4.divide(2);
          System.out.println(fraction4.toString() + " / " + 2 + " = " + divideInt);
          System.out.println();
          System.out.println("Вычисление выражения f1.sum(f2).div(f3).minus(5)");
          Fraction result = fraction1.summa(fraction2).divide(fraction3).subtract(5);
          System.out.println(fraction1.toString() + " + " + fraction2.toString() + " = "
              + fraction1.summa(fraction2));
          System.out.println(fraction1.summa(fraction2) + " / " + fraction3.toString() + " = "
              + fraction1.summa(fraction2).divide(fraction3));
          System.out.println(fraction1.summa(fraction2).divide(fraction3) + " - 5 " + " = " + result);
          System.out.println("Результат: " + result);
          System.out.println();
          break;
        }
        case "0": {
          System.out.println("Вы вышли");
          return;
        }
        default: {
          System.out.println("Ошибка, выберите еще раз");
          break;
        }
      }
    }
  }
}
