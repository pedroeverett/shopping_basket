# shopping_basket
Shopping Basket simulation using Java and TDD. Used joda-time for handling dates.

User can:

add items to the shopping basket 
(client may only buy certain products because of age restriction),
remove items from the shopping basket,
empty the shopping basket,
checkouk shopping basket.

Use of system date to calculate client age and days left until product expiration date.

Calculate the total value of the shopping basket. This accounts for:
shipping expenses if total value is £15 or less,
product near expiration date has 30% discount,
buy-one-get-one-free discounts on items,
10% off on totals greater than £20 (after previous discount is applied),
2% off on total for customers with loyalty cards (after all other discounts are applied).

All tests passing.

Values for dates tests need to be updated when test are run in the future, because of the use of real dates.
