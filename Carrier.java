/*
 * Rotimi Olayinka
 * Section 1, TT 12:30 pm
 * Lab 11, Program 1
 */

/*
 *This program creates two Carrier objects using the Carrier class.
 * After creation, it prints all field values for each carrier to verify
 * that constructors, setters, and getters work as intended.
 */

public class Carrier {

    // Private Fields
    // Default values are provided but may be overwritten by constructors.
    private String name = "none";        // Name of the carrier
    private int length = 1092;           // Length in feet
    private int tons = 100020;           // Weight (displacement) in tons
    private int personnel = 3532;        // Number of crew on board
    private int aircraft = 90;           // Number of aircraft carried

    // Constructors 

    // Constructor that sets only the name
    public Carrier(String newname) {
        name = newname;
    }

    // Constructor that sets name and length
    public Carrier(String newname, int newlength) {
        name = newname;
        length = newlength;
    }

    // Constructor that sets name, length, personnel, and aircraft
    public Carrier(String newname, int newlength, int newpersonnel, int newair) {
        name = newname;
        length = newlength;
        personnel = newpersonnel;
        aircraft = newair;
    }

    // Mutator Method

    // Allows updating the ship's weight
    public void setWeight(int newweight) {
        tons = newweight;
    }

    // Accessor Methods 
    // Provide controlled access to private fields

    public String getName() { return name; }
    public int getWeight() { return tons; }
    public int getLength() { return length; }
    public int getPersonnel() { return personnel; }
    public int getAircraft() { return aircraft; }
 }