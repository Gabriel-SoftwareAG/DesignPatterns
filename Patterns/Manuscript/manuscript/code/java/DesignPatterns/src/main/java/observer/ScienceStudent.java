package observer;

class ScienceStudent implements Student {
    @Override
    public void receiveUpdate() {
        System.out.println("Science student received an update from the teacher.");
        // Logic for processing the update
    }
}