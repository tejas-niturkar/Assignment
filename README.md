The strategy used to write down the test cases: I've followed POM design pattern to complete the assignment. 
       To better organize your test code and make it more maintainable, we recommend using the Page Object Design Pattern. With this pattern, the UI elements of your web application are modeled as objects within the test code. This approach reduces code duplication and allows easy updates if the UI changes. Writing and maintaining test automation can be challenging, especially when it comes to keeping selectors (classes, IDs, or XPath, etc.) up to date with the latest code changes. The Page Object pattern provides a solution by centralizing these selectors in separate .java files, where you can manage them along with the associated methods

To run the test cases, Go to HomePageTest class (location: https://github.com/tejas-niturkar/Assignment/blob/master/src/test/java/HomePageTest.java)
 Run any test case,
 
  Test case 1: Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why Tendable. 
               Method name: validateHomePageLinks

  Test case 2: Verify that the "Request a Demo" button is present and active on each of the aforementioned top-level menu pages.
               Method name: validateRequestADemoButton
               
  Test case 3: Navigate to the "Contact Us" section, choose "Marketing", and complete the form— excluding the "Message" field. On submission, an error should arise. Ensure your script confirms the error message's appearance. If the error is displayed, mark the test as PASS. If absent, it's a FAIL.
               Method name: validateSubmitContactFormErrorMessage


  
