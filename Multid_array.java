public class Multid_array {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3, 4},
            {19,12},
            {20, 84, 97, 36, 48}

        };
        // now to print a specific value first write the row and then the coloumn;
        // for eg: nums[row][column]
        System.out.println(nums [2][3]); 

        String[][] texts = new String[2][3]; 
        texts[0][1] = "Hello There!";
        System.out.println(texts[0][1]);

        for(int row = 0; row<nums.length; row++){
            for(int col = 0; col < nums[row].length; col++){
                System.err.println(nums[row][col] + "\t");

            }
            System.out.println( );
        }

    }
    
}
