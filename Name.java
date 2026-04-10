//FIX ME: Добавлены пробелы после оператора if и перед {
public class Name {
  private String surname;
  private String firstname;
  private String patronymic;
  //свойства
  public String getSurname() {
    return surname;
  }
  public String getFirstname() {
    return firstname;
  }
  public String getPatronymic() {
    return patronymic;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }
  //конструкторы
  //по умолчанию
  public Name() {
    this.surname = null;
    this.firstname = "Клеопатра";
    this.patronymic = null;
  }

  //    //копирования
//    public Name(Name name){
//        this.surname = name.surname;
//        this.firstname = name.firstname;
//        this.patronymic = name.patronymic;
//    }
  //с параметром
  public Name(String surname, String firstname, String patronymic) {
    setSurname(surname);
    setFirstname(firstname);
    setPatronymic(patronymic);
  }
  @Override
  public String toString() {
    String result = "";
    if (surname != null) {
      result += surname;
    }
    if (firstname != null) {
      if (!result.isEmpty()) {
        result += " ";
      }
      result += firstname;
    }
    if (patronymic != null) {
      if (!result.isEmpty()) {
        result += " ";
      }
      result += patronymic;
    }
    return result;
  }
}
