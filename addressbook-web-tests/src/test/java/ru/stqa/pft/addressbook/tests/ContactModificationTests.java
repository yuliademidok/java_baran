package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends BaseTest {
    @Test
    public void testContactModification() {
        app.getNavigationHelper().goToHomePage();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("yulia", "dem", "minsk",
                    "q@com", "123", "test1"), true);
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("1", "2", "3", "4",
                "6", null), false);
        app.getContactHelper().updateContactForm();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(before, after);
        //app.getContactHelper().returnToHomePage();
    }

}
