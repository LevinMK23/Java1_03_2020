package lesson7;

public class Cat {

    private String name;
    private boolean hunger = false;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if(appetite< p.food) {
            p.decreaseFood(appetite);
            hunger = true;
        }
    }
    public void HungerInfo(){
        if(hunger){
            System.out.println("Котик сыт");
        }
        else {
            System.out.println("Котик голоден");
        }
    }

}
