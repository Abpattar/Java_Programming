class Outer {
    int outerData = 10;

    class Inner {
        int innerData = 20;
        
        void display() {
            System.out.println("Inner class displaying data:");
            System.out.println("Outer class data: " + outerData);
            System.out.println("Inner class data: " + innerData);
        }
    }
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}
