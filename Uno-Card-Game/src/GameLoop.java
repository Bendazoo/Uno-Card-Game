public class GameLoop extends Main{
    private boolean exit;
    GameLoop(int option){

        do{
            exit = true;

            if(option == 1){
                System.out.println("=======================");
                System.out.println("\t   Rules: ");
                System.out.println("1. Game Structure: Start by shuffling the deck of 108 cards \nand deal 7 cards to each player. Place the remaining cards face down \nto create the draw pile. From the draw pile, pick the top card to start the discard pile.");
                System.out.println();
                System.out.println("2. Starting the game: As soon as you are well aware of how to \nplay UNO, start by asking the player to the left of the dealer to go first. \nAs per the basic rules of UNO, a player must match the top card of the discard \npile by color, number, or symbol (action card). If they cannot make a match, they must draw \none card from the draw pile. If the drawn card is playable, the player can play it immediately; \notherwise, the turn passes to the next player.");
                System.out.println();
                System.out.println("3. Action cards and their outcome: As the name suggests, action \ncards are truly one of the best cards that can surely make the game more \nthrilling for all players at the table. " +
                        "\n\t- Draw Two: The next player must draw two cards and lose his/her own turn.\n\t- Skip: The next player's turn is skipped.\n\t- Reverse: In Uno reverse card, the order of play reverses direction (clockwise to counterclockwise, or vice versa).\n\t- Wild Card: The player who plays this card can choose any color to continue playing.\n\t- Wild Draw Four: The player who plays Wild Draw Four card picks a color, and the next player must draw four cards and relinquish their turn. ");
                System.out.println();
                System.out.println("4. Announcing \"UNO\": When a player has only one card remaining, \nthey must shout \"UNO!\" to inform the other \nplayers. If another player catches them not");
                System.out.println();
                System.out.println("5. saying \"UNO\" before the next player begins their turn, the player with one card must draw two penalty cards. \n" +
                        "Winning: The first player to get rid of all their cards wins the round. \n" +
                        "Though there are no scoring points or rules as such for the same, they can be added to elevate the thrilling experience.  \n" +
                        "The above-mentioned UNO card rules describe the classic version of UNO, but many variations and special editions are \navailable that introduce new cards or gameplay elements.");
                System.out.println();

            } else if (option == 2){


            } else {
                System.out.println("Thank you for playing!");
                exitLoop = false;
            }

        }while(exit == false);


    }




}
