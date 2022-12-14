package com.effectiveem.app.table;

import com.google.gwt.junit.client.GWTTestCase;

public class TableRowVOTest extends GWTTestCase {

   private TableRowVO tableRowVO;

   public void testGetId() {

      tableRowVO.setId(1);
      assertEquals(1, tableRowVO.getId());
   }

   public void testSetId() {

   }

   public void testTestGetName() {

   }

   public void testTestSetName() {

   }

   @Override
   protected void gwtSetUp() throws Exception {

      super.gwtSetUp();

      tableRowVO = new TableRowVO();
   }

   @Override
   public String getModuleName() {

      // NOTE: simeshev - 2022-10-22 - It's critical that this literal is set to the name
      // as defined in the configuration of net.ltgt.gwt.maven's gwt-maven-plugin
      // <moduleName>...</moduleName> in this client's pom.xml. Otherwise, if using the shor modeul name such as "eemapp",
      // there will be errors such as "Unable to find 'eemapp.gwt.xml' on your classpath; could be a typo, or maybe you forgot to include a classpath entry for source?"
      //
      // NOTE: simeshev - 2022-10-23 - Changing the module name to something completely
      // disconnected from the source code structure lead to this error:
      //    "com.google.gwt.junit.JUnitFatalLaunchException: The test class
      //    'com.effectiveem.app.table.TableRowVOTest' was not found in module
      //    'com.some.completely.different.package.App'; no compilation unit for that type was seen"
      //
      // NOTE: simeshev - 2022-10-23 - GWT seems look for sources based on the fully qualified path to the module.
      // This means that GWT-compilable classes must be under <GWT module path> of <GWT module path>.<Module name>
      // when source="".
      return "com.effectiveem.app.App";
   }
}