package capThree;

//Classe Account que cont�m uma vari�vel de inst�ncia name
// e m�todos para configurar e obter seu valor.
public class Account {
	
	private String name; // vari�vel de inst�ncia
	
	// m�todo para definir o nome no objeto
	public void setName(String name) {
		
		this.name = name; // armazena o nome
		
	}
	
	// m�todo para recuperar o nome do objeto
	public String getName() {
		
		return name; // retorna o valor do nome para o chamador
		
	}
	
}
