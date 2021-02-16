package HomeWork11;

public class Launch {
    public static void main(String[] args) {
        Mouse numberOne = new Mouse("Sony", 240);
        Mouse numberTwo = new Mouse("Jeki", 350);
        Mouse numberThree = new Mouse("Pety", 390);
        Mouse numberFour = new Mouse("Vanya", 460);
        Mouse numberFive = new Mouse("Jerry", 425);
        Mouse numberSix = new Mouse("Jons", 450);
        Cat Tom = new Cat();
        System.out.println(Tom);
        Tom.Eat(numberOne);
        Tom.Eat(numberTwo);
        Tom.Eat(numberThree);
        Tom.Eat(numberFour);
        Tom.Eat(numberFive);
        Tom.Wetakeouttheoldvictim();
        System.out.println(Tom);
        Tom.Eat(numberSix);
        Tom.Eat(numberOne);
        Tom.renewal();

    }
}

