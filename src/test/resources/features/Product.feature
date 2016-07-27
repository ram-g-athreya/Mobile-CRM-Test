Feature: Product Page
  Test Cases Related to the Product Page

Background:
  #Given I am testing "ProductPage" on "Desktop"

Scenario Outline: Verify Product Page
  Given I open <ProductID>
  When I enter <Name> in "nameField"
  When I enter <Email> in "emailField"
  When I enter <Mobile> in "mobileField"
  When I enter <Address> in "addressField"

  Examples:
    | ProductID | Name          | Email                 | Mobile     | Address                                                 |
    | 100       | Ram G Athreya | ramgathreya@gmail.com | 9940154250 | 887/C Munusamy Salai K K Nagar Chennai - 600078         |
    | 101       | T Srinivasan  | tsrini1969@gmail.com  | 9789034482 | 6/2, Ethiraj Street, Padmanabha Nagar, Chennai - 600094 |