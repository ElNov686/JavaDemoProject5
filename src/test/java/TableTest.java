import base.BaseTest;
import model.WebTablePage;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest extends BaseTest {

    @Test
    public void printGoogleTable() {
        WebTablePage webTablePage = new WebTablePage(getDriver());
        List<List<String>> table = webTablePage.getRows();
        System.out.println(table);

        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(i).size() - 1; j++) {
                String s = String.format("%-32s", table.get(i).get(j));
                System.out.print(s);
            }
            System.out.println();
        }
//            int ind = table.get(i).lastIndexOf("\n");
//
//            String[] row = table.get(i).substring(0, ind).split("\n");

//            for (int j = 0; j < row.length; j++) {
//                String s = String.format("%-32s", row[j]);
//                System.out.println(s);
//            }
//            System.out.println();
//        }
//    }

    }
}
