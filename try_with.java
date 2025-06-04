class Temp implements AutoCloseable{
    @Override
    public void close() throws Exception{
        System.out.println("Closing!");
        throw new Exception("OH NO!")
    }

}
public class try_with {
    public static void main(String[] args) {
        try(Temp temp1 = new Temp()){

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
