// teste com exception checked
public class MinhaException extends RuntimeException{

        public MinhaException(){
        }
        public MinhaException(String msg){
            super(msg);
        }
}
