package single;

/**
 * 双重加锁：保证只有第一次创建实例时才会同步
 */
public class Singleton02 {

    private volatile static Singleton02 uniqueInstance;

    private Singleton02(){

    }

    public static Singleton02 getInstance(){

        if (uniqueInstance == null){
            synchronized (Singleton02.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton02();
                }
            }

        }
        return uniqueInstance;
    }

}
