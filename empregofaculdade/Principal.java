package empregofaculdade;

class Principal {

	public static void main(String[] args) {
		EmpregadoDaFaculdade e1 = new EmpregadoDaFaculdade("Rosa", 1200f, 25);
		
		System.out.println(e1.getGastos());
		System.out.println(e1.getInfo());
	}

}
