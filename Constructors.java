package Constructorss;

public class Demo {
    static int staticVar = 23; // static variable
    int instanceVar = 34; // instance variable
    
    void modifyVars(int localVar){
        Demo.staticVar = 24;
        this.instanceVar = 33;
        System.out.println("Static Variable (Demo.staticVar): " + Demo.staticVar);
        System.out.println("Local Variable (localVar): " + localVar);
    }
    
    public static void main(String[] args) {
        Demo demoObj = new Demo();
        Demo.staticVar = 56;
        int localVar = 45; // local variable
        System.out.println("Static Variable (Demo.staticVar): " + Demo.staticVar);
        System.out.println("Instance Variable (demoObj.instanceVar): " + demoObj.instanceVar);
        System.out.println("Local Variable (localVar): " + localVar);
        demoObj.modifyVars(1);
    }
}
