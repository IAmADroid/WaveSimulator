package physicssim.waves.core;

/**
 * All fundamental forces will be given a "Plane" of existence.
 * 
 * To do list of features:
 * Create ways for planes to interact with one another.
 * Include relativity? (this will make time act funny.)
 */
public interface Plane {
	/**
	 * This will give the strength of the field at a given coordinate.
	 */
	public double strengthAt(double... coordinates);
	/**
	 * This will give the change in strength at a given coordinate.
	 */
	public double changeAt(double... coordinates);
}
