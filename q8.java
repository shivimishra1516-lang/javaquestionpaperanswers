import java.util.LinkedList;

 class q8 {

    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> food = new LinkedList<>();

        // Add items at beginning
        food.addFirst("Pizza");
        food.addFirst("Burger");
        food.addFirst("Pasta");
        food.addFirst("Sandwich");

        // Display first item
        System.out.println("First Item: " + food.getFirst());

        // Remove item from end
        food.removeLast();

        // Display all items
        System.out.println("Food Items:");

        for (String item : food) {
            System.out.println(item);
        }
    }
}