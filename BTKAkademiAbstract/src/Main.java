public class Main {

    public static void main(String[] args) {
	WomanCalculator womanCalculator=new WomanCalculator();
    womanCalculator.calculator();
    womanCalculator.gameOver();

    GameCalculator gameCalculator=new WomanCalculator();
    gameCalculator.calculator();
    gameCalculator.gameOver();
    }
}
