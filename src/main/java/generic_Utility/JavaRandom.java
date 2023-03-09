package generic_Utility;

import java.util.Random;

public class JavaRandom {

	public int getRandomNum() {
		Random ran=new Random();
		int ranInt = ran.nextInt(1000);
		return ranInt;

	}
}
