public class Incrementor extends MathBehavior {
  public Incrementor(Buffer input, Buffer output) {
    super(input, output);
  }
  @Override
  protected int delegateMath(int x) {
    return x += 1;
  }
}
