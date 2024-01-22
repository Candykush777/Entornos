package Presencial;

public class CuentaBancaria {

    private int saldo;
    private String password;
    public CuentaBancaria(int saldoInicial, String password) {

        this.saldo = saldoInicial;
        this.password = password;
    }
    public int ingresar(int cantidad, String pass) {

        if (password.equals(pass)) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                return saldo;
            } else
                return -1;
        }
        return -2;
    }
    public boolean passwordCorrecta(String pass) {

        return password.equals(pass);
    }
    public static void main(String[] args) {
    }
}

