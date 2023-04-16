package subway.controller;

import subway.View.InfoView;
import subway.View.MainView;
import subway.View.StationView;
import subway.domain.Station;
import subway.domain.StationRepository;

import java.util.Scanner;

public class StationController {

    private static StationRepository stationRepository;
    private static final int ENROLL = 1;
    private static final int DELETE = 2;
    private static final int GETLIST = 3;
    private static final String BACK = "B";
    private static String stationState;
    StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    static void stationMapping(Scanner scanner) {
        while (true) {
            StationView.printStation();
            stationState = scanner.nextLine();
            if (stationState.equals("B")) {
                break;
            } else if (Integer.parseInt(stationState) == ENROLL) {
                StationView.printEnroll();
                enroll(scanner.nextLine());
                System.out.println(InfoView.ROUTEENROLLSUCCESS);
            } else if (Integer.parseInt(stationState) == DELETE) {
                StationView.printDelete();
                delete(scanner.nextLine());
                System.out.println(InfoView.ROUTEDELETESUCCESS);
            } else if (Integer.parseInt(stationState) == GETLIST) {
                StationView.printList();
                list();
            }
        }
        StationView.printEnroll();
    }

    static void enroll(String stationName) {
        StationRepository.addStation(new Station(stationName));
    }

    static void delete(String stationName) {
        StationRepository.deleteStation(stationName);
    }

    static void list() {
        for (Station station : StationRepository.stations()) {
            System.out.println(InfoView.INFO + station.getName());
        }
    }

}
