public class pl1 {
    public static void main(String[] args) {

        // Create first carrier: CVN68 (only name provided)
        Carrier CVN68 = new Carrier("Chester Nimitz");

        // Create second carrier: CVN81 with full custom settings
        Carrier CVN81 = new Carrier("Doris Miller", 1106, 4660, 85);

        // Update weight using setter
        CVN81.setWeight(100000);

        // Output CVN68 info 
        System.out.println("CVN68:");
        System.out.println("Name: " + CVN68.getName());
        System.out.println("Weight: " + CVN68.getWeight());
        System.out.println("Length: " + CVN68.getLength());
        System.out.println("Personnel: " + CVN68.getPersonnel());
        System.out.println("Aircraft: " + CVN68.getAircraft());
        System.out.println();

        // Output CVN81 info 
        System.out.println("CVN81:");
        System.out.println("Name: " + CVN81.getName());
        System.out.println("Weight: " + CVN81.getWeight());
        System.out.println("Length: " + CVN81.getLength());
        System.out.println("Personnel: " + CVN81.getPersonnel());
        System.out.println("Aircraft: " + CVN81.getAircraft());
    }
}