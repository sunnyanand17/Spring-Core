package org.sunny.anand;

public class Triangle {

    private String type;

    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * @param type By default Spring uses the setter for injecting the dependency for the member variable type - setter injection
     *             There is another way for doing it, using the constructor for the class - called constructor injection
     */
    /*public void setType(String type) {
        this.type = type;
    }
    */
    public void draw() {
        System.out.println(getType() + " Triangle drawn");
    }
}
