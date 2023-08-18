public class BurgersMain {

    public static void main(String[] args){
        Burger usual = new Burger();
        Burger diet = new Burger();
        Burger doble = new Burger();
        Burger yours = new Burger();

        usual.burger(3);
        System.out.println();
        diet.burgerDiet(1);
        System.out.println();
        doble.burgerDouble(4);
        System.out.println();
        yours.burgerCreate();
    }
}
