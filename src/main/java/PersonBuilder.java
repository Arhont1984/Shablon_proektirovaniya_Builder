public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
        this.age = -1;
        this.address = null;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;

    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;

    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Вы не ввели Имя");
        } else if (surname == null) {
            throw new IllegalStateException("Вы не ввели фамилию");
        } else if (age < 0) {
            throw new IllegalStateException("Вы не указали возраст или задали его не верным");
        } else if (address == null) {
            throw new IllegalStateException("Вы не указали адрес");
        }

        Person person = new Person(name, surname);
        person.setAge(this.age);
        person.setAddress(this.address);
        return person;
    }
}