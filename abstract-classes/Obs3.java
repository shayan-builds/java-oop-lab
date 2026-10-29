abstract class Base{
    void fun(){
        System.out.println("Accessing concrete method of abstract base class through a dervied objetc d ");
    }
}
class Derived extends Base{
}
public class Obs3{
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun();
    }
}