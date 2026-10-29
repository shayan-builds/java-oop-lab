// abstract classes can also have final methods(methods that cannot be overriden)
abstract class Base{
    final void fun(){
        System.out.println("Base fun() called");
    }
}
class Derived extends Base{
}

public class Obs4{
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();// b is reference variable with reference type Base, therefore it can access the methods inside the Base class
    }
}