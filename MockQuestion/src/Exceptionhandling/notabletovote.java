package Exceptionhandling;

public class notabletovote extends Exception{
	
	@Override
	public String getMessage() {
return "not able to vote till get 18 years";
}
}