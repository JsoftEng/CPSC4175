# Assignment 3
## CPSC 4175 - Software Engineering
## John Johnson

1. __What two kinds of things must a__ ___software requirements specification___ __contain?__
    - A ___software requirements specification___ typically must describe what the product must do and any constraints involved.
2. __Give an example of an ambiguous requirement in English (that is, using a natural language). Explain the ambiguity.__
    - Consider the following scenario:
        - NASA software engineers are developing an algorithm to determine the function of mechanisms that aim to maintain the stability in trajectory of an arbitrary lunar orbital vehicle. A snippet of one of the functional requirements is as follows:
          - __CSMV7.4.2.__ _If a target trajectory_ ___A___ _is intercepted by a celestial body_ ___C___ _thrusters_ ___T1, T2,....,Tn___ _shall activate in a manner such that the resulting trajectory_ ___B___, _as the distance between_ ___C___ _and the lunar orbital vehicle --> infinity, trajectory_ ___B___ _--> trajectory_ ___A___
        - This snippet introduces an ambiguity as the dimensions of the celestial body are not considered.
3. __Consider the domain of processing student grades. Draw a simple__ ___data flow diagram___ __of the process. Create the drawing as a PDF and upload the file to your Github repository. Explain the drawing in English as your answer to this question.__
    - The organization of the ___Data Flow Diagram___ for processing student grades is as follows:
      - __External Entities:__ _Student Records System, Student, Instructor_
      - __Processes:__ _Assign Final Grade, Establish Grade Book, Produce Grade Report, Grade Student Work_
      - __Data Stores:__ _Grade Book_
      - __Data Flows:__ _Class Roster, Grading Parameters, Grade Report, Final Grade, Grade Book, Grading Detail, Student Grade, Submitted Work, Graded Work_
4. __Consider the domain of an online shopping cart. Draw a simple__ ___finite state machine___ __of the process. Create the drawing as a PDF and upload the file to your Github repository. Explain the drawing in English as your answer to this question.__
    - The organization of the ___Finite State Machine___ for an online shopping cart is as follows:
        - __Possible States:__ _[Browse Items, Search Items, View/Update Shopping Cart, View Items, Remove Items from Shopping Cart, Add Items to Shopping Cart, Checkout]_
        - __Possible Inputs:__ _[Search, Browse, Shopping Cart, Review, Cancel, Done, Like, Skip]_
5. __Consider the domain of a database with customer, products, and orders tables. Draw a simple__ ___entity-relation diagram___ __of the database. Create the drawing as a PDF and upload the file to your Github repository. Give an account of the data structure in English as your answer to this question.__
    - The organization of the ___Entity-Relation Diagram___ for a database of customers, products and orders is as follows:
      - __Entities:__ _Customer, Order, Product_
      - __Actions:__ _Makes, Includes_
      - __Attributes:__ _{Customer Number, Name, Email}, {Order Number, Order Date, Handling Cost}, {Unit Price, Quantity}, {Product Number, Product Name, Price}_
      - __Relationships:__ _{Customer -> Order [One-to-Many]}, {Order -> Product [Many-to-Many]}_
6. __This is not in the book. Consider the project you have chosen as a team. Draw a simple__ ___SDL___ __(Specification and Description Language) diagram of the project. Create the drawing as a PDF and upload the file to your Github repository. Explain your project on a high level in English as your answer to this question.__
    - The organization of the ___Specification and Description Language Diagram___ for the Messaging System is as follows:
      - __States:__ _[Start Application, Logged In, Updating Status, Posting Message, Searching, Checking Messages]_
      - __Inputs:__ _[Exit Application, Login, Sign Up, Update Status, Post Message, Search Users, Check Messages, Logout, Cancel, Change Status, Edit Message, Edit User, Delete Message, Reply to Message, Send Message]_
    - One initiated (_icon clicked_) the program will be in the ___Start Application___ state. At this point the user can choose/input either of the following commands:
      - __Exit Application__
          - If this option is selected the program will ___Stop___
      - __Login__
          - If this option is selected the state of the program will change to ___Logged In___ and the user will be presented with the following options to choose/input:
              - __Update Status__
                - If this option is selected the state of the program will change to ___Updating Status___ and the user will be presented with the following options to choose/input:
                    - __Cancel__
                      - If this option is selected the state of the program will change to ___Logged In___.
                    - __Change Status__
                      - If this option is selected the user will make any desired changes to their status after which the state of the program will change to ___Logged In___.
              - __Post Message__
                - If this option is selected the state of the program will change to ___Updating Status___ and the user will be presented with the following options to choose/input:
                  - __Cancel__
                    - If this option is selected the state of the program will change to ___Logged In___.
                  - __Edit Message__
                    - If this option is selected the user will be allowed to create/edit a message after which the state of the program will change to ___Logged In___.
              - __Search Users__
                - If this option is selected the state of the program will change to ___Searching___ and the user will be presented with the following options to choose/input:
                  - __Cancel__
                    - If this option is selected the state of the program will change to ___Logged In___.
                  - __Select User__
                    - If this option is selected the user will be presented with the following options to choose/input.
                      - __Cancel__
                      - If this option is selected the state of the program will change to ___Logged In___.
                      - __Send Message__
                        - If this option is selected the user will be allowed to create/edit a message after which the state of the program will change to ___Logged In___
              - __Check Messages__
                - __Cancel__
                  - If this option is selected the state of the program will change to ___Logged In___.
                - __Delete Message__
                  - If this option is selected the user will be allowed to delete a message after which the state of the program will change to ___Logged In___.
                - __Reply to Message__
                  - If this option is selected the user will be allowed to reply to a message after which the state of the program will change to ___Logged In___.
              - __Logout__
                - If this option is selected the program state will change to ___Start Application___.
      - __Sign Up__
        - If this option is selected the user will be allowed to create and account/sign up after which the state of the program will change to ___Start Application___.
7. __Find an image or document online of a__ ___simple___ __function using Z. Convert the image or document to a PDF and upload it to your Github repository. Explain the specification in English as your answer to this question. Note that the Z language is difficult and takes years to learn. This course is not a course in Formal Methods, where you might spend an entire semester learning the Z language. You don't have to understand the Z specification. All you have to do is have some faint idea about its concept and operation.__
  - In the example provided the Z specification is used to formally describe the ___Credit Card___ class. The class has the following members:
    - __Limit:__ A natural number, can be 1000, 2000 or 5000
    - __Balance:__ An integer, sum of balance and limit > 0
    - __Initial Value:__ Zero
    - __Withdraw:__ Changes balance, withdraw amount is a natural number, withdraw amount must be less than sum of balance and limit, resulting balance equal to balance minus widraw amount
    - __Deposit:__ Changes balance, deposit amount is a natural number, resulting balance equal to balance plus deposit amount
    - __Withdraw Available:__ Changes balance, withdraw amount is a natural number, withdraw amount is equal to current balance plus limit, resulting balance equal to negative of limit
