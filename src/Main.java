public class Main {
    public static void main(String[] args) {
        View view = new View();
        GewinnModel model = new GewinnModel();
        Controller controller = new Controller(view, model);
    }
}