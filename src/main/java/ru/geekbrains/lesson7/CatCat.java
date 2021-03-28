package ru.geekbrains.lesson7;

public class CatCat {
    private String name;
    private static int run;
    private static int jump;

    //    String name = "SomeCat";
////    void run(int length);
//    void jump(int high);
    public CatCat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public CatCat() {

    }
}

//    default void doDefault() {
//
//        System.out.println("SomeCat\n" + name);
//        doPrivate();
//    }
//    CatCat CAT_CAT= new CatCat() {
//        @Override
//        public void run(int length) {
//
//        }
//
//        @Override
//        public void jump(int high) {
//
//        }
//
//        @Override
//        public void doPrivate() {
//
//        }
//    };
//    void doPrivate();
//}