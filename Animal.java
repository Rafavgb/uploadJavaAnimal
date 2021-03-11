
public class Animal {

	public String nome;
	public String cor;
	public double peso;
	
	public Animal ( String nome, String cor, double peso){
		
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}
		
		public void status (){
			System.out.println("nome"+this.nome);
			System.out.println("cor"+ this.cor);
			System.out.println("peso"+this.peso);
			
		
		
	}
}
