package correcter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        file();
    }

    public static void file() {
        File file = new File();
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Write a mode: ");
        switch (scanner.nextLine()) {
            case "encode":
                file.encodeFileHamming("send.txt",
                        "encoded.txt");
                break;
            case "send":
                file.sendFileWithErrors("encoded.txt",
                        "received.txt");
                break;
            case "decode":
                file.decodeFileHamming("received.txt",
                        "decoded.txt");
                break;
            default:
                break;
        }
    }
}