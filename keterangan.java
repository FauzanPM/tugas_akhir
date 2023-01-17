import java.io.FileWriter;
import java.io.IOException;
public class keterangan extends Makan{
    @Override
    public void cetaK() {
        String fileName = "src/struk.txt";
        String fileContent1 = "pesanan dicetak";


        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent1);
            fileWriter.close();

            System.out.println("Struk sudah dicetak");
            System.out.println("trimkasih sudah berbelanja disini :)");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan!!!" + e.getMessage());
        }
    }
}
