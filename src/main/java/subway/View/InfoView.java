package subway.View;

public class InfoView {
    private static final String INFO = "[INFO] ";

    public static final String STATIONENROLLSUCCESS = INFO + "지하철 역이 등록되었습니다.";
    public static final String STATIONDELETESUCCESS = INFO + "지하철 역이 삭제되었습니다.";
    public static void stationList() {
        // [INFO] XX역
    }
    // 두개 합칠순없을까
    public static final String ROUTEENROLLSUCCESS = INFO + "지하철 노선이 등록되었습니다.";
    public static final String ROUTEDELETESUCCESS = INFO + "지하철 노선이 삭제되었습니다.";
    public static void routeList() {
        // [INFO] X호선
    }

    public static final String INTERVALENROLLSUCCESS = INFO + "구간이 등록되었습니다.";
    public static final String INTERVALDELETESUCCESS = INFO + "구간이 삭제되었습니다.";

    public static void mapList() {
        // [INFO] X호선
    }
}
