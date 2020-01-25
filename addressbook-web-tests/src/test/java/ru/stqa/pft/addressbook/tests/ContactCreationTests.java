package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends BaseTest {

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().createContact(new ContactData("yulia", "dem", "minsk",
                "q@com", "123", "test1"), true);
    }
}
