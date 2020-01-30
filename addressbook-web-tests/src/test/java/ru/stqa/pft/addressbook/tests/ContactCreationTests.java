package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTests extends BaseTest {

    @Test(enabled = false)
    public void testContactCreation() {
        app.goTo().homePage();
        List<ContactData> before = app.getContactHelper().getContactList();

        //Test fails when there is no Group named 'test1'

        ContactData contact = new ContactData("yulia", "dem", "minsk",
                "q@com", "123", "test1");
        app.getContactHelper().createContact(contact, true);
        app.goTo().homePage();
        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(before.size() + 1, after.size());

        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(after, before);
    }
}
