# Assignment 11
## CPSC 4175 - Software Engineering
## John Johnson

1. __Give an informal description or definition of stepwise refinement. Pretend that you are trying to explain it to your grandmother or a younger brother or sister..__
    - Consider the scenario in which you may be commissioned to construct a house. Initially your approach may be such that you deduce that the house will need a foundation, walls and a roof. After further analysis of the task at hand you ___refine___ your previous assumption so as to include certain particularities of the walls or roof. In this second refinement the door placement for the walls may be considered or perhaps a chimney hole for the roof. This process of continual refinement based on the analysis of prior assumptions is referred to as ___stepwise refinement.___
2. __Consider topdown development, stepwise refinement. We have now encountered both of these. Traditionally, software engineering was taught developing programs using the topdown, stepwise refinement
paradigm. (OOAD has replaced this paradigm.) You have probably never developed a program using that paradigm, but think about the implications of that technique versus OOAD. Discuss several of
the major differences you can think of.__
    - One major difference in particular that I notice between the two paradigms is that OOAD approaches the the development process from the persepective of ___object-oriented programming___, this is not the case for the topdown paradigm which uses a technique more akin to divide-and-conquer with varying levels of granularity dependent upon each refinement.
3. __Read the article in my PDF directory on Github by Nicklaus Wirth entitled Program Development by Stepwise Refinement and write a one paragraph appreciation of that article.__
    - As a student on the precipice of graduation I agree with the viewpoint that classes should be taught from a design standpoint (or at least integrated to some degree) instead of primarily from a "program the computer to do this" standpoint.In particular, I like the notion of a "solution tree" where each solution realized in the refinement process represented a node/leaf on the tree.
4. __In business school cost benefit analysis goes by the name due diligence. Following the example in the book, give a non-technical example of the exercise of due diligence. ("Non-technical" in the sense of a business or management decision, for example, opening a branch office or expanding a product line.)__
    - An example of due diligence could be as follows:
      - The electric car company Tesla is considering the development of a new line of family oriented vehicles as an effort to expand its consumer base. Development of the new line of vehicles estimated an a considerable growth in consumers however the cost of developing the vehicles was determined to be greater than the potential revenue earned from those additional consumers.
5. __Your book gives the following illustration: "suppose that object A contains an invocation of a method of object B. In this situation, object A cannot be reused without reusing object B as well." Please
discuss this problem and state a specific solution to the problem that advances separation of concerns.__
    - This problem is essentially that of excess coupling, if ___A___ depends on ___B___ then any change in ___B___ could potentially adversely affect A. Minimizing dependencies (encapsulation) in code implementation is an ongoing effort and potential solution to this problem.
6. __Answer one of the following two questions. Use the analytical tools you have read about in this chapter.__
    - __(A) Design a small program and write the pseudo-code that generates documentation from a source file. Input is a source listing. Output is a formatted documentation document. You documentation should document all variables by giving the visibility, type, name, and initial value, and all functions giving the visibility, type, name, and input parameters. You are allowed to require your source listings to use a particular formatting, similar to Javadoc.__  
          documentationALG(sourcefile) {
            string line
            do until sourcefile.EOF{
              if(is variable declaration){
                output.writeline (variable attributes)
                NextLine
              }
              if(is function declaration){
                output.writeline(function attributes)
                NextLine
              }
              else{
                NextLine
              }
            }
          }
7. __One very common problem, particularly with languages similar to C, is that many files must be compiled in a specific order because of (among other things) dependencies among files. For example, program.c may depend on program.h. Make files are almost universally used. Search for a brief make file example, and comment on it line by line.__
      - Consider the following example makefile:
            all:
                g++ main.cpp hello.cpp factorial.cpp -o hello
      - The above line follows the general syntax of a make file:
            target: dependencies
            [tab] system command
      - The _all_ target specifies the default target for makefiles, this particular example has no dependencies. The result of executing this makefile on the files specified is an executable.
