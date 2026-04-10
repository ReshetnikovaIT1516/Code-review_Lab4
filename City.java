import java.util.HashMap;
import java.util.Map;
public class City {
  //FIX ME: Добавлены пробелы после оператора if и перед {
  private String nameCity;
  private Map<String, Integer> ways;
  private InputChecks check = new InputChecks();
  //свойства
  public String getNameCity() {
    return nameCity;
  }
  public Map<String, Integer> getWays() {
    return ways;
  }
  public Integer getCost(String nameCity) {
    return ways.get(nameCity);
  }
  public void setNameCity(String nameCity) {
    this.nameCity = nameCity;
  }
  //конструктор с названием города
  public City(String nameCity) {
    this.nameCity = nameCity;
    this.ways = new HashMap<>();
  }
  //конструктор с набором путей для 2 задачи
  public City(String nameCity, Map<String, Integer> way) {
    this.nameCity = nameCity;
    this.ways = new HashMap<>(way);

    for (Map.Entry<String, Integer> entry : way.entrySet()) {
      String fromCity = entry.getKey();
      int cost = entry.getValue();
      cost = check.negativeNumber(cost);
      this.ways.put(fromCity, cost);
    }
  }
  //добавление маршрута и стоимости
  public void addRoute(String nameCity, int cost) {
    cost = check.negativeNumber(cost);
    ways.put(nameCity, cost);
  }
  @Override
  public String toString() {
    return nameCity + ":" + ways;
  }
}
