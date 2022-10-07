# Project Proposal

## Title

Farmer’s Market order system

## Project Summary

Our project is an online order system that lets users purchase merchandise from local Farmer's Market. Meanwhile, the farmers can post their products on the system. More specifically, the customers can browse and buy the products, and the farmers can post their products. Unlike other supermarkets such as Walmart and Costco, our system focuses on a vertical market. It only offers agricultural products which are produced directly from the farms. We notice that people love to buy things from Farmer's Market, but there are no existing systems to help them purchase those products online. This platform can, on the one hand, be a convenient way for the customers and, on the other hand, be a way for the farmers to promote their products. 

Our project is implemented mainly using MySQL, a relational database at the technical level. The front-end uses HTML+CSS+JavaScript, and the back-end primarily uses Java and SpringBoot frameworks. Our project involves many inter-table interactions, such as the data need to be manipulated from the shopping cart table and the product table when creating an order, and a trigger is used to determine whether the product is in stock or not.

## Description

We would like to provide farmers in Champaign with an order system, so they could easily promote their agriculture commodities to extend their business and customer bases. As we observed that many supermarkets have an application, such as Walmart and Aldi for ordering and shipping services, small business farmers have no funding to design a website or an application to supply more convenience, which may cause a small size of customers and difficulty competing with supermarkets. Therefore, we hope to design a platform and a database that organize the farmers ' and customers' information to increase customer satisfaction.

Our web application provides users with functions of: user registration and user login; users can browse the products displayed in the market center, choose products and add them in the shopping cart; user can proceed to check out and choose pick up time. Customers can request a refund before the purchase is processed. The simple features are CRUD of the database; and the complex features are query and insert during customers adding products into shopping cart, placing orders and checking order history. For example, when a customer adds a product into the cart, the back-end SQL will execute a query that retrieves the information of the products selected by customer, and insert them into the cart table, then return everything from the cart table. And when a product is sold out, we update both the product table and the shopping cart table and mark it unavailable.

Also, Providing recipe recommendations is the special function we would like to include. Since our website's goal is to help those small farm businesses to touch more potential customers, we attract more people by recommending recipes for customers. The function would potentially suggest customers buy more ingredients in the meantime if they are interested in cooking that cuisine. We are planning to obtain receipts by using API which is better than using more coding skills on scraping data from the websites. 

Here are free recipes API: https://spoonacular.com/food-api, https://www.edamam.com/, https://rapidapi.com/apidojo/api/tasty/pricing, https://www.nutritionix.com/business/api

## Usefulness Description

1. Organized: we create a database for sellers to manage their stocks, the selling products, and customers; customers can track their shopping lists, and order history.
2. Convenient: The ordering system provides convenient operation for customers and farmers. Customers could order products beforehand, and farmers would be able to prepare more stocks before customers pick them up.
3. Creative: Providing recipe ideas is our unique feature over other websites and apps. For example, Walmart has a website for ordering and shipping services. However, after customers browse specific items, the website merely suggests other items based on what customers usually buy. If we provide customers with recipes for reference, some people may likely try the recommended ideas. Furthermore, one application called Weee, which is an Asian online marketplace. They provide customer reviews features that people could leave any message about bought items, such as item quality or recipes. Nevertheless, if the website did not classify the reviews, it would be challenging for searching recipes.

## Realness Description

Our data has three parts: product data, customer data and merchant data. 

Product data is the information of merchandise. We’ll scrap the data from websites like Walmart first. Then we may visit those Farmer’s Markets to achieve some real data. As for customer data and merchant data, we mock the data and use MySQL database to store them.

Our data format sample:

```json
{
	“Product_Name”: 
	“Product_Price”:
	“Product_Description”:
	“Product_Pic”:	
	“Product_Seller”:
},
{
	“User_Name”: 
	“Account_Number”:
	“Account_Balance”:
	“Purchase_History”:
},
{
	“Farmer_Name”: 
	“Account_Number”:
	“Farmer_Products”:
	“Sell_History”:
}
```

## Functionality Description

We divide the operations of our application into five categories. They are Shopping cart management, Order management, Product Management, Buyer management, and Seller management. Each part will execute CRUD operations on the database.

For the Shopping cart management, the customers can update their purchases here. A new shopping cart is created every time the customers add something to an empty cart. In the cart, they can add products and remove them or change their number. If they want to proceed, then it will be the work of Order management. If they finish their checkout, the cart will be deleted.

For the Order management, the customers can place or cancel their order here. When they decide to check out at the cart page, they will be redirected to the order page, and they can check their merchandise and remove them, then place the order. They can reserve the delivery time too. If they put in an order they don't want anymore, they can cancel it immediately.

For the Product management, each product posted by the merchants is an instance. The merchants can either post a product or delete a product. The customers can browse the products' names, prices, brief descriptions, and figures. We also use a API to provide recipes for the customers. When an order containing the current item is placed or canceled, the inventory of that item is updated. When the order is being processed, the stock will be locked. After the processing work, the product will be unlocked. 

For the Buyer management, the customers can sign in or sign up on the home page. Whenever they create a new account, we will create a new instance in the database, and we will delete the instance if they make an account cancellation. Users can add/delete/update their personal information like phone and address in their account center. Also, they can find their order history here.

For the Seller management, the farmers can do the same interactions like sign up and sign in. They can publish and unpublish their products, too. They can find the list of items they have posted so far in their center.

## **A low fidelity UI mockup**

https://docs.google.com/presentation/d/1F0P-iprvAMh0ThFZqrAJjvIiN9OfW6QCep4u18OySyE/edit?usp=sharing

## **Project work distribution**

Backend Java: Mengting Ai, Xiaowen Shang
Order Management: Mengting Ai
Customer/Farmer Management: Xiaowen Shang
Cart Management: Vita Huang
Product Management: Chia-Yi Lee

Scraping data: Vita Huang
Frontend: Chia-Yi Lee
ER/UML: Mengting Ai, Xiaowen Shang, Vita Huang, Chia-Yi Lee