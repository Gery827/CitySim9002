

public class Visitor {
	public int type;
	public int n;
	public boolean end=false;
	public boolean start=false;
	
	public int setType(Generator gen){
		type=gen.Generator(4);
		return type;
	}
	public void Visit(int n){
		this.n=n+1;
		Generator gen=new Generator();
		setType(gen);
		Type t=new Type();
		getType(t);
		visiting();
	}
	public String getType(Type t){
		System.out.println("Visitor "+ n +" is a "+ t.Type(type) +".");
		return "Visitor "+ n +" is a "+ t.Type(type) +".";
	}
	private void visiting(){
		Location locs=new Location();
		Preference pre=new Preference();
		Generator gen=new Generator();
		while(!end){
			visitinfo(locs,pre,gen);
			}
	}
	
	public String visitinfo(Location locs, Preference pre, Generator gen){
		int flag=gen.Generator(5);
		if(flag==4){
			if(!start) return null;
			this.end=true;
			System.out.println("Visitor "+ n +" has left the city.");
			return "Visitor "+ n +" has left the city.";
		}
		System.out.println("Visitor "+ n +" is going to "+ locs.Location(flag)+"!");
		
		System.out.print("Visitor "+ n +" did ");
		if(!pre.Preference(type, flag)) System.out.print("not ");
		System.out.println("like "+ locs.Location(flag)+".");
		
		if(!start) start=true;
		return "Visitor "+ n +" is going to "+ locs.Location(flag)+"!";
	}
}

