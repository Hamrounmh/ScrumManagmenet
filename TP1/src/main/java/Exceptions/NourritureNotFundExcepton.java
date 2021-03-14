package Exceptions;

public class NourritureNotFundExcepton extends Throwable {
    @Override
    public String getMessage() {
        return"pas_de_nourriture";
    }
}
