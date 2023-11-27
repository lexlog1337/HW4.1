import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> stringList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader("poem.txt"));

        while (reader.ready()) {
            stringList.add(reader.readLine());
        }

        for (String str : stringList) {
            System.out.println(str);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));

        for (String str : stringList) {
            writer.write(str);
            writer.write("\n");
            writer.flush();
        }
        int i = 0;
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("note" + i + ".txt"));
        for (String str : stringList) {
            if (str.equals("")||str.equals("\n")) {
                i++;
                writer1.close();
                writer1 = new BufferedWriter(new FileWriter("note" + i + ".txt"));

            } else {
                writer1.write(str);
                writer1.write("\n");
                writer1.flush();
            }
        }
    }
}
