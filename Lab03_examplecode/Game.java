import java.util.ArrayList;

class Game{

    // Depth-first search 
    public static boolean win(int current, int[] game, int leap){
	// check if the current location is valid
        if(current < 0 || game[current] == 1)
            return false;
        // check if we reach the winning condition
        if(current == game.length-1 || current + leap >= game.length)
            return true;
        // mark the visited location
        game[current] = 1;
	// recursively call the method
        return win(current-1, game, leap) || win(current+1, game, leap) || win(current + leap, game, leap);
    }

    public static void main(String[] args){

	//int[] game = {0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1};
	int[] game = {0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1};
	
	String result = win2(0, game, 3) ? "Yes" : "No";
	System.out.println(result);

    }

    // Breadth-first search
    public static boolean win2(int current, int[] game, int leap){
	// open list
	ArrayList<Integer> open = new ArrayList<>();
	open.add(0);
	while(open.size() > 0){
	    int m = open.remove(0);
	    game[m] = 1;
	    if(m == game.length-1 || m + leap >= game.length)
		return true;
	    if(m - 1 > 0 && game[m-1] == 0 && !open.contains(m-1))
		open.add(m-1);
	    if(game[m+1] == 0 && !open.contains(m+1))
		open.add(m+1);
	    if(game[m+leap] == 0 && !open.contains(m+leap))
		open.add(m+leap);
	}
	return false;

    }
}
