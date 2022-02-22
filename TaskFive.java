import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {


        Client client1 = new Client();
        client1.name = "Иванов Иван Иванович";
        client1.age = 19;
        client1.money = 15_000_02;
        client1.existTrastee = false;
        client1.readyGetCredit = false;

        Client client2 = new Client();
        client2.name = "Иванов Иван Иванович";
        client2.age = 15;
        client2.money = 15_000_02;
        client2.existTrastee = false;
        client2.readyGetCredit = false;

        Client client3 = new Client();
        client3.name = "Иванов Иван Иванович";
        client3.age = 19;
        client3.money = 40_000_02;
        client3.existTrastee = false;
        client3.readyGetCredit = false;

        Client client4 = new Client();
        client4.name = "Иванов Иван Иванович";
        client4.age = 15;
        client4.money = 40_000_02;
        client4.existTrastee = true;
        client4.readyGetCredit = false;

        Client client5 = new Client();
        client5.name = "Иванов Иван Иванович";
        client5.age = 15;
        client5.money = 15_000_02;
        client5.existTrastee = true;
        client5.readyGetCredit = true;

        Car car1 = new Car();
        car1.model = "Tayota Camry. С-класс";
        car1.cost = 15_000_00;

        Car car2 = new Car();
        car2.model = "Tayota Camry. E-класс";
        car2.cost = 30_000_00;

        Car car3 = new Car();
        car3.model = "Tayota Prado. C-класс";
        car3.cost = 40_000_00;


        Car current = null;
        Client currentClient;
        currentClient = client4;

        int age = currentClient.age;
        if (age < 18 & !currentClient.existTrastee) {
            System.out.println("Приходите через " + (18 - age) + "лет");
            return;
        }
        System.out.println("У нас есть car1 - 1, car2 - 2, car3 - 3");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число машины, которую Вы хотите?");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Вы выбрали car1");
                current = car1;
                break;
            case 2:
                System.out.println("Вы выбрали car2");
                current = car2;
                break;
            case 3:
                System.out.println("Вы выбрали car3");
                current = car3;
                break;
        }
        if (currentClient.money < current.cost & !currentClient.readyGetCredit) {
            System.out.println("Приходите, когда будете готовы совершить покупку");
            return;
        }

        if (currentClient.money > current.cost) {
            System.out.println("Ваш договор покупки оформлен. Поздравляем с приобретением");
        } else {
            System.out.println("Ваш договор покупки оформлен в кредит на 3 года. Поздравляем с приобритением");
        }

    }
}

