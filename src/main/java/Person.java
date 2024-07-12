public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String address;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1; // возраст неизвестен по умолчанию
        this.address = null; // город неизвестен по умолчанию
    }

    public boolean hasAge() {
        return age != -1;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setName(this.name);
        child.setSurname(this.surname);
        child.setAddress(this.address);
        return child;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", \nФамилия: " + surname + ", \nВозраст: " + age + ", \nАдрес: " + address;
    }

// Не понял зачем в задаче этот метод.
//    @Override
//    public int hashCode() { /*...*/ }

}






