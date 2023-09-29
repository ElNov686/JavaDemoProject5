package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class GooglePage extends BasePage{

    @FindBy()
    private List<WebElement> listAllRows;

    public GooglePage(WebDriver driver) {super(driver);}

    public List<String> getTable() {
        return listAllRows.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
