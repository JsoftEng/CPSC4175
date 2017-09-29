# Assignment 6
## CPSC 4175 - Software Engineering
## John Johnson

1. __Consider the programming languages you may have studied and their differences. Think of two problem domains you would use for each language. For each problem domain, explain why your choice of the other language would be a poorer choice for an implementation language.__
    - Two langauges that come to mind that I have utilized are ___assembly___ and ___lisp___.
      - __Assembly Domain:__ I would consider programming the functionality of a microprocessor within the domain of assembly. Microprocessors must operate fast and efficiently, thus a language that has unique control over the system's resources allowing for fast computations (register manipulation) would be ideal. The overhead introduced in an attempt to provide the same functionality with lisp (memory addressing, compilation time, etc...) if it's possible would outweigh the benefit of code readability.
      - __Lisp Domain:__ AI (and possibly anything other than RTOS development) would be an ideal domain for lisp as opposed to assembly. One big factor in the advantage that lisp has over assembly is that of recursion. Recursion plays an insurmountable role in artificial intelligence and automata theory.
2. __Give some concrete counter-examples of good programming practices as discussed in the book. These include meaningful variable names, self documenting code, symbolic constants, and code layout. In other words, give examples of what not to do.__
    - Examples of bad programming practices are as follows:
      - ambiguous variable names
        - _var x, y <- ambiguous_
      - sphagetti code
        - _goto statements_
3. __Give two versions of coding standards for subprocedure blocks. This may require an internet search. Which do you prefer, and why?__
    - __Lisp:__  
            (defun foo (A &optional B &optional))
    - __Java:__  
        public static void foo(int A, float B){
            //TODO
        }
        - My preference lies with java. Althought the declaration of a function in lisp appears to be more elegant and succint, the overdose of parentheses was never appealing to me.
4. __An informal description of the DRY principle is this: "The second time you write exactly the same code, stop what you are doing and place that functionality in a subprocedure. Then, invoke the subprocedure whenever you need that functionality." Give one example of this from your previous programming experience. If you have never experienced this in practice, make up an example.__
    - This is an example from one of the automation programs that I've designed at my job, however it's something that I do frequently wherever it's necessary. Whenever I have to connect to a database I generally create subroutines that open/close the connection. This reduces code obfuscation in my experience and also saves a little bit of time coding the next SQL statement execution.
5. __What is a stub? What is a driver? Have you ever used stubs or drivers in your previous programming experience? If so, give an example. If not, consider a function that takes a unit price, a sales tax rate, and the quantity ordered, and write a stub (using pseudo code or a language of your choice) that takes these three arguments and returns a value.__
    - __Stub:__ A stub is an unsubstantiated element of code (method, class, etc...).
    - __Driver:__ A driver is an element of code which calls another code element multiple times to test output.
      - Here's pseudocode of the above scenario:  
            exStub(unitPrice, taxRate, quantity){
                print unitPrice
                print taxRate
                print quantity
            }
6. __List two strengths and one weakness of top down integration.__
    - __Strength:__
      - STR 1: _Fault isolation_
      - STR 2: _Preemptive design flaw detection_
    - __Weakness__
      - WEAK 1: _Inadequate testing of reusable code_
7. __List two strengths and one weakness of bottom up integration.__
    - __Strength:__
      - STR 1: _Fault isolation_
      - STR 2: _Thorough testing of operational artifacts_
    - __Weakness__
      - WEAK 1: _Late design flaw detection_
8. __This is not in the book and will require some independent research. A domain specic language (DSL) is a small, incomplete language typically used as a "glue" language between a lower level language (like C) and a higher level language (like Python). An example of a DSL might be a helper language for HTML, e.g. div(...) might resolve to '<'div> ...</div'>'. How might a DSL promote what the book calls sandwich integration? This is not a trick question but it will require some thought. If you work as a developer, you will eventually write your own DSLs for various purposes.__
  - Generally the higher level modules (front end) of a software package are implemented using a higher level language like java or python, whereas the lower level modules (back end) are implemented in a lower level language like C to promote efficiency. Since a DSL facilitates the transformation of complex code fragments of a higher level language and a lower level one, it can be inferred that an integration process that incorporates both top and bottom perspective testing (sandwich) could benefit from the utilization of this concept.
9. __What is the difference in testing carried out by the implementation group and the testing carried out by the SQA group.__
  - Testing done by the implementation group is considered ___unit testing___, a preliminary phase of testing done simultaneously with the implementation of code artifacts. Upon successful completion of this phase of testing the code in question in submitted to the SQA team for further testing.
10. __Read the letter by Edgar Dijkstra to the Communications of the ACM (in the PDF directory as dijkstra68.pdf) and write a one paragraph appreciation of this letter__
  - The goto statement is essentially like a double-edged sword in programming. Dijkstra outlines the potential adverse consequences that accompany excessive use of the goto statement. The letter, albeit overtly technical in prose, beautifully portrays the inevitable detriment of exposing oneself to the sharp end of the sword.
