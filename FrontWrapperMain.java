import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class FrontWrapperMain {

    private static Socket backendSocket;

    public static void main(String[] args) throws Exception {

        try {
            backendSocket = new Socket("localhost", 55555);
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader br3 = new BufferedReader(new InputStreamReader(backendSocket.getInputStream()));
        String input = br3.readLine();
        System.out.println(input);
    }
}
