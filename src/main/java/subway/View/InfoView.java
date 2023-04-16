package subway.View;

public class InfoView {
    public static final String INFO = "[INFO] ";

    public static final String STATIONENROLLSUCCESS = "\n" + INFO + "지하철 역이 등록되었습니다.";
    public static final String STATIONDELETESUCCESS = "\n" + INFO + "지하철 역이 삭제되었습니다.";
    public static void stationList() {
        // [INFO] XX역
    }
    // 두개 합칠순없을까
    public static final String ROUTEENROLLSUCCESS = "\n" + INFO + "지하철 노선이 등록되었습니다.";
    public static final String ROUTEDELETESUCCESS = "\n" + INFO + "지하철 노선이 삭제되었습니다.";
    public static void routeList() {
        // [INFO] X호선
    }

    public static final String INTERVALENROLLSUCCESS = "\n" + INFO + "구간이 등록되었습니다.";
    public static final String INTERVALDELETESUCCESS = "\n" + INFO + "구간이 삭제되었습니다.";

    public static void mapList() {
        // [INFO] X호선
    }
}
