package comportamental;

public class Adapter {

    public interface PinSocket{
        void connectPinSocket(); //metodo que ambas classes terão em comum
    }

    public static class TwoPinSocket implements PinSocket{
        public void connectTwoPinSocket(){
            System.out.println("Plugged into a Two-Pin Socket");
        }

        @Override
        public void connectPinSocket() {
            this.connectTwoPinSocket();
        }
    }

    public static class ThreePinSocket implements PinSocket{
        public void connectThreePinSocket(){
            System.out.println("Plugged into a Three-Pin Socket");
        }

        @Override
        public void connectPinSocket() {
            this.connectThreePinSocket();
        }
    }

    public static void main(String[] args) {
        PinSocket twoPinSocket = new TwoPinSocket();

        twoPinSocket.connectPinSocket(); //chamando metodo que ambas tem em comum

        PinSocket threePinSocket = new ThreePinSocket();

        threePinSocket.connectPinSocket(); //chamando metodo que ambas tem em comum
    }
}
