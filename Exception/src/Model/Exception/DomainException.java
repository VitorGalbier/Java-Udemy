package Model.Exception;
                                    //RuntimeException nao obriga a tratar, só Exception precisa tratar
public class DomainException extends Exception{
    public DomainException (String message){
        super(message);
    }
}
