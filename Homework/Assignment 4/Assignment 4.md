# Assignment 4
## CPSC 4175 - Software Engineering
## John Johnson

1. __What is an__ ___entity___ __class? A__ ___boundary___ __class? A__ ___control___ __class?__
  - __Entity Class:__ Models the "long lived" elements of a software system
  - __Boundary Class:__ Models the interactions between the actors and the software system
  - __Control Class:__ Models the complex computations/algorithms of the software sytem
2. __Write a__ ___use case___ __pertaining to your program.__
  - [Insert Link Here]
3. __Write a__ ___successful scenario___ __pertaining to your project.__
  - __Normal scenario__
    - User logs in.
    - User ___updates status.___
    - User logs out.
4. __Write a__ ___unsuccessful scenario___ __pertaining to your project.__
  - __Exception Scenario__
    - User A logs in.
    - User A ___searchs for users.___
    - The user list generates.
    - User A selects User B.
    - User A ___sends a message___ to User B, User A intended to select User C.
    - User A ___cancels.___
    - User A selects User C.
    - User A ___sends a message___ to User C.
    - User A logs out.
5. __Using your answers to the three previous questions, use the__ ___noun extraction___ __method to extract the classes. If practicable, identify the classes you extract as entity, boundary, and control classes. If all your classes are entity classes, you will not be able to do this.__
  - __Entity Classes:__ User, Private Message, Post
  - __Boundary Classes:__ Message Feed
  - __Control Classes:__ Search User
6. __Using your answer to the previous question, draw an appropriate__ ___class diagram.___
  - [Class Diagram|Message System Class Diagram.pdf]
7. __Complete a CRC card for one of your classes.__
  - [Insert Link Here]
8. __Draw a__ ___statechart___ __for one specific behavior of your project.__
  - [Insert Link Here]
9. __Draw a__ ___communication diagram___ __for one specific realization of a use case.__
  - [Insert Link Here]
10. __Draw a__ ___sequence diagram___ __for one specific realization of a use case.__
  - [Insert Link Here]
