import java.io.IOException;
import java.util.*;


public class stringTest {
	public static void main(String[] args){
		String line = "1::Toy Story (1995)::Animation|Children's|Comedy";
		StringTokenizer token = new StringTokenizer(line,"::");
		String movie = token.nextToken();
		movie = token.nextToken();;
		if(movie.contains(args[0])){
			System.out.println("Movie in database");
			//String genres = token.nextToken();
			// System.out.println(genres);
			String[] genres = token.nextToken().split("\\|");
			int cnt = 0;
			System.out.println("Genres:");
			while(cnt<genres.length){
				System.out.print(" " +genres[cnt]);
				cnt++;
			}
		}
		else{
			System.out.println("Movie aint");
		}
		
	}
}
