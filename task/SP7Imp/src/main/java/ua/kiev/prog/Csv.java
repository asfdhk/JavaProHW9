package ua.kiev.prog;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;
import java.io.IOException;

public class Csv {
    public void dd(){

        String a = "asd.csv";
        try (FileWriter fileWriter = new FileWriter(a);
             CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.MYSQL)) {

            csvPrinter.printRecord("Id","Name", "Surname", "Phone","E-mail","Group");

            csvPrinter.printRecord("ds","sad","asd","sad","asd","asd");
            csvPrinter.printRecord("ds","sad","asd","sad","asd","asd");

            csvPrinter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
