package adapter;

public class BirdAdapter implements Bird {
  PlasticToy plasticToy;

  public BirdAdapter(PlasticToy plasticToy) {
    this.plasticToy = plasticToy;
  }

  public void makeSound() {
    this.plasticToy.makeNoise();
  }
}
