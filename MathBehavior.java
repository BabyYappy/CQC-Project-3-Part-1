import java.security.cert.X509Certificate;

public abstract class MathBehavior {
  public MathBehavior(Buffer input, Buffer output) {
    doTheMath(input, output);
  }
  public synchronized void doTheMath(Buffer input, Buffer output)
  {
    synchronized (input) {
      int x = input.read();
      int y = delegateMath(x);
      output.write(y);
    }
  }
  protected abstract int delegateMath(int x);
}
