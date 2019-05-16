public class Singleton{
    private static Singleton singleton=null;

    public static Singleton crearInstancia(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
    



}