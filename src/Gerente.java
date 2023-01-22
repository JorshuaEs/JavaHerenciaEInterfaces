//					extiende de 
public class Gerente extends Funcionario{
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCursosOnLine";
	}
	
	//Sobre escritura de metodos, se utiliza la misma firma del metodo pero se repite en la clase hija segun su propia logica
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + super.getBonificacion(); //super: de la clase superior llama el metodo mencionado
	}
}
