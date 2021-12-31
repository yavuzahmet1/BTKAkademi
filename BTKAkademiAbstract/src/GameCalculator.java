public abstract class GameCalculator {

    public abstract void calculator();//kim implemente ediyorsa calculatoru override etmek zorundadır.
    public final void gameOver(){
        System.out.println("Oyun bitti!!!");//bütün sınıflar bu clası böyle kullanmalı override edilemez çünkü final yazıldı.
    }
}
