
public class SuperClass {
private int privateVar = 123456789;
    
    public int getPrivateVar() {
        return privateVar;
    }
}
class SubClass extends SuperClass {
    void show() {
        // Cannot access privateVar directly
        System.out.println("Private member cannot be accessed directly, but via getprivate: " + getPrivateVar());
    }

}
