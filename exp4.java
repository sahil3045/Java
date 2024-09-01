public class exp4 {
    public static void main(String[] args) {
    int[][][] jArray = new int[2][][];
    jArray[0] = new int[3][];
    jArray[0][0] = new int[4];
    jArray[0][1] = new int[3];
    jArray[0][2] = new int[2];
    jArray[1] = new int[2][];
    jArray[1][0] = new int[3];
    jArray[1][1] = new int[4];
    for (int i = 0; i < jArray.length; i++) {
    for (int j = 0; j < jArray[i].length; j++) {
    for (int k = 0; k < jArray[i][j].length; k++) {
    jArray[i][j][k] = i+k;
    }
    }
    }
    for (int i = 0; i < jArray.length; i++) {
    for (int j = 0; j < jArray[i].length; j++) {
    for (int k = 0; k < jArray[i][j].length; k++) {
    System.out.print(jArray[i][j][k] + " ");
    }
    System.out.println();
    }
    System.out.println();
    }
    }
    }
    