import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class App {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        

        public FastReader() {
            br = new BufferedReader(
                new InputStreamReader(System.in));   
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());        //Tokenizes the input here, and stores it in st
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }       //Runs the while intil we have something in st
            return  st.nextToken();     //Returns the next token
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() { 
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                if (st != null && st.hasMoreTokens()) {
                    str = st.nextToken();

                }
                else {
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader s = new FastReader();    ///Call the input here, and create a new object which contains the input

        String n = s.nextLine();
        String d = s.nextLine();

        System.out.println("The first line is \n" + n + " and the second line is  \n" + d + ".");
    }
}
