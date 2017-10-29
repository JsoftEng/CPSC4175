# Assignment 10
## CPSC 4175 - Software Engineering
## John Johnson

1. __In building a software product, the book identifies two kinds of planning that must occur. Name the two types and give two examples of each.__
    - __Type 1:__ Initial Planning (done after completion of SRS)
      - __Example 1:__ Cost and duration estimation (prior to design)
      - __Example 2:__ Project size estimation
    - __Type 2:__ Endured Planning (done through project)
      - __Example 1:__ Comparison, at each stage, of the project metrics (size, budget, time) to initial estimates
      - __Example 2:__ Resource management
2. __What does figure 9.1 tell you about the range of cost estimates during the various workflows of a software project? Be specific as to the percentage of uncertainty at each of the four workflows shown on the X axis of the chart.__
    - It is evident from that figure that cost estimation becomes more accurate as the development of the project progresses. The graph indicates that the closer the development team is to the implementation of the product, the more accurate a prediction can be given with regard the cost of development.
3. __The book identifies two different kinds of costs associated with building a software product. Identify the two kinds of costs, and for each give two examples.__
    - - __Type 1:__ Internal Cost (cost to developers)
      - __Example 1:__ Employee salaries
      - __Example 2:__ Resource costs (hardware, software)
    - __Type 2:__ External Cost (the price that the client will pay)
      - __Example 1:__ Relative to internal cost + profit margin
      - __Example 2:__ Economic factors dictate in some cases dictate external cost
4. __The book lists six reasons why the LOC (lines of code) metric may not be satisfactory. List four of them and for each, give an example (preferably from your own personal experience) showing the problematic nature of that reason.__
    - __Reason 1:__ Source code represents on a small portion of total software development.
      - __Example:__ In my experience it can sometimes be equally time consuming/taxing to determine what the client actually wants before you can start coding.
    - __Reason 2:__ Clarity of how to count lines of code could be problematic.
      - __Example:__ Consideration of code documentation could obfuscate the counting process, leading to further deliberation over the validity of productivity estimates in the presence of LOC bloated by commentation.
    - __Reason 3:__ Not all code written is part of the deliverable.
      - __Example:__ Some of the code that is written may be used to support development of the product and may not necessarily be given to the client upon delivery. Installation scripts are an example of this (in my experience).
    - __Reason 4:__ Different languages take less LOC to implement the same logic.
      - __Example:__ Writing a calculator in a language like java would consist of a considerable amount more boilerplate than if it was written in a more terse language like LISP.
5. __The function point metric is widely used. Do some independent research on function point analysis/function point estimation and write a brief summary of your research. In particular, Does there seem to be a widely accepted formula for function point estimation?__
    - Through my research I gathered that on a fundamental level, funtion point analysis is a measurement technique for determining the usefulness of particular functions to the user within a piece of software. It would appear as though the assignment of numerical values to the component which indicate the size/complexity are a common method in function point estimation.
6. __The book references IEEE-158. This standard has been superseded by IEEE-16326. I have placed a
copy of IEEE-16326 in the SWE directory of my Github repository for CPSC-4175. Select one major
subsection of subsection 5 (Elements of the project management plan) and write a brief discussion of that major subsection. Choose whatever item interests you.__
    - __Clause: 5.9__
      - This clause is a good reference point for determining the logistics of auxiliary planning documents outside of the main PMP. Documents such as the SEMP and SDP would fall into this category and thus this clause would be the appropriate location of placement.
7. __The book notes that, for every 100 hours developers spent on implementation, they spent 150 hours on activities related to documentation. Give some thought to your project in this class, and state some practices and/or guidelines you may adopt in an effort to generate appropriate documentation for your project. As you will discover when you work as a developer, in many cases, a failure to document your efforts is tantamount to a failure to complete the project.__
      - Given the the current complexity of our project and the ultimate goal that we are attempting to achieve, the appropriate steps toward generating useful documentation for our project would have to consist of proper defect tracking and version control.
8. __Why do you think a user would conclude that you did not write a piece of software if you did not document the software?__
    - Just as an artist signs their work after completion, a software engineer does the same with proper documentation. Once a product is delivered, without the proper documentation it can be difficult to determine (especially on the technical level) how the product fuctions, if it performs according to specifications or even who wrote it.
