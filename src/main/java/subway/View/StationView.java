package subway.View;

import java.util.List;

public class StationView {

    private static final String STATION = "\n## 역 관리 화면\n" +
                                            "1. 역 등록\n" +
                                            "2. 역 삭제\n" +
                                            "3. 역 조회\n" +
                                            "B. 돌아가기";

    private static final String ENROLL = "\n## 등록할 역 이름을 입력하세요.";
    private static final String DELETE = "\n## 삭제할 역 이름을 입력하세요.";
    private static final String LIST = "\n## 역 목록";

    public static void printStation() {
        System.out.println(STATION);
        System.out.println(MainView.CHOOSE);
    }

    public static void printEnroll() {
        System.out.println(ENROLL);
    }

    public static void printDelete() {
        System.out.println(DELETE);
    }

    public static void printList() {
        System.out.println(LIST);
    }
}
