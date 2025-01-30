import java.util.*;
import java.io.*;

public class Main {
    static class User{
        private String id;
        private String level;

        public User(){
            this.id = "codetree";
            this.level = "10";
        }
        public User(StringTokenizer st){
            this.id = st.nextToken();
            this.level = st.nextToken();
        }
        @Override
        public String toString(){
            return "user " + this.id + " lv " + this.level;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        User user1 = new User();
        User user2 = new User(new StringTokenizer(br.readLine()));
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}