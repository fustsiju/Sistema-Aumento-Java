package dados;


public class Funcionario {
	private String nome;
	private int id;
	private double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentoSalario(double salario, double porcentagem) {
		salario += salario * porcentagem /100;	
		return salario;
	}
	
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}
	
}
