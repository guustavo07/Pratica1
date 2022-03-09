package EmpregoFaculdade;

public class EmpregoDaFaculdade {
	private String nome;
	private double salario;
	private int horasAula;
	
	
	double getGastos(){
		return this.salario + (this.horasAula*40);
	}
	String getInfo(){
	return "nome: " + this.nome + " com salário " + this.salario + (horasAula*40);
	}
}
