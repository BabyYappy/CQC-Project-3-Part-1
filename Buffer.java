/**
 * a data store between two threads
 * 
 * @author Merlin
 *
 */
public class Buffer
{
	private static final Object lock = new Object();

	private int x;

	/**
	 * write an int into this buffer
	 * 
	 * @param x
	 *            the int we should store
	 */

	public synchronized void write(int x)
	{
		synchronized (lock) {this.x = x;}
	}

	/**
	 * @return the next int in the buffer
	 */
	public int read()
	{
		return x;
	}
	
	public int testing() {
		return 0;
	}

}
