package creational.singleton;

public class DoubleCheckingSingleton {

    /*
     *      VOLATILE needed, because SOME_THREAD can get access to object, which isn't fully initialized
     *
     *      1) выделение памяти под объект
     *      2) инициализация указателя
     *          >>> доступ может быть получен ЗДЕСЬ <<<
     *      3) конструирование объекта (инициализация полей)
     */
    private static volatile DoubleCheckingSingleton instance;

    private DoubleCheckingSingleton() {
    }

    public static DoubleCheckingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckingSingleton.class) {  // lock for each instance on class
                if (instance == null) {
                    instance = new DoubleCheckingSingleton();
                }
            }
        }
        return instance;
    }
}
