package notasaluno;

class Aluno {
		private String nome, periodo, curso;
		private int matricula;
		private double notaAv1, notaAv2, notaAE;
		
		
		public Aluno(String nome, String periodo, String curso, int matricula, double notaAv1, double notaAv2, double notaAE){
			this.nome = nome;
			this.periodo = periodo;
			this.curso = curso;
			this.matricula = matricula;
			this.notaAv1 = notaAv1;
			this.notaAv2 = notaAv2;
			this.notaAE = notaAE;
		}

		public String avaliarAluno(double notaAv1, double notaAv2) {
			if(notaAv1 + notaAv2 > 59) {				
				return "O Aluno foi Aprovado";				
			}else 
				return"O Aluno foi Reprovado, é necessário fazer a Avaliação Especial";
		}
		public String avaliarRecupercao(double notaAv1, double notaAv2, double notaAE) {
			
			if((notaAv1 + notaAv2 + notaAE) / 3 >= 60 ) {
				
				return "O Aluno foi Aprovado";
				
			}else return "O Aluno foi Reprovado";
			
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public String getPeriodo() {
			return periodo;
		}
		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}
		public long getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		public double getNotaAv1() {
			return notaAv1;
		}
		public void setNotaAv1(double notaAv1) {
			this.notaAv1 = notaAv1;
		}
		public double getNotaAv2() {
			return notaAv2;
		}
		public void setNotaAv2(double notaAv2) {
			this.notaAv2 = notaAv2;
		}
		public double getNotaAE() {
			return notaAE;
		}
		public void setNotaAE(double notaAE) {
			this.notaAE = notaAE;
		}	
}