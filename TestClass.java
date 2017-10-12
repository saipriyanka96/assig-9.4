package myPack;
/*

 * Created a class TestClass it contains the 

 * main method 

 */

public class TestClass {

	public static void main(String[] args) {

		//Creating the object of FixedStack

        FixedStack fs = new FixedStack(3);

        fs.push(1);

        fs.push(2);

        fs.push(3);

        //ERROR

        fs.push(0);

        //Created the object of  VariableStack

        VariableStack vs = new VariableStack(3);

        vs.push(1);

        vs.push(2);

        vs.push(3);

        vs.push(0);

        vs.push(9);

        //no error

    }

}
