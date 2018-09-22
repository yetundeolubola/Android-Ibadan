import java.util.logging.Logger;

public class Lesson9 {
	public void main(String args[]) {
	
	
}
	final Logger l =Logger.getLogger(Lesson9.class.getName());		
	

	public void question9()	{
		for (int num = 3,iterationNum = 1; iterationNum <= 6; num++, iterationNum++) {
			l.info("Iteration" +iterationNum + ", Loop Variable:" + num);
		}
	}
}
	
