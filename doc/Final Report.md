# Final Report

Team Name: team_not_found(Group17)

Team Members: Vita Huang(ythuang3), Chia-Yi Lee(chiayi3), Mengting Ai(mai10), Xiaowen Shang(xs41)

Professor: Abdu Alawini

TA: Naifu Zheng

**1.Please list out changes in directions of your project if the final project is different from your original proposal (based on your stage 1 proposal submission).**

Our original proposal is an online order system that lets users purchase merchandise from local Farmers Market. Meanwhile, the farmers can post their products on the system. The customers can browse the products and place orders, and the farmers can post their products. This platform can be a convenient way for the customers and be a way for the farmers to promote their products. When we implemented the system, we cut the online payment module, and changed to face to face transaction in consideration of the fact that weighing is required before determining the price.We were planning to provide recipe recommendations on the product page and obtain receipts by using API. But this is very demanding for the dataset. Since we acquired our product data by Web Crawler, we lack this data information to provide recipe recommendations. So we cut this part.

**2.Discuss what you think your application achieved or failed to achieve regarding its usefulness.**

We successfully achieved convenience and organization parts of usefulness. The ordering system provides convenient operation for customers and farmers. Customers could order products beforehand, and farmers would be able to prepare more stocks before customers pick them up. We created a database for sellers to manage their stocks, the selling products, and customers; customers can track their shopping lists, and order history.

**3.Discuss if you changed the schema or source of the data for your application**

The data was originally designed as three databases: Product, Customer and Farmer. During the implementation, we added five more databases: User, Has_ShoppingCart, Contains, Includes_Product and Place_Order.

**4.Discuss what you change to your ER diagram and/or your table implementations. What are some differences between the original design and the final design? Why? What do you think is a more suitable design?** 

We built the include_product tables (the products’ information in the customer’s shopping cart) without price data; however, we decided to create a price attribute to store prices of the shopping cart in the table afterwards. Because we could use the price in the table to calculate the total price in the shopping cart, that would improve the website efficiency. When loading the website, the webpage did not need to calculate the price and rendered the webpages, just load the price from the database.

**5.Discuss what functionalities you added or removed. Why?**

First of all, we remove the function of finding menus that can help customers when buying products at our website. In the beginning, we thought that this function will attract customers eyes’ to become our potential customers. After careful discussion, we decided to remove this function because, most of the time, we would know what dishes we would like to cook before we buy the product. Therefore, this function becomes not that urgent in our application. We decided to add a window function to show each farmer’s product sales rank. The reason why we want to add this function is to see how many quantities a product sells. In that way, we can help farmers to increase their sales and also increase traffic of the website to let more people know about our websites.

**6.Explain how you think your advanced database programs complement your application.**

For stored procedures and a trigger we create, stored procedures help us manage customer status and check whether the farmer insert value is reasonable or not. First, the idea of stored procedure is classifying customers by their shopping history. We use group by function to group customer_id together and count the order_id. Therefore, we can obtain customer purchase intentions, if they are diamond status, we could say they are frequent customers and they like to use our application to purchase products. If they are rock status, probably they are not satisfied with our application or products, then we use questionnaires to ask their opinions so far. The stored procedure helps us improve our application and farmer products, and also assists us in doing marketing campaigns. Second, the trigger function idea is pretty simple. We would like to prevent farmers inserting the negative value for stock numbers or prevent applications having wrong operations. In that way, we can make sure that numbers in our databases are useful and reasonable. In conclusion, functions like triggers and stored procedures really help us a lot in our application and we really learn how to put these functions into practice.

**7.Each team member should describe one technical challenge that the team encountered. This should be sufficiently detailed such that another future team could use this as helpful advice if they were to start a similar project or where to maintain your project.** 

**Vita Huang**: One of the technical challenges we encountered was the GCP charged our database a total of $50, and we did not even know what happened. We close the database every time after we complete the tasks, then we use another person’s $50.
**Chia-Yi Lee**: One technical challenge we had encountered is that our database is being hacked before demo day. The reason that we were hacked was because we did not set up authorized connections that can connect to our database and we did not know that we will face hackers so close. After finding out all tables were dropped by hackers, we panicked and tried to rebuild the database as soon as possible. Luckily, we made it on time, and the demo went smoothly.
**Mengting Ai:** I'm not so familiar with javascript, so when I was trying to connect the front-end with the back-end, I spend a lot of time to figure out how to deal with HTTP request and how to send the data. It is really strange that if I send an GET requests, the back-end url will receive it twice, so I then just change it to access that url without sending a request.
**Xiaowen Shang:** The most challenging part of the project is to develop the back end collaboratively, and determine the interface with the front end. We divided the mission of back end development into three parts. When we developed our own parts, we have to pass data into other modules or receive data from another module, so we need to determine the data form and build vo classes to store the intermediate variables. We worked it out by timely communication.

**8.Are there other things that changed comparing the final application with the original proposal?**

First, our scope is too large to complete in a semester, and we did not notice this at the beginning. We thought that the extra function could be the recipe recommending system for motivating customers to buy more products, but we ran out of time. Then, we switched the extra function to a window function that helps farmers to identify their best-selling products. For the customers, we only implement the main functions of placing orders, and the main functions of CRUD for the farmers. 

**9.Describe future work that you think, other than the interface, that the application can improve on?**

We would like to optimize our farmer side first, for example, classify the product type, such as fruits and vegetables, to better display our information. For the customer, maybe we can store the customer's birthday attribute and then give them a surprise on that day. Think deeply, we should classify the farmer business from 1 to 3 because the purpose of the application is to help local farmers who without many resources reach more customers. If their business size becomes bigger enough by calculating their revenue in a month to decide, then we could suggest then move out the application and leave space for more farmers who are in need. In terms of the database system, We should be careful about our database setup next time. Because our database was hacked one day before the demo, which was a disaster. We need to recreate all the tables and insert the data again. What we can improve is to have better protection for our database, only authorized connections can connect to our database.

**10.Describe the final division of labor and how well you managed teamwork.**

**Vita Huang**: scrawing data, front-end, create database, creative function

**Chia-Yi Lee:** create database, back-end, creative function

**Xiaowen Shang**: create database, back-end, creative function

**Mengting Ai:** generate data, back-end, create database

We have an orderly division of labor. Everyone contributed to the project.