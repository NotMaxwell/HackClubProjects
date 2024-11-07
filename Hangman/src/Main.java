import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner sc = new Scanner(System.in);
        //Create array of possible words
        String[] words = {"Apple", "Bridge", "Candle", "Mountain", "Garden", "Ocean", "Book", "Sky", "River", "Window",
                "Song", "Car", "Tree", "Boat", "Planet", "Cup", "Flower", "Desert", "Clock", "Mirror",
                "Castle", "Dragon", "Hat", "Blanket", "Camera", "Shoe", "Eagle", "Whale", "Sand", "Jelly",
                "Train", "Pencil", "Stone", "Ladder", "Lion", "Carpet", "Lamp", "Glass", "Fork", "Spoon",
                "Plate", "Forest", "Shield", "Mountain", "Circle", "Chain", "Bell", "Cloud", "Beach", "Shadow",
                "Fox", "Key", "Light", "Owl", "Frog", "Sword", "Leaf", "Basket", "Balloon", "Whale", "Shell",
                "River", "Rainbow", "Star", "Coin", "Ship", "Bottle", "Sword", "Lion", "Towel", "Fan",
                "Chair", "Island", "Dream", "Bridge", "Fence", "Mask", "Moon", "Sun", "Fire", "Wind",
                "Rock", "Ice", "Smoke", "Dust", "Spider", "Wolf", "Tiger", "House", "Chair", "Window",
                "Desk", "Table", "Phone", "Laptop", "Cable", "Plug", "Screen", "Pen", "Notebook", "Keyboard",
                "Backpack", "Bottle", "Coffee", "Headphones", "Clock", "Monitor", "Charger", "Map", "Compass", "Bag",
                "Desk", "Floor", "Roof", "Wall", "Pillow", "Blanket", "Brush", "Comb", "Scissors", "Knife",
                "Fork", "Spoon", "Plate", "Glass", "Cup", "Bowl", "Dish", "Pan", "Pot", "FryingPan",
                "Stove", "Oven", "Microwave", "Fridge", "Freezer", "Light", "Switch", "Door", "Window", "Curtain",
                "Fence", "Garden", "Plant", "Flower", "Tree", "Bush", "Grass", "Path", "Pond", "Lake",
                "River", "Mountain", "Hill", "Valley", "Rock", "Sand", "Dirt", "Mud", "Clay", "Gravel",
                "Pebble", "Stone", "Boulder", "Stream", "Waterfall", "Pool", "Swamp", "Marsh", "Forest", "Jungle",
                "Desert", "Oasis", "Ocean", "Sea", "Wave", "Island", "Beach", "Shore", "Coast", "Cliff",
                "Cave", "Ridge", "Peak", "Summit", "Plateau", "Mesa", "Field", "Plain", "Grassland", "Prairie",
                "Meadow", "Savanna", "Tundra", "Wetland", "Bog", "Moor", "Heath", "Woodland", "Park", "Garden",
                "Orchard", "Farm", "Field", "Pasture", "Ranch", "Barn", "Stable", "Shed", "Greenhouse", "Nursery",
                "Flower", "Tree", "Leaf", "Branch", "Root", "Bark", "Twig", "Berry", "Seed", "Fruit",
                "Vegetable", "Grain", "Grass", "Flower", "Petal", "Stem", "Thorn", "Needle", "Cone", "Pine",
                "Oak", "Maple", "Willow", "Birch", "Cedar", "Fir", "Spruce", "Palm", "Bamboo", "Moss",
                "Fungi", "Mushroom", "Herb", "Shrub", "Vine", "Weed", "Cactus", "Fern", "Lichen", "Algae",
                "Fungus", "Coral", "Jellyfish", "Crab", "Shrimp", "Lobster", "Octopus", "Fish", "Shark", "Whale",
                "Dolphin", "Seal", "Penguin", "Seagull", "Pelican", "Swan", "Duck", "Goose", "Owl", "Eagle",
                "Hawk", "Falcon", "Crow", "Raven", "Parrot", "Sparrow", "Pigeon", "Woodpecker", "Robin", "Bluebird",
                "Cardinal", "Finch", "Mockingbird", "Oriole", "Swallow", "Wren", "Warbler", "Thrush", "Starling"};

        //Create life Frames
        String[] scenes = {"""
                \n
                |-----------|
                |           |
                |
                |
                |
                |
                |
                ""","""
                \n
                |-----------|
                |           |
                |          ( )
                |
                |
                |
                |
                ""","""
                \n
                |-----------|
                |           |
                |          ( )
                |           |
                |
                |
                |
                ""","""
                \n
                |-----------|
                |           |
                |          ( )
                |          /|
                |
                |
                |
                ""","""
                \n
                |-----------|
                |           |
                |          ( )
                |          /|\\
                |
                |
                |
                ""","""
                \n
                |-----------|
                |           |
                |          ( )
                |          /|\\
                |          /
                |
                |
                ""","""
                \n
                |-----------|
                |           |
                |          ( )
                |          /|\\
                |          / \\
                |
                |
                """};
        ArrayList<Character> guessedLetters = new ArrayList<>();
        String word;
        int lives;
        String finalWord = "";
        //start game loop
        while(true) {
            boolean game = false;
            //start screen
            System.out.println("""
                    Do You Want To Play Hang Man
                    Yes: 1
                    No: 2""");
            int ans = sc.nextInt();
            //System.out.println(ans);
            if (ans != 1) {
                System.out.println("Come again\nQuiting");
                break;
            }
            else {
                game = true;
                System.out.println("Let the game begin!");
                //generate random number
                int num = numGen();
                word = words[num].toLowerCase();
                //Trouble shooting purposes
                //System.out.println(word);
                //Display lives screen
                lives = 0;
                System.out.println(scenes[lives]);
                System.out.print("Word: ");
                for(int i = 0; i < word.length(); i++){
                    System.out.print("_ ");
                }
            }
            while(game) {
                System.out.println("\nGuess a letter");
                //Create a ArrayList of guessed letters
                char guess = sc.next().charAt(0);
                boolean in = false;
                for (int i = 0; i < guessedLetters.size(); i++) {
                    if (guess == guessedLetters.get(i)) {
                        in = true;
                    }
                }
                if (in != true) {
                    guessedLetters.add(guess);
                }
                //Check if the letter is in the word
                boolean correct = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        correct = true;
                    }
                }
                if (correct) {
                    System.out.println("Correct");
                } else {
                    lives++;
                    System.out.println("Incorrect");
                }
                //check lose condition
                if (lives > 5) {
                    System.out.println(scenes[6]);
                    System.out.println("You Lose");
                    guessedLetters.clear();
                    break;
                }
                //Display lives screen
                System.out.println(scenes[lives]);
                //Display word
                System.out.print("Word: ");
                for (int i = 0; i < word.length(); i++) {
                    boolean found = false;
                    for (int j = 0; j < guessedLetters.size(); j++) {
                        if (word.charAt(i) == guessedLetters.get(j)) {
                            System.out.print(word.charAt(i) + " ");
                            finalWord += word.charAt(i);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.print("_ ");
                        finalWord += "_ ";
                    }
                }
                System.out.print("\n" + guessedLetters);
                in = false;
                for (int i = 0; i < finalWord.length() - 1; i++) {
                    if (finalWord.charAt(i) == '_') {
                        in = true;
                    }
                }
                if (!(in)) {
                    System.out.println("\nCorrect");
                    guessedLetters.clear();
                    break;
                }
                finalWord = "";
                in = false;
            }
        }

    }
    public static int numGen(){
        return (int) (Math.random() * 290);
    }

}

