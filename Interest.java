package Training;

public class Interest {
	public static void main(String args[]){
		double principle = 5000,interestRate=5,numberOfYears=10,rateOfInterest=interestRate/100,simpleInterest=0,compoundInterest=0;
		simpleInterest=principle*rateOfInterest*numberOfYears/100;
		System.out.println("simple interest:"+simpleInterest);
		System.out.println("simple interest total amount:"+(simpleInterest+principle));
		compoundInterest = (principle*((1+rateOfInterest)*(1+rateOfInterest)))-principle;
		System.out.println("compound interest:"+compoundInterest);
		System.out.println("compound interest total amount:"+(compoundInterest+principle));
	}

}
