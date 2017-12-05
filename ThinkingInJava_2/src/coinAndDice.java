//: interfaces/factories
// TossCoin and ThrowDice
import java.util.Random;

interface Game{
	void toss();
}

interface GameFactory{
	Game getGame();
}

class Coinc implements Game{
	public void toss(){
		Random random = new Random();
		System.out.println(random.nextInt(6) + 1);
	}
}

class CoinFactory implements GameFactory{
	public Game getGame(){
		return new Coinc();
	}
}

class Dice implements Game{
	public void toss(){
		Random random = new Random();
		System.out.println(random.nextBoolean());
	}
}

class DiceFactory implements GameFactory{
	public Game getGame(){
		return new Dice();
	}
}

public class coinAndDice {

	/**
	 * @param args
	 */
	public static void tossGame(GameFactory factory){
		Game game = factory.getGame();
		game.toss();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tossGame(new CoinFactory());
		tossGame(new DiceFactory());

	}

}
