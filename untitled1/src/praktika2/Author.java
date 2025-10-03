package praktika2;

public class Author {
    private String name;
    private String email;
    private char gender;
    private int age;

    // Конструктор с тремя параметрами
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = 0; // Устанавливаем возраст по умолчанию, если он не указан
    }

    // Существующий конструктор с четырьмя параметрами
    public Author(String name, String email, char gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

