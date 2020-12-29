package animal;

public final class Caopolicial extends Cao {

  public Caopolicial(String farejar, String formaDeAndar) {
    super(farejar, formaDeAndar);
  }

  public void latir() {
    System.out.println("O Cao policial está latindo");

  }

  public void andar() {
    System.out.println("O Cao policial está andando rapidamente");
  }

  public void correr() {
    System.out.println("O Cao policial está correndo rapidamente");
    System.out.format("Raca:%s,Porte:%s\n", getRaca(), getPorte());
  }
    
  public void correr(String Alemao) {
    System.out.println("O Cao policial está correndo rapidamente");
    System.out.format("Raca:%s,Porte:%s\n", getRaca(), getPorte());
  }
  
}