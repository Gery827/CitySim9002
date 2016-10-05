

public class CitySim9002 {
	
	public static void main(String[] args) {
		if(args.length>1||args.length<=0){
			System.out.println("Please enter one integer argument, seed");
			System.exit(0);
		}
		
		// call isInteger to determine whether the input is integer
		else if(!isInteger(args[0])){
			System.out.println("Please enter one integer argument, seed");
			System.exit(0);
		}
		else{
		System.out.println("Welcome to CitySim!  Your seed is "+ args[0]+".");
		}
		//Begin to generate visitors
		Visitor[] visitors=new Visitor[4];
		
		for(int i=0;i<4;i++){
			visitors[i]=new Visitor();
			visitors[i].Visit(i);
			
			if(i<5)System.out.println("***");
		}
		
	}
	//Determine if a String is an Integer 
	//http://stackoverflow.com/questions/5439529/determine-if-a-string-is-an-integer-in-java
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
	
	
}
