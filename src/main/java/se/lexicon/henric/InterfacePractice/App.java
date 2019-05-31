package se.lexicon.henric.InterfacePractice;



import java.math.BigInteger;
import java.util.ArrayList;

import Model.Operators;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Pretending that user has chosen an operator
    	Operators input = Operators.DIVISION;
    	ArrayList<BigInteger> values = new ArrayList<BigInteger>(); 
    	values.add(BigInteger.valueOf(15));
    	values.add(BigInteger.valueOf(3));
    	values.add(BigInteger.valueOf(1));
    	System.out.println(input.calculate(values));
       
    }
}
