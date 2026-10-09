class Animal1 {
    // Instance variables
    int eye;
    protected String animalName = "mouse";

    public static void main(String[] args) {
        Animal1 animalobj = new Animal1();
        animalobj.eye = 33;

        System.out.println("Before method call: " + animalobj.eye);

        // Call method that changes the object
        changeObjectByReference(animalobj);

        System.out.println("After method call: " + animalobj.eye);
    }

    // Static method that modifies the object
    static void changeObjectByReference(Animal1 animalobjcopy) {
        animalobjcopy.eye = 100; // modifies the original object
    }
}
