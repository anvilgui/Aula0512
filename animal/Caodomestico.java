package animal;

public final class Caodomestico extends Cao {
    
  public Caodomestico(String emitirSom, String formaDeAndar) {
    super(emitirSom, formaDeAndar);
  }

  public void latir() {
    System.out.println("O Cao doméstico está latindo");
  }

  public void andar() {
    System.out.println("O Cao doméstico está andando lentamente");
  }

  public void correr() {
    System.out.println("O Cao doméstico está correndo");
    System.out.format("Raca:%s,Porte:%s\n", getRaca(), getPorte());
  }
    
}