//					extiende de 
public class Gerente extends Funcionario implements Autenticable{
	
	//Sobre escritura de metodos, se utiliza la misma firma del metodo pero se repite en la clase hija segun su propia logica
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + this.getSalario() * 0.05; //super: de la clase superior llama el metodo mencionado
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
