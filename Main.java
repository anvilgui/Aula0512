import animal.Caodomestico;
import animal.Caopolicial;

public class Main {
  public static void main(String[] args) {
    Caodomestico caodomestico1 = new Caodomestico("Poodle", "Pequeno");
    caodomestico1.latir();
    caodomestico1.correr();
    caodomestico1.andar();
    System.out.println("\n");

    Caopolicial caopolicial1 = new Caopolicial("Labrador", "Médio");
    caopolicial1.latir();
    caopolicial1.correr();
    caopolicial1.andar();
    System.out.println("\n");
    
    Caopolicial caopolicial2 = new Caopolicial("Alemão", "Grande");
    caopolicial2.latir();
    caopolicial2.correr("Alemão");//puxando o método que foi sobrecarregado
    caopolicial2.andar();

  }
  
}