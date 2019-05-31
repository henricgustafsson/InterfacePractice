package Model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BinaryOperator;


public enum Operators implements Calculate {
	ADDITION{

		@Override
		public BigInteger calculate(ArrayList<BigInteger> values) {
			
			return values.stream().reduce(BigInteger.ZERO,new BinaryOperator<BigInteger>() {
				public BigInteger apply(BigInteger a, BigInteger b) {
					return a.add(b);
				}
			});
		
			
		}
			
		
	},
    SUBTRACTION {
		@Override
		public BigInteger calculate(ArrayList<BigInteger> values) {
			//must be a better and shorter way but can't wrap my head around it.
			
			//sort in ascending order and reverse i.e descending order
			Collections.sort(values);
			BigInteger lastValue = values.get(values.size()-1);
			BigInteger sum = lastValue;
			
			for (int i = values.size()-1; i > 0; --i) {
				
				sum =sum.subtract(values.get(i-1));
				
			}
			
			return sum;
		}
	},
    MULTIPLICATION {
		@Override
		public BigInteger calculate(ArrayList<BigInteger> values) {
			// TODO Auto-generated method stub
			return values.stream().reduce(BigInteger.ONE, new BinaryOperator<BigInteger>() {
				public BigInteger apply(BigInteger a, BigInteger b) {
					return a.multiply(b);
				}
			});
		}
	},
    DIVISION {
		@Override
		public BigInteger calculate(ArrayList<BigInteger> values) {
			
			//sort in ascending order and reverse i.e descending order
			Collections.sort(values);
			BigInteger lastValue = values.get(values.size()-1);
			BigInteger sum = lastValue;
			
			for (int i = values.size()-1; i > 0; --i) {
				
				sum =sum.divide(values.get(i-1));
				
			}
			
			return sum;
		}
	};

    

   

	public abstract BigInteger calculate(ArrayList<BigInteger> values);
    
	
	
	
	
	
}
