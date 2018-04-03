import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner scan = new Scanner(new File("employee.txt"));

        UALdictionary<String, StaffMember> SSNDictionary = new UALdictionary<>();

        UALdictionary<String, StaffMember> NameDictionary = new UALdictionary<>();

        SSNDictionary.insert("123-45-6789", new StaffMember());

        while (scan.hasNext()) {

            System.out.println(scan.nextLine());

        }

        Tester getters = new Tester();

        System.out.println(getters);



    }
}
