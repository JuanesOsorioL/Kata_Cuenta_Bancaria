import java.time.LocalDate;

public class Movimiento {
    private LocalDate fecha;

    private double balance;
    private double deposito;
    private double retiro;
    private double transaccion;

    public Movimiento(LocalDate fecha, double balance, String operacion, double monto) {
        this.balance = balance;
        this.fecha = fecha;
        switch (operacion){
            case "deposito":this.deposito = monto;break;
            case "retiro":this.retiro = monto;break;
            default:this.transaccion = monto;break;
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposito() {
        return deposito;
    }

    public double getRetiro() {
        return retiro;
    }
}
