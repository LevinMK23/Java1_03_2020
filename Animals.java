public class Animals {
    protected String name;
    protected int runLimit = 0;
    protected float jumpLimit = 0f;
    protected int swimLimit = 0;

    public Animals(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("name: " + name );
    }
    public void run(int i){
        boolean a= false;
        if(i<runLimit){
            a=true;
        }
        System.out.println(a);
    }
    public void jump(float i){
        boolean a= false;
        if(i<jumpLimit){
            a=true;
        }
        System.out.println(a);
    }
    public void swim(int i){
        boolean a= false;
        if(i<swimLimit){
            a=true;
        }
        System.out.println(a);
    }
}
