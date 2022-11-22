public class Animal implements Cloneable {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }

    public void sayanything() {
        System.out.println("I am an animal.");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "This is the class Animal";
    }

    protected static void printClassName(Object obj) {
        System.out.println("The object's" + " class is " +
                obj.getClass());
    }

}