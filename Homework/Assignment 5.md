# Assignment 5
## CPSC 4175 - Software Engineering
## John Johnson

1. __What are the two basic ways of designing a product? Explain what they are and how they differ.__
    - __Operation-Oriented Design__
      - Emphasis for design placed on _operations_
    - __Data-Oriented Design__
      - Emphasis for design placed on _data_
    - The difference between the two is that the OOD approach assesses the design of a product from the perspective of what ___operations___ the product will perform, whereas the DOD approach assesses the design from the perspective of the ___data___ that the product will perform operations on.
2. __What are the inputs and the outputs to the design workflow, according to the book? Briefly explain why the particular inputs are important and how they impact design. Briefly explain how the particular outputs are important and how they influence design.__
    - __Inputs:__ The Software Requirements Specification document
      - __Importance and Impact:__ The importance of an SRS is that it stands as the basis for the design process. Without it, an accurate design cannot be produced.
    - __Outputs:__ The Design document(s)
      - __Importance and Impact:__ A design document gives a visual representation of how the system is to behave based on the specified requirements.
3. __Traditionally, a computer program was seen as a data processing application. Variables were divided into three categories: input variables, output variables, and processing variables. The book describes a design process based on this paradigm that is recursive. Explain in detail how you would design a student's graduation requirements in terms of input variables, output variables, and processing variables. This is not asking for a design, but just identification of variables you might want to create and where in the design you would place them.__
    - __Input Variables:__ _Student Information, Degree Type, Graduation Application_
    - __Output Variables:__ _Degree, Concentration, Certification(s)_
    - __Process Variables:__ _Transcript, GPA_
4. __Perform a transaction analysis for the graduation requirements problem you used for the previous question. Your answer should be a sequential list of subprocedures you would design to solve the problem. Notice that the previous question called for what was, in essence, a list of nouns, while this question calls for, in essence, a list of verbs.__
    - The following list of subprocedures comprise the transaction analysis of a student's graduation requirements:
      - _getStudentInfo_
      - _getDegreeType_
      - _processGraduationApp_
      - _genDegree_
5. __Object-oriented analysis and design conceptually is seen as a grouping of objects, instantiated from classes. Classes encapsulate both states (variables, nouns) and behavior (subprocedures, verbs). Based on your answers to the two previous questions, describe__ ___one___ __class that might be appropriate for a graduation requirements application. Identify the attributes (properties) and behaviors (methods) this class might contain.__
    - __Class Name:__ _GraduationApplication_
    - __Class Properties:__ _student, degreeType_
    - __Class Methods:__ _getStudent, getDegreeType, genDegree_
6. __As discussed in the book, the design workflow can be considered an iterative, spiral process in itself. As we have been discussing in class, the design phase can be seen as part of an iterative that also includes analysis, implementation, and testing phases. The answer to this question obviously depends on the nature of the software under development, so there is no one correct answer to this question. Here is the question: Consider the software project you are working on for this class, and briefly state which view you think is more appropriate to your work. Justify your answer by making a reasonable argument as to why you answered this question the way you did.__
    - I believe that the iterative process is best suited for the development of the messaging system we chose. This process would have been suitable for any project we chose given the circumstances of the development environment and constraints, however I believe that it has been most particularly useful in the following ways:
      - _Continuous reaffirmation of the constraints and requirements for building the system._
      - _Compounded focus on system design, minimizes error in implementation._
7. __What is the difference between testing an implementation and testing a design? Write a procedure for testing the design of the student graduation requirements problem in the questions above. Define a procedure for one of the following: either a data analysis design, a transaction analysis design, or an object oriented design.__
  - Testing for an implementation vs testing for a design differs mainly in the substance of the testing. A testing of a particular design would focus primarily on whether or not the design adheres in totality to the requirements document, whereas when testing an implementation focus is brought to both requirements and design adherence.
  - __Object Oriented Design Test:__
    - testProcedure(input _GraduationApplication_) {
        - Is student valid?
          - _attribute must classify as valid_ ___Student___ _object_
        - Is degreeType valid?
          - _attribute must classify as valid_ ___Degree___ _object_
        - getStudent() = ?
          - _return type must = Type_ ___Student___
        - getDegreeType() = ?
          - _return type must = Type_ ___Degree___
        - Is degree generated by genDegree() correct?  
      }
8. __What is the cyclomatic complexity of figure 1? Explain your answer.__
  - __Cyclomatic Complexity = E - N + 2P__
    - _E = 11_
    - _N = 10_
    - _P = 1_
    - ___Cyclomatic Complexity = 3___
9. __Discuss one CASE tool you have previously used. If you have never used a CASE tool, find an open source CASE tool using an internet search, download and install it, complete a "Hello World" application, and discuss your experience.__
  - I have used a number of what could be considered "CASE" tools throughout my programming career. Most recently I have taken to the tool that you proposed ___Dia___ and it's user friendly UI. My experience with it so far has been pretty standard I suppose, it has definitly been useful in designing class diagrams for our messaging system project. I could see myself using it for larger project later on as opposed to commercial products.
10. __Read the article "the-right-stuff.pdf" in the pdf directory. (You may find a better copy online.) Write a one paragraph appreciation of the article__
  - The article was a very good read. It outlined the meticulous nature of those who aim to develop virtually error-free software while at the same time identifying the stark dichotomy that is the reality of the software market today. I was particularly surprised at the amount of preparation that goes into updating even the most minute element of their code. I believe that the standard put forth by SEI should be the focus for training future software engineers in the hopes of producing more efficient, less faulty commercial software.
