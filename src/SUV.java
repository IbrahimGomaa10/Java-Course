public class SUV extends Car {
        private String carName;

        @Override
        public void autoPilot() {
            System.out.println("AutoPilot SUV");
        }

        @Override
        public void streamingServices() {
            System.out.println("Streaming Services SUV");
        }

        @Override
        public void parkServices() {
            System.out.println("Park Services SUV");

        }

}
