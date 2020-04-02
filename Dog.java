public class Dog extends Animals {
    protected int dogRunLimit = 500;
    protected float dogJumpLimit = 0.5f;
    protected int dofSwimLimit = 10;
    public Dog(String name) {
        super(name);
        runLimit = dogRunLimit;
        jumpLimit = dogJumpLimit;
        swimLimit = dofSwimLimit;
    }
}
