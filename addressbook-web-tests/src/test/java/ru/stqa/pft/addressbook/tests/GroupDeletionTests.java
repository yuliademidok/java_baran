package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class GroupDeletionTests extends BaseTest {

  ApplicationManager app = new ApplicationManager();
  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().goToGroupPage("groups");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
