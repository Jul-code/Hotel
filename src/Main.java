import controller.ClientController;
import model.HotelInfo;
import view.HotelView;

public class Main {

    public static void main(String[] args) {

        HotelInfo model = new HotelInfo();
        model.setPrice(1000);
        HotelView view = new HotelView(model);
        ClientController controller = new ClientController(model, view);

        // Запуск программы/приложения
    controller.runApp();
    }
}
