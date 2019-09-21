package sticks;

public interface Player
{
   public int move(int numSticks);
   public void startGame();
   public void endGame(boolean win);
}