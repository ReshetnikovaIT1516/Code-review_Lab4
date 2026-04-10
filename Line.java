public class Line {
  private Point start;
  private Point end;
  //FIX ME: Добавлены пробелы после оператора if и перед {
  //свойства
  public Point getStart() {
    return start;
  }
  public Point getEnd() {
    return end;
  }
  public void setStart(Point start) {
    this.start = start;
  }
  public void setEnd(Point end) {
    this.end = end;
  }
  //конструкторы
  public Line() {
    this.start = new Point(1, 3);
    this.end = new Point(23, 8);
  }
  //    public Line(Line line){
  //        this.start = new Point(line.start);
  //        this.end = new Point(line.end);
  //    }
  public Line(Point start, Point end) {
    setStart(start);
    setEnd(end);
  }
  //конструктор для горизонтальной линии
  public Line(double x1, double x2, double y) {
    this.start = new Point(x1, y);
    this.end = new Point(x2, y);
  }
  @Override
  public String toString() {
    return "Линия от " + start + " до " + end;
  }
}
