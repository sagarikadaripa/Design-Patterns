package SingletonDesignPattern;

class SingletonEager {
    
    private static SingletonEager object;
    //private static int one;

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        if(object == null){
            object = new SingletonEager();
        }
        System.out.println("Singleton" + object);
        return object;
    }

    public static void main(String[] args){
        getInstance();
    }

}
