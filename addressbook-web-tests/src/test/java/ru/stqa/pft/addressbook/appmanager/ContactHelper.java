package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends BaseHelper {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void initContactCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
        type(By.name("mobile"), contactData.getMobile());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void initContactModification() {
        click(By.xpath("//img[@title='Edit']"));
    }

    public void updateContactForm() {
        click(By.name("update"));
    }

    public void returnToHomePage() {
        click(By.name("home page"));
    }
}
