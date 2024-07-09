# Task Master Background Research

Preparatory research and data collection has been done on Task Master to support the quality assurance process.
This is an executive summary, aimed specifically to support the creation of the testing strategy.

## User stories

| Id | User story                                                                                                        |
|----|-------------------------------------------------------------------------------------------------------------------|
| 1. | As a User, I want to choose my own username and password so that my credentials are personalized.                 |
| 2. | As a User, I want to log in so that I can manage my tasks securely.                                               |
| 3. | As a User, I want to add, view, edit and delete tasks so that I can keep my todo list uptodate.                   |
| 4. | As a User, I want to see my own tasks and no other users' tasks so that my task list is private and personalized. |
| 5. | As a User, I want to see a responsive user interface so that I can use the app across different devices.          |

## Formal requirements

- Industry-specific requirements:
    - Data security according to GDPR
    - Users must have control over their data
- Software craftsmanship requirements:
    - 90% unit test coverage
    - Dev documentation (basic information about the application)
    - Clean and supportive user interface

## Application history

Task Master has not been publicly released yet.
We have made it available as a free-to-try Beta version, to a small set of people (appr. 250) who are loyal users of our
flagship product (which is a desktop email client application, called Mail Master).

The following issues came up during the three-months trial period:

| Issue id | Description                                                                       | Status           | 
|----------|-----------------------------------------------------------------------------------|------------------|
| C4367    | User cannot see under what username they are logged in                            | Resolved         |
| C7433    | User would find it useful if they could order the tasks by creation date          | Added to backlog |
| C3111    | User would like to delete their account                                           | Done manually    |
| C1615    | User can see other users' tasks by adding `?user=<userId>` to the URL             | Resolved         |
| C2023    | User forgot their password and wanted to see their tasks under a new registration | Done manually    |
| C4129    | When adding a new task, I can see its contents in the URL                         | Resolved         |
| C3871    | User can register with an incorrectly formatted email address                     | Resolved         |

## Business context

- Business goal of this project: To offer an extension to Mail Master so that users don't have to use products from our
  competitors
- Mail Master is known for information safety on the market
- Pricing: When purchased together with Mail Master, will cost only 10% extra
- Budget: Strict, may be negotiated if public release is successful
- Plans for the near future:
    - Marketing campaign starting next month
    - First public release in 90 days
    - One-month release cycles after public release

