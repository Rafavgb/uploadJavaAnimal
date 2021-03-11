
public class Cachorro extends Animal {

	public String raça;
	public Cachorro (String nome, String cor, double peso, String raça){
	
		super (nome, cor,peso);
		this.raça = raça;
		super.status();
		System.out.println("raça" + this.raça);
		
	
}
}