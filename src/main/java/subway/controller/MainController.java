package subway.controller;

import subway.View.MainView;
import subway.View.StationView;
import subway.domain.StationRepository;

import java.util.Scanner;

public class MainController {
    private static StationController stationController = new StationController(new StationRepository());
    private static final int STATIONSTATE = 1;

    private static String mainState;

    public static void start(Scanner scanner) {
        mainMapping(scanner);
    }

    private static void mainMapping(Scanner scanner) {
        while (true) {
            MainView.printMain();
            mainState = scanner.nextLine();
            if (mainState.equals("Q")) {
                break;
            } else if (Integer.parseInt(mainState) == 1) {
                StationController.stationMapping(scanner);
            }

        }
    }

}
