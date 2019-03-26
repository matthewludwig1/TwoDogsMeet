
package twodogsmeet;

public class Dog {
    //variables for characteristics

    private String dogName, dogBreed, gender, colour;
    private int aggression, hunger, age, hairlength ;
    //aggression = 5; this is bad :(

    //constructors
    public Dog() {
        dogName = "Rufus Doe";
        dogBreed = "Unknown Breed";
        aggression = 0;
        hunger = 0;
    }

    public Dog(String dgName, String dgBreed, int agg, int hung) {
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = agg;
        hunger = hung;
    }

    //Alternate constructor
    public Dog(String dgName, String dgBreed) {
        //This constructor only uses the name and breed
        //Set the aggression and hunger to random #s
        dogName = dgName;
        dogBreed = dgBreed;
        aggression = (int) (Math.random() * 10) + 1;
        hunger = (int) (Math.random() * 10) + 1;
    }
    /**
     * This method sets the dog's gender
     * @param dgGnd 
     */
    public void setDogGender(String dgGnd) {
        gender = dgGnd;
    }
    /**
     * This returns the string value of the 
     * @return  gender
     */
    public String getDogGender() {
        return gender;
    }
    /**
     * 
     * @param dgAge 
     */
    public void setDogAge(int dgAge) {
        age = dgAge;
    }
    /**
     * 
     * @return age
     */
    public int getDogAge() {
        return age;
    }
    /**
     * 
     * @param hrlength 
     */
    public void setHairlength(int hrlength) {
        hairlength = hrlength;
    }
    /**
     * 
     * @return hairlength
     */
    public int getHairlength() {
        return hairlength;
    }
    /**
     * This method sets the dog's name
     * @param dgNm 
     */
    public void setDogName(String dgNm) { 
        dogName = dgNm;
    }
    /**
     * This method gets the dog's name
     * @return dogName
     */
    public String getDogName () {
        return dogName;
    }
       /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an aggression value
     * post: sets the aggression value
     */
    public int getAggression(){
        return aggression;
    }
    /**
     * This method allows the user to set the aggression of the dog
     * pre: needs an aggression value
     * post: sets the aggression value
     */
    public void setAggression(int agg){
        aggression = agg;
    }
    /**
     * This method allows for a dog to friendly bark
     * pre: none
     * post: the dog object barks
     */

    public void barkFriendly() {
        System.out.println("Arf! Arf!");
    }

    public void barkAngry() {
        System.out.println("GRR! RRRFFF!");
    }
    
    public static void caringForYourDog(){
        System.out.println("This is how you care for your dog");
    }

    //method to display all info of the Dog
    public String toString() {
        String output = "Name: " + dogName + "\n";
        output += "Breed: " + dogBreed + "\n";
        output += "Aggression: " + aggression + "\n";
        output += "Hunger: " + hunger;
        //output string is complete, return it
        return output;
    }
}