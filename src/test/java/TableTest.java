import model.GooglePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.List;

import static java.sql.DriverManager.getDriver;

public class TableTest {

    @Test
    public void printGoogleTable() {
        GooglePage googlePage = new GooglePage(getDriver());
        List<String> table = googlePage.getTable();
        System.out.println(table);

        for (int i = 0; i < table.size(); i++) {
            int ind = table.get(i).lastIndexOf("\n");

            String[] row = table.get(i).substring(0, ind).split("\n");

            for (int j = 0; j < row.length; j++) {
                String s = String.format("%-32s", row[j]);
                System.out.println(s);
            }
            System.out.println();
        }
    }

    private WebDriver getDriver() {
        return null;
    }
}
