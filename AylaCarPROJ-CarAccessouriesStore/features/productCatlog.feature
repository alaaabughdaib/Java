Feature:  product catalog

  Scenario Outline: catalog <productId> <productName> <category> <picture> <cost>
    When Customer want to show certain product
    Then all details will given  <productId> <productName> <category> <picture> <cost>
Examples:
 |productId| productName| category| picture| cost|
    |2 | "cc"    |"in" |"pic" |99.9   |

