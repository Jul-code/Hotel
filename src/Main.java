import controller.ClientController;
import models.HotelInfo;
import views.HotelView;

public class Main {

    public static void main(String[] args) {

        HotelInfo model = new HotelInfo();
        model.setPrice(1800 - 1800 * 0.3);
        HotelView view = new HotelView(model);
        ClientController controller = new ClientController(model, view);

        // Запуск программы/приложения
        controller.runApp();
    }
}

