public class Burger {
    String bun;
    String meat;
    String cheese;
    String greenery;
    String mayo;
    boolean king;


    public Burger(String bun, String meat, String cheese, String greenery, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        System.out.println("Склад бургеру: " +
                bun +
                ", " + meat +
                ", " + cheese +
                ", " + greenery +
                ", " + mayo
                );
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Склад дієтичного бургеру: " +
                bun +
                ", " + meat +
                ", " + cheese +
                ", " + greenery
        );
    }

    public Burger() {
    }

    public Burger(String bun, String meat, String cheese, String greenery, String mayo, boolean king) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayo = mayo;
        System.out.println("Склад королівського бургеру: " +
                bun +
                ", " + meat +
                ", " + cheese +
                ", " + meat +
                ", " + greenery +
                ", " + mayo
        );
    }
}
