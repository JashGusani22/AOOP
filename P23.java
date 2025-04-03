class MyException extends Exception{
    String msg;
    MyException(String s){
        msg=s;
    }
    public String toString(){
        return msg;
    }
}
public class P23{
    public static void main(String[] args) {
        try {
            throw new MyException("Divided to Zero");
        } catch (MyException e) {
            System.out.println("Caughte:- ", e.getMessage());
        }
    }
}