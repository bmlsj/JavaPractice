package prjTest.Exception;

public class BizException extends RuntimeException{

    // unChecked Exception

    public BizException(String msg){
        super(msg);
    }

    public BizException(Exception ex){
        super(ex);
    }
}
