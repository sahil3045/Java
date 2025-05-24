public class arrays {
    public static void main(String[] args) {
        int value = 9;

        int[] values;
        values = new int[4];

        System.out.println(values[0]); 
        values[0] = 11;
        values[1] = 12;
        values[2] = 13;
        values[3] = 14;
         
        System.out.println(values[0]);

        for(int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }

        int[] numbers = {2, 4, 8};
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
