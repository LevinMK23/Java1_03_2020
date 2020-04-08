package lesson5.homework;

public class Test {
    public static void main(String[] args) {
        Worker[] w = new Worker[5];
        w[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        w[1] = new Worker("Ivahov Ivan", "Engineer", "ivhvan@mailbox.com", "892312312", 10000, 10);
        w[2] = new Worker("Ivapov Ivan", "Engineer", "ivpvan@mailbox.com", "892312312", 50000, 20);
        w[3] = new Worker("Ivamov Ivan", "Engineer", "ivmvan@mailbox.com", "892312312", 20000, 70);
        w[4] = new Worker("Ivabov Ivan", "Engineer", "ivbvan@mailbox.com", "892312312", 80000, 60);
        for (int i = 0; i < 5; i++) {
            if(w[i].age>40){
                w[i].Info();
            }
        }
    }
}
