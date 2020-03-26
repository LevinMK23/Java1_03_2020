package lesson5.hometask;

public class Population {

    private Cat adam = new Cat("Adam", Cat.Sex.MAN);
    private Cat eva = new Cat("Eva", Cat.Sex.WOMAN);

    public Population() {
        for (int i = 0; i < 10; i++) {
            adam.makeChild(eva);
        }
        for (Cat cat : adam.getChildren()) {
            for (Cat cat1 : adam.getChildren()) {
                if (!cat.getSex().equals(cat1.getSex())) {
                    deepPopulationIncrease(cat1, cat, 5);
                }
            }
        }
    }

    public void deepPopulationIncrease(Cat cat1, Cat cat2, int depth) {
        if (depth <= 0) {
            return;
        }
        if (!cat1.getSex().equals(cat2.getSex())) {
            cat1.makeChild(cat2);
            cat1.makeChild(cat2);
            Cat firstChild = cat1.getChildren().get(0);
            Cat secondChild = cat1.getChildren().get(1);
            deepPopulationIncrease(firstChild, secondChild, depth - 1);
        }
    }

    public void printPopulationTree() {
        // TODO: 3/26/2020
//        Adam : {
//            children : {
//                Cat1 : {
//                    children : {
//                        Cat3,
//                        Cat4,
//                        Cat5
//                    }
//                },
//                Cat6 : {
//                    children : {
//                        Cat7,
//                        Cat8
//                    }
//                }
//            }
//        }
    }
}
