# policyexpert
Hello!

I've decided to write down my thoughts while implementing solution
to help you understand why I made it this way.

Let's start with the Product. It has a name, price, and a lot of other characteristics,
like: manufacturer, country of origin, age and other restrictions etc. And we can store
price in pence as clever people. But something looks wrong here. Product name and
manufacturer doesn't change often. If it changes, probably it's a new product. So we
create Product once and forever.
But price is a different specie. Prices are changing every week. And if we have a chain
we can have different prices in different stores. So probably it's better to place price
into different entity and link it with Product.
Also same product may have different manufacturers and providers but I won't dive into
that.
We have enumerable and weighed products. To calculate enumerable product price we just
need to find it's price from the table. But for weighed product we need to multiply
weight of product to product price per kg. Let's add type property to Product. And
create ProductPriceCalculator with two methods to get two types of product prices.



About Java Money issue. I know that you shouldn't use float or double for monetary or
precise calculations. I store and calculate prices in pence using int. Conversion to
pounds may happen right before output.