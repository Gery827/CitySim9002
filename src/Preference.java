

public class Preference {
	//True is like, False is dislike
	boolean[][] preMatrix={{false,true,true,true},{true,true,true,true},{false,true,false,true},{false,false,false,false}};
	public boolean Preference(int n, int m){
		return preMatrix[n][m];
	}
}
