public class Main {
    public static void main(String[] args) {

        //Если не зададать хоть одно поле - будет отловлена ошибка в Person build()
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                //т.к. в медоде  newChildBuilder() у нас подтягивают все данные от мамы, кроме возраста и имени. Тут надо обязательно задать возраст
                //Иначе  Person build() будет отлавливать ошибку в недостаточности данных.
                .setAge(5)
                .build();
        System.out.println("У " + mom + " \nесть сын, " + son);

        //т.е. это пустой PersonBuilder() этот код отработает с ошибкой, которую я отловил в Person build()
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}