Feature: Verify Adactin login details

  Scenario Outline: Verify Adactin login details with valid username and valid password
    Given User is on the Adactin login page
    When User login "<userName>","<password>"
    And User search hotel "<location>","<hotels>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    And User select hotel name
    And User book hotel "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryDate>","<expiryMonth>" and "<cvvNumber>"
    Then User should print Order Id

    Examples: 
      | userName   | password | location    | hotels         | roomType     | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName | billingAddress | creditCardNo     | creditCardType | expiryDate | expiryMonth | cvvNumber |
      | Greens8767 | L4R739   | Sydney      | Hotel Creek    | Deluxe       |             4 | 11/02/2023  | 12/02/2023   |             3 |               0 | parthi    | eswar    | adambakkam     | 6381919778234567 | VISA           |          1 |        2020 |      1234 |
  #    | Greens8767 | L4R739   | Melbourne   | Hotel Sunshine | Standard     |             3 | 13/02/2023  | 14/02/2023   |             2 |               0 | arun      | kumar    | omr            | 1234567891234567 | VISA           |          1 |        2020 |      1234 |
   #   | Greens8767 | L4R739   | Brisbane    | Hotel Creek    | Deluxe       |             2 | 15/02/2023  | 17/02/2023   |             1 |               0 | muthu     | kumar    | chennai        | 9894685199134567 | VISA           |          1 |        2020 |      1234 |
    # | Greens8767 | L4R739   | New York    | Hotel Creek    | Double       |             4 | 12/02/2023  | 14/02/2023   |             3 |               0 | gowtham   | twin     | ECR            | 1234567891234567 | VISA           |          1 |        2020 |      1234 |
     # | Greens8767 | L4R739   | Los Angeles | Hotel Creek    | Deluxe       |             3 | 13/02/2023  | 15/02/2023   |             2 |               0 | arun      | kumar    | adambakkam     | 1615141312111098 | VISA           |          1 |        2020 |      1234 |
   #   | Greens8767 | L4R739   | Paris       | Hotel Cornice  | Deluxe       |             3 | 13/02/2023  | 15/02/2023   |             2 |               0 | pream     | kumar    | adambakkam     | 1234567891234567 | VISA           |          1 |        2020 |      1234 |
    #  | Greens8767 | L4R739   | Sydney      | Hotel Creek    | Super Deluxe |             2 | 15/02/2023  | 17/02/2023   |             2 |               0 | pugal     | yuvan    | bangalore      | 6381608082476578 | VISA           |          1 |        2020 |      1234 |
    #  | Greens8767 | L4R739   | Paris       | Hotel Cornice  | Deluxe       |             3 | 17/02/2023  | 18/02/2023   |             2 |               0 | praveen   | kumar    | T.nagar        | 8765432109875467 | VISA           |          1 |        2020 |      1234 |
     # | Greens8767 | L4R739   | Sydney      | Hotel Creek    | Deluxe       |             2 | 15/02/2023  | 19/02/2023   |             3 |               0 | vini      | anish    | thiruvanmyur   | 5678904321567897 | VISA           |          1 |        2020 |      1234 |
