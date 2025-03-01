public class HatchBack extends Car {
    private String carName;

    @Override
    public void autoPilot() {
        System.out.println("AutoPilot HatchBack");
    }

    @Override
    public void streamingServices() {
        System.out.println("Streaming Services HatchBack");
    }

    @Override
    public void parkServices() {
        System.out.println("Park Services HatchBack");

    }

}
