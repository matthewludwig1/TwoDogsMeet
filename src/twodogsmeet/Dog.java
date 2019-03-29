/*
    Matt Ludwig
    28 March 2019
    This is the class which holds the information of various dogs
*/

package twodogsmeet;

public class Dog {
    //variables for characteristics

    private String dogName, dogBreed, gender, colour;
    private int aggression, hunger, age, hairlength ;
    

    //constructors
    public Dog() {
        dogName = "Rufus";
        dogBreed = "Unknown Breed";
        aggression = 0;
        hunger = 0;
    }

    public Dog(String dgName, String dgBreed, String gndr, String clr, int agg, int hung, 
        int dAge, int hrlength) {
        dogName = dgName;
        gender = gndr;
        colour = clr;
        dogBreed = dgBreed;
        agg = (int) (Math.random()*9)+ 1;
        aggression = agg;
        hung = (int) (Math.random()* 9) + 1;
        hunger = hung;
        age = dAge;
        hairlength = hrlength;
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
     * This returns the dog's gender
     * @return  gender
     */
    public String getDogGender() {
        return gender;
    }
    
    /**
     * 
     * @param dAge 
     */
    public void setDogAge(int dAge) {
        dAge = (int)(Math.random()* 13) + 1;
        age = dAge;
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
     * 
     * @param dgColour 
     */
    public void setDogCoulour (String dgColour) {
        colour = dgColour;
    }
    
    /**
     * 
     * @return 
     */
    public String getDogColour() {
        return colour;
    }
    
    /**
     * This method sets the dog's name
     * @param dgNm 
     */
    public void setDogName(String dgNm) { 
        dogName = dgNm;
    }
    public void setHunger(int hgr) {
        hunger = hgr;
    }
    public int getHunger() {
        return hunger;
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
    public void setDogBreed(String breed) {
        dogBreed = breed;
    }
    public String getDogBreed() {
        return dogBreed;
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
        output += "Age: " + age;
        //output string is complete, return it
        return output;
    }
}
