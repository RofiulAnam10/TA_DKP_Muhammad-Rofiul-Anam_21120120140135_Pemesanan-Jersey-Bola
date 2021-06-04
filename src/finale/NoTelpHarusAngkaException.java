package finale;

public class NoTelpHarusAngkaException extends Exception{

    @Override
    public String getMessage() {
        return "Nomor telepon harus angka";
    }
}
