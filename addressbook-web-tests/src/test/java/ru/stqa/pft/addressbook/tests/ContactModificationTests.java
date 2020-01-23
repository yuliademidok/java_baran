package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends BaseTest {
    @Test
    public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("1", "2", "3", "4",
                "6", null), false);
        app.getContactHelper().updateContactForm();
        //app.getContactHelper().returnToHomePage();
    }

}
