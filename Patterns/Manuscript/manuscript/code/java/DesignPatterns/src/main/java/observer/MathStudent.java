package observer;

class MathStudent implements Student {
    @Override
    public void receiveUpdate() {
        System.out.println("Math student received an update from the teacher.");
        // Logic for processing the update
    }
}
