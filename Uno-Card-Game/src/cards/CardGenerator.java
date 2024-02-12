package cards;
import java.util.Random;

public interface CardGenerator {
    Random random = new Random();
    String[] colors = {"Red", "Blue", "Green", "Yellow"};
    public int numGen();
    public String colorGen();
}



