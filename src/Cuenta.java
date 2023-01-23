//entidad Cuenta
 public abstract class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta");
		
		Cuenta.total ++;
	}
	
	//No retorna valor
	public abstract void depositar(double saldo);
	
	//Retorna valor
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
		
	}
	
	public void setAgencia(int agencia){
		if (agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("No se permiten valores negativos");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
}
	
