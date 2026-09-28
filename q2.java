import java.util.LinkedList;

 class q2 {

    public static void main(String[] args) {

        LinkedList<String> artifacts = new LinkedList<>();

        // Add three artifacts
        artifacts.add("Golden Statue");
        artifacts.add("Ancient Coin");
        artifacts.add("Old Painting");

        // Add new artifact at beginning
        artifacts.addFirst("Diamond Necklace");

        // Remove one artifact
        artifacts.remove("Ancient Coin");

        // Display updated list
        System.out.println("Updated List:");
        for (String a : artifacts) {
            System.out.println(a);
        }

        // Display first and last
        System.out.println("First Artifact: " + artifacts.getFirst());
        System.out.println("Last Artifact: " + artifacts.getLast());
    }
}