# Requirements Document
Group Members: Devon Moulter, John Johnson  
Date: August 18, 2017  
Application Title: Online Messaging System

## Purpose:
Online application that allows users to create an account, send & recieve messages, 
post statuses and so on.

## Program Procedures:
The user can either sign up for an account by providing necessary information--such as a username,
password, and e-mail address--or sign into a pre-existing account using the correct log-in information.
Once the user is signed in, he/she can send & recieve messages to other users and post statuses.

## Algorithms, Processing, and Conditions:
- At the site's home page, the user can select to sign into a pre-existing account or create a new account.
- If the user chooses to create a new account, he/she is taken to a form where he/she can enter necessary
information--such as a username, password, and e-mail address.
- Information for a new account is checked against a database to ensure it does not already exist.
- If the provided information for a new account is acceptable, the information is added to the database
and the user is automatically signed in.
- If there is any problems with the user-provided information--such as the information already being in use
or the user not filling in a required field--the system provides an appropriate error message.
- When signed in, the user is taken to their home page, which shows their posts and status-updates.
- While at their homepage, the user can create posts, update his/her status, see how many private messages
he/she has, and search for other users.
- The user can create a new post on his/her homepage by clicking the "New Post" button.
- After clicking the "New Post" button, he/she is taken to another page where he/she can enter text
and upload pictures (and possibly videos/music?). The user can send the new post to their homepage
by clicking the "Submit" button or cancel by clicking the "Cancel" button.
- When clicking the "Cancel" button, a window asking the user if he/she truly wishes to cancel should appear.
The user can click "Yes" to return to their homepage or click "No" to continue editing the post.
- The steps for updating statuses will be similar to creating a new post, but editing statuses will use
a simplified window (no pictures/videos etc. and limited text space).
- The user can check his/her private messages by clicking the appropriate button/icon on their homepage.
Doing this sends the user to a new page that shows a list of messages (or at least the first phrases of
messages) as well as the names of the users who sent the messages and message subjects (if subjects are
provided).
- The user can read a message by double-clicking on the message information in the displayed list. The user
can also delete messages by clicking the "Trash" button.
- Clicking the "Trash" button causes check boxes to appear before every message. The user can check these
boxes to mark the corresponding messages for deletion.
- While deleting messages, the user can click the "Finished" button to delete all the checked messaged or
the "Cancel" button to stop deleting without removing messages.
- While viewing a message from another user, the user can reply to the message or delete it.
- At the homepage, the user can search for other users using a seacrhbox.
- When seacrhing for other users, the site looks through the database for usernames that are at least
similar to the what the user entered in the seacrh box. The user is then taken to the compiled list of
users, where he/she can click on another user's name to go to that user's homepage.
- When on another user's homepage, the user should not be able to edit the user's account, but may view that
user's posts and status as well as replying to posts by clicking the "Reply" button under a post.
- The steps for replying to a post will be similar to creating a post on the user's own homepage, but the
user should also be able to see the original post while editing.
- The user can send private messages to a user by clicking a "Send PM" button on that user's homepage.