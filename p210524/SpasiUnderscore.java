
package pbo2301081003.p210524;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SpasiUnderscore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file teks: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Masukkan nama file output: ");
        String outputFileName = scanner.nextLine();

        try {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);

            Scanner fileScanner = new Scanner(inputFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String modifiedLine = line.replaceAll(" ", "_");
                writer.write(modifiedLine);
                writer.newLine();
            }

            fileScanner.close();
            writer.close();

            System.out.println("File berhasil dikonversi.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
 