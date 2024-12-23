public class Main {
    public static void main(String[] args) {
        Main.printMegaBytesAndKiloBytes(1);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = kiloBytes / 1024;
            int remainder = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainder + " KB");
        }
    }
}
