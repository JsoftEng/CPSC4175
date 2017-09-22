# __Software Requirements Specification [V2.0]__
### __Messaging System__
##### ___[John Johnson, Devon Moulter]___


### Introduction
1. Introduction
    - 1.1 Definitions, Acronyms and Abbreviations
2. Overall Description
3. Specific Requirements
    - 3.1 - Functional Requirements
      - 3.1.1 User Class 1 - The User


#### 1. Introduction
   - __1.1 Definitions, Acronyms and Abbreviations__
    - __DESC__ - _Description_
    - __RAT__ - _Rationale_
    - __DEP__ - _Dependencies_

#### 2. Overall Description

#### 3. Specific Requirements
  - __3.1 Functional Requirements__
    - __3.1.1 User Class 1 - The User__
      - ___3.2.1.1 Functional Requirement 1.1___
        - __ID: FR1__
        - __Title:__ Sign Up
        - __DESC:__ The system shall enable the user to specify personally identifiable information to be used as login credentials and identifying criteria during program execution.
        - __RAT:__ Neccessary for users to login.
        - __DEP:__ None
      - ___3.2.1.2 Functional Requirement 1.2___
        - __ID: FR2__
        - __Title:__ User Login
        - __DESC:__ The system shall enable the user to login using credentials specified during the sign up phase.
        - __RAT:__ Neccessary for users to utilize core functionality of messaging system.
        - __DEP:__ FR1
      - ___3.2.1.3 Functional Requirement 1.3___
        - __ID: FR3__
        - __Title:__ User Logout
        - __DESC:__ The system shall enable the user to log out of the user interface, disabling access to core functionality of messaging system.
        - __RAT:__ Enables users to safely disengage from application when utilizing messaging system on non-trusted devices.
        - __DEP:__ FR2
      - ___3.2.1.4 Functional Requirement 1.4___
        - __ID: FR4__
        - __Title:__ View Private Messages
        - __DESC:__ The system shall enable the user to view private messages in a list format as well as individually. The list format shall present the private message(s) with emphasis placed on the message ___subject___, ___sender___ and possibly a snippet of the message ___body___. The individual format shall present a private message with all qualifying criteria present to the maximum allowable extent.
        - __RAT:__ Enables users to view messages received from other users.
        - __DEP:__ FR1,FR2
      - ___3.2.1.5 Functional Requirement 1.5___
        - __ID: FR5__
        - __Title:__ Send Private Message
        - __DESC:__ The system shall enable the user to send private messages to other users of the application.
        - __RAT:__ Enables users communicate with each other privately.
        - __DEP:__ FR1,FR2
      - ___3.2.1.6 Functional Requirement 1.6___
        - __ID: FR6__
        - __Title:__ Create Chat Room
        - __DESC:__ The system shall enable the user to communicate with other users participating in a chat room.
        - __RAT:__ Enables users communicate with each other directly through chat room system.
        - __DEP:__ FR1,FR2
      - ___3.2.1.7 Functional Requirement 1.7___
        - __ID: FR7__
        - __Title:__ Join Chat Room
        - __DESC:__ The system shall enable the user to join available chat room(s).
        - __RAT:__ Enables users join chat rooms.
        - __DEP:__ FR1,FR2
      - ___3.2.1.8 Functional Requirement 1.8___
        - __ID: FR8__
        - __Title:__ Leave Chat Room
        - __DESC:__ The system shall enable the user to leave current chat room.
        - __RAT:__ Enables users leave their current chat room.
        - __DEP:__ FR1,FR2,FR7
      - ___3.2.1.9 Functional Requirement 1.9___
        - __ID: FR9__
        - __Title:__ Send Chat Message
        - __DESC:__ The system shall enable the user to communicate with other users participating in a chat room.
        - __RAT:__ Enables users communicate with each other directly through chat room system.
        - __DEP:__ FR1,FR2,FR7
      - ___3.2.2.1 Functional Requirement 2.1___
        - __ID: FR10__
        - __Title:__ Reply to Private Message
        - __DESC:__ The system shall enable the user to reply to a selected private message.
        - __RAT:__ Enables users to reply to private messages received from other users.
        - __DEP:__ FR1,FR2,FR4
      - ___3.2.2.2 Functional Requirement 2.2___
        - __ID: FR11__
        - __Title:__ Delete Private Message(s)
        - __DESC:__ The system shall enable the user to delete selected message(s).
        - __RAT:__ Enables users to delete messages received from other users.
        - __DEP:__ FR1,FR2,FR4
