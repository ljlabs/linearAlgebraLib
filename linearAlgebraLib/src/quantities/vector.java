package quantities;

public class vector {
	// the section 1
	private int dimension;
	private double vector[];
	public vector(double vec[]){
		setVector(vec);
	}
	public void setVector(double vec[]){
		this.vector = vec;
		this.dimension = vec.length;
	}
	public double component(int i){
		return this.vector[i];
	}
	public int getDimension(){
		return this.dimension;
	}
	public double[] getVector(){
		return this.vector;
	}

}
