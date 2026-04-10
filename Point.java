public class Point {
  //FIX ME: Добавлены пробелы после перед {
  private double x;
  private double y;
  private InputChecks check = new InputChecks();
  //свойства
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public void setX(double x) {
    this.x = check.point(x);
  }
  public void setY(double y) {
    this.y = check.point(y);
  }
  //конструкторы
  //по умолчанию
  public Point() {
    this.x = -5;
    this.y = 12.4;
  }
  //копирования
//    public Point(Point point){
//        this.x = point.x;
//        this.y = point.y;
//    }
  //с параметром
  public Point(double x, double y) {
    setX(x);
    setY(y);
  }
  @Override
  public String toString() {
    return "{" + x + ";" + y + "}";
  }

}
