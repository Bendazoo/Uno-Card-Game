package cards;

public class RedCard implements CardGenerator{
    String cardColor;
    int cardNumber;
    @Override
    public int numGen(){
        int num = random.nextInt(10);
        cardNumber = num;
        return cardNumber;
    }
    @Override
    public String colorGen(){
        int num = random.nextInt(4);
        cardColor = colors[num];
        return cardColor;
    }

}
