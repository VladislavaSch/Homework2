package homework;

public class Employee {

    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int age;

    public Employee(String name, String surname, String patronymic, String position, String email,
                    String telephone, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }
}
