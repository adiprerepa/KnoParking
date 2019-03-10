public class Main {

    private static int webServerPort = 55555;
    private static int RPI_PictureStream_ServerSocket = 33333;
    public static String webServerAddr = "172.16.3.22";

    public static void main(String[] args) {
        Server testServer = new Server(RPI_PictureStream_ServerSocket, webServerAddr, webServerPort);
        testServer.runMain();
    }
}
