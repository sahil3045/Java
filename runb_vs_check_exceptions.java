

public class runb_vs_check_exceptions{
    public static void main(String[] args) {
        /*int value = 7;
        value = value/0;
        System.out.println(value);*/

        //String text = null;
        //System.out.println(text.length());

        String[] texts = {"Sam", "Porter", "Bridges"};
        try{
            System.out.println(texts[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }


}