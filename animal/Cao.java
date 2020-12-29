package animal;

public abstract class Cao {
  private String raca;
  private String porte;

  public Cao(String raca, String porte) {
    this.raca = raca;
    this.porte = porte;
  }

  public abstract void latir();
  public abstract void andar();
  public abstract void correr();

  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }

  public String getPorte() {
    return porte;
  }

    
  public void setPorte(String porte) {
    this.porte = porte;
  }

}