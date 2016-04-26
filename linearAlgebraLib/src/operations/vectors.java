package operations;

import java.util.Vector;

import quantities.vector;

public class vectors {
	public vector addition(vector a, vector b) throws Exception{
		if(a.getDimension() != b.getDimension()){
			throw new Exception("Vectors not the same dimension vector addition not defined");
		}
		double newVec[] = new double[a.getDimension()];
		for(int i = 0; i < a.getDimension(); i++){
			newVec[i] = a.component(i) + b.component(i);
		}
		return new vector(newVec);
		
	}
	public vector scalerMultiplicaiton(vector a, double b) throws Exception{
		double newVec[] = new double[a.getDimension()];
		for(int i = 0; i < a.getDimension(); i++){
			newVec[i] = a.component(i) *b;
		}
		return new vector(newVec);
		
	}	

}
