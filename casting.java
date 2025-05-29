public class casting {
    public static void main(String[] args) {
        int integervalue = 888;
        long longvalue = 233556;
        short shortvalue = 2;
        byte bytevalue = 20;
        float floatvalue = 233.5f;
        double doublevalue = 32.4;

        integervalue = (int)longvalue;
        System.out.println(integervalue);

        doublevalue = integervalue;
        System.out.println(doublevalue);

        System.out.println(Byte.MAX_VALUE);
        // as we can see the max value of byte is 127;
        // so any number bigger than that will wont work 
        bytevalue = (byte)128;
        System.out.println(bytevalue); 
    }
    
}
