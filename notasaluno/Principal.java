package notasaluno;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Gustavo", "Terceiro", "ADS",12110603,60,30,0);
		
		System.out.println(a1.getNome());
		System.out.println(a1.getPeriodo());
		System.out.println(a1.getCurso());
		System.out.println(a1.getMatricula());
		System.out.println(a1.getNotaAv1());
		System.out.println(a1.getNotaAv2());
		System.out.println(a1.getNotaAE());
	}

}
