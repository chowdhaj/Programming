public class OverLoadTester
{



    public static void main (String[] ol)
    {



	int intNum1 = 5, intNum2 = 10;
	// int1Num is = to 5 and intNum2 is = to 10, both integer

	double dNum1 = 5.0, dNum2 = 10.0;
	// dNum1 is = to 5.0, and intNum is = to 10.0, both double



	OverLoad one = new OverLoad (intNum1, intNum2);

	//(int,int) Constructor



	OverLoad two = new OverLoad (dNum1, dNum2);

	//(double, double) Constructor



	OverLoad three = new OverLoad (intNum1, dNum1);

	// What about here?



	OverLoad four = new OverLoad (dNum1, intNum1);

	//or here?

    }
} //end of class


//The compiler knows which constructor to call by matching up the 
//parameters with the correct method. However in certain cases the 
//compiler will need to assume your intention and that might not be 
//correct.  These example illustrate that point. What if 
//the user of the class accidentally entered a double when an int was 
//indented (or visa versa)? The program will still execute but the wrong 
//constructor may get called. This class is designed poorly for that reason. 
//It presents itself with the potential for ambiguity. So the point is to be 
//cautious about creating such scenarios.


//Created by Daniel Forhan
//http://geekswithblogs.net/dforhan/archive/2005/11/03/59009.aspx

