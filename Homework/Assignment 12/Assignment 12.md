# Assignment 12
## CPSC 4175 - Software Engineering
## John Johnson

1. __What do you think is the difference between an__ ___aspect___ __in the aspect oriented development model and a__ ___class___ __in an object oriented development model? Be specific.__
    - Examination of the examples given in the book with regard to __AOD__ helped me to notice two differences in particular. The first difference is that aspects consist of advice and pointcuts whereas classes consist of variables and methods. The second difference is that pointcuts appear to reference functionality outside of the scope of the aspect, this might be synonymous to a class referencing how another entity would potentially use it within its declaration.
2. __Consider the problem of targeting software to a particular platform, e.g. a handheld device as opposed to a desktop computer. Describe the differences between addressing this problem in the design phase(s) of the engineering process and the analysis phase(s) of the engineering process.__
    - The earlier that you're able to ascertain the nuances of the environment on/in which the software shall be operating the better. With that said if it is unknown what platform the software will run on prior to the design phase it could potentially lead to a negative financial impact and reassessment of the requirements.
3. __(Not in book) The Universal Windows Platform (UWP) is one major effort to solve the problem of deploying software to different platforms. Research the UWP, and briefly describe its approach to solving this problem.__
    - From researching the subject it appears that UWP is a platform that allows for the distribution and execution of applications developed on it onto various devices utilizing UWP. This versatility is similar to that of the Java Virtual Machine in that all devices which have the appropriate Java Runtime Environment are able to run java applications.
4. __How does a point-and-click IDE (such as Visual Studio) promote component based design? What do
you think the benefits of component based design are? What are its costs?__
    - IDEs such as this promote component based design by empowering the user with tools such as ___intellisense___, ___GUI development shortcuts___, and ___scripts___ for deploying projects. While these are beneficial, an unexperienced developer can quickly become lost when stripped of these tools and such they promote ignorance in the fundamental underlying techniques involved.
5. __Describe infrastructure-as-a-service (IaaS), platform-as-a-service (PaaS), and software-as-a-service (SaaS). What are the differences between them? What are the similarities?__
    - __IaaS:__ A form of cloud computing that facilitates the virtualization of computing resources over the internet.
    - __PaaS:__ Provides hardware and software tools (via cloud computing) to user over the internet.
    - __SaaS:__ Software distribution model for the hosting of software over the internet for use by customers.
    - __Differences:__ Methods by which service is provided varies betweent the services.
    - __Similarities:__ They all use cloud computing concept to varying degrees, SOA.
6. __The Semantic Web incorporates the concept of marking up information, as opposed to marking up
structure (HTML) and presentation (CSS). This is commonly done with XML. Create a document
marking up the information contained in a fast food menu (hamburgers, tacos, pizza, sandwiches,
etc.). Your document should contain about ten or twelve different items.__
    - [Food Menu](https://github.com/JsoftEng/CPSC4175/blob/master/Homework/Assignment%2012/Food%20Menu.xml)
7. __Discuss one specific technique you can use in your personal software development process that addresses the concerns of software security. "Discuss" includes describing the technique, explaining how it promotes security, and giving a concrete example.__
      - The method by which I store passwords and other sensitive information could be expanded upon. Currently when dealing with sensitive user information I store the information within a password encrypted database. This could be further bolstered by hashing the data prior to storing it.
8. __Read the article by E. F. Codd entitled A Relational Model of Data for Large Shared Data Banks, in the PDF directory in my class Github repository as codd.pdf. Write a one paragraph appreciation of this article..__
      - This article in particular (at least from my view point) was a good a read. Codd elegantly outlined the importance and imminent reality of seperating the user from rapidly changing phenomena that occurs when considering stored data.
