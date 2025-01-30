import java.util.*;
import java.io.*;

public class Main {
    static class Secret {
        private String code;
        private String location;
        private int time;

        public Secret(StringTokenizer st) {
            this.code = st.nextToken();
            this.location = st.nextToken();
            this.time = Integer.parseInt(st.nextToken());
        }

        @Override
        public String toString() {
            return "secret code : " + this.code + "\n" +
                   "meeting point : " + this.location + "\n" +
                   "time : " + this.time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Secret secret = new Secret(new StringTokenizer(br.readLine()));
        System.out.println(secret.toString());
    }
}