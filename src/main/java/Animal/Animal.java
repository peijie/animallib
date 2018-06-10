package Animal;

public class Animal {
    //the name of the animal
    private String name;

    //The color of the animal
    private String color;

    /**
     * The getter for animal name
     * @return the name of hte animal
     */
    public String getName() {
        return this.name;
    }

    /**
     * The setter for animal name
     * @param name the name of the animal to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getter of animal color
     * @return the color of the animal
     */
    public String getColor() {
        return this.color;
    }

    /**
     * The setter of the animal
     * @param color The color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
