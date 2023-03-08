public class Client {
    public Client(){

    }

    public void doUnchecked(String value){
        try {
            int result = canThrowUncheckedException(value);
            System.out.println("result = " +result);
        } catch (NumberFormatException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private int canThrowUncheckedException(String value){
        return Integer.parseInt(value);
    }

    public void doChecked(){
        try {
            canThrowUncheckedException();
            System.out.println("Ok");
        } catch (Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }

    private int canThrowUncheckedException() throws Exception{
        throw new Exception("Failure");
    }
}