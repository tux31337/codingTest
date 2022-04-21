import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Kakao {
    public static void main(String[] args) {
       String[] id_list = {"muzi", "frodo", "apeach", "neo"};
       String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
       int k = 2;
       solution(id_list, report, k);
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        StringTokenizer st;
        Map<String, String> map =  new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            st = new StringTokenizer(report[i]);
            String user = st.nextToken();
            String peerUser = st.nextToken();
            map.put(user, peerUser);
        }
        System.out.println("---");
        System.out.println(map.get("muzi"));
        int[] answer = {};
        return answer;
    }
}
