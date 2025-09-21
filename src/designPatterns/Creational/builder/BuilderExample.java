package designPatterns.Creational.builder;

class Burger {
    private String size;
    private boolean cheese;
    private boolean pepperoni;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
    }

    public void showDetails() {
        System.out.println("Burger Size: " + size + ", Cheese: " + cheese + ", Pepperoni: " + pepperoni);
    }

    // Builder Class
    public static class BurgerBuilder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;

        public BurgerBuilder(String size) {
            this.size = size;
        }

        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public BurgerBuilder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder("Large")
                .addCheese()
                .addPepperoni()
                .build();
        burger.showDetails();
    }
}

