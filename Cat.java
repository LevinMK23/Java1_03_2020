public class Cat extends  Animals {
    protected int catRunLimit = 200;
    protected float catJumpLimit = 2f;
    public Cat(String name) {
        super(name);
        runLimit = catRunLimit;
        jumpLimit = catJumpLimit;
    }


}
