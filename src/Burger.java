import java.util.Scanner;

public class Burger {
    String bun = "м'яка пшенична булочка";
    String meat = "котлета зі свинини";
    String cheese = "плавлений сир";
    String greenery = "солоний огірочок і цибуля";
    String mayo = "соус";

    public void burger(int menu) {
        String name = "звичайний";
        if (menu == 1) {

        }
        if (menu == 2) {
            bun = "м'яка пшенична булочка з кунжутом";
        }
        if (menu == 3) {
            meat = "котлета із яловичини";
        }
        if (menu == 4) {
            bun = "м'яка пшенична булочка з кунжутом";
            meat = "котлета із яловичини";
        }
        System.out.println("Бургер " + name);
        System.out.println("Склад бургеру:");
        System.out.println(bun);
        System.out.println(meat);
        System.out.println(cheese);
        System.out.println(greenery);
        System.out.println(mayo);
    }

    public void burgerDiet(int menu) {
        String name = "дієтичний";
        if (menu == 1) {

        }
        if (menu == 2) {
            bun = "м'яка пшенична булочка з кунжутом";
        }
        if (menu == 3) {
            meat = "котлета із яловичини";
        }
        if (menu == 4) {
            bun = "м'яка пшенична булочка з кунжутом";
            meat = "котлета із яловичини";
        }
        System.out.println("Бургер " + name);
        System.out.println("Склад бургеру:");
        System.out.println(bun);
        System.out.println(meat);
        System.out.println(cheese);
        System.out.println(greenery);
    }

    public void burgerDouble(int menu) {
        String name = "подвійний";
        if (menu == 1) {
            meat = "дві котлети із свинини";
        }
        if (menu == 2) {
            bun = "м'яка пшенична булочка з кунжутом";
        }
        if (menu == 3) {
            meat = "дві котлети із яловичини";
        }
        if (menu == 4) {
            bun = "м'яка пшенична булочка з кунжутом";
            meat = "дві котлети із яловичини";
        }
        System.out.println("Бургер " + name);
        System.out.println("Склад бургеру:");
        System.out.println(bun);
        System.out.println(meat);
        System.out.println(cheese);
        System.out.println(greenery);
        System.out.println(mayo);
    }

    public void burgerCreate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть який бургер з меню ви хочете");
        System.out.println("Меню: usual; diet; double");
        String answer = scanner.nextLine();
        if (answer.equals("usual")){
            System.out.println("Оберіть склад свого бургеру:");
            System.out.println("1. Звичайна булочка й котлета зі свинини");
            System.out.println("2. Булочка з кунжутом й котлета зі свинини");
            System.out.println("3. Звичайна булочка й котлета із яловичини");
            System.out.println("4. Булочка з кужутом й котлета із яловичини");
            System.out.println("Будь ласка напишіть лише номер");
            int answerInt = scanner.nextInt();
            if (answerInt == 1){
                burger(1);
            }
            if (answerInt == 2){
                burger(2);
            }
            if (answerInt == 3){
                burger(3);
            }
            if (answerInt == 4){
                burger(4);
            }
        }
        if (answer.equals("diet")){
            System.out.println("Оберіть склад свого бургеру:");
            System.out.println("1. Звичайна булочка й котлета зі свинини");
            System.out.println("2. Булочка з кунжутом й котлета зі свинини");
            System.out.println("3. Звичайна булочка й котлета із яловичини");
            System.out.println("4. Булочка з кужутом й котлета із яловичини");
            System.out.println("Будь ласка напишіть лише номер");
            int answerInt = scanner.nextInt();
            if (answerInt == 1){
                burgerDiet(1);
            }
            if (answerInt == 2){
                burgerDiet(2);
            }
            if (answerInt == 3){
                burgerDiet(3);
            }
            if (answerInt == 4){
                burgerDiet(4);
            }
        }
        if (answer.equals("double")){
            System.out.println("Оберіть склад свого бургеру:");
            System.out.println("1. Звичайна булочка й котлета зі свинини");
            System.out.println("2. Булочка з кунжутом й котлета зі свинини");
            System.out.println("3. Звичайна булочка й котлета із яловичини");
            System.out.println("4. Булочка з кужутом й котлета із яловичини");
            System.out.println("Будь ласка напишіть лише номер");
            int answerInt = scanner.nextInt();
            if (answerInt == 1){
                burgerDouble(1);
            }
            if (answerInt == 2){
                burgerDouble(2);
            }
            if (answerInt == 3){
                burgerDouble(3);
            }
            if (answerInt == 4){
                burgerDouble(4);
            }
        }
    }
}
