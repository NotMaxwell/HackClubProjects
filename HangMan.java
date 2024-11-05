public class HangMan {
    public static void main(String[] args) {
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

    }
    public static int numGen(){
        return (int) (Math.random() * 290);

    }
}
