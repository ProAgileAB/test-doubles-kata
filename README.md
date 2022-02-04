# test-doubles-kata
kata to learn and practice on test doubles and how they relate to the complexity of the code that is being tested

This kata is quite big, if you feel like it, I can recommend running it twice, focusing on Spy, Fakes, and Mocks first and then again with focus on Dummies, Stubs and Fakes.


## Suggested 4c model structure of a Samman Coaching Learning Hour
If your not into [Samman Coaching](https://sammancoaching.org) you may use this as you wish just practise different way to stub and spy on the example implementations of the FizzBuzz kata found [here](https://sammancoaching.org/kata_descriptions/fizzbuzz.html)

### Connect
This Connect is quite hard, and if the participants already know the answer they might actually know too much already for the subject. Make it clear to the participants that they don't need to get it right, only that it should activate their brain and make them think about the subject at hand. If it helps you can recommend them to answer with a funny emoji instead of the ones suggested if they rather do that then try.

Ask participants to connect dhe different types of Test Doubles with the statements below, you can do this using emojis as in the example or with any other "connect" tool you like. Here are the example emoji and statements:

Test Double 🦸‍♀️, Spy 🕵️‍♀️, Fake 🌳, Stub 🔚, Dummy 🎎, Mock 💩

 * is a stand in for a unit of code dependency during test
 * answers question like “did someone call you”
 * acts as a real implementation, but simplified
 * returns hardcoded answers
 * does nothing
 * crashes the test if used incorrectly by the system under testTest Double

### Concept

Generally there are two reasons to use test doubles in your tests.
 1. You need to "remove" a real dependency because it is slow, does not exist or has a side effect that is not wanted during testing.
 2. Your system under test is hard to verify from its output. Maybe the function returns nothing and has no "out parameters".

From these reasons you can select one or more of the types of test doubles to use as dependencies for your system under test. Technically something can both be a Spy and a Stub so don't be too strict.

The Test Doubles that can help with asserting are the Mock, Spy and Fake. The Mock is a dependency that during the tests Arrange (reade more about Arrange, Act, Assert and Annihilate) get defined and how it should be interacted with. During the Act it them blows up if its used incorrectly. A Spy remembers all calls, and you can interrogate it in the Assert phase of the test what calls happened oin what order. Fake functions as a real dependency in as many aspects as you feel is valuable. It could be an in-memory database instead of a full-blown database server. Since you can implement any external interface you like for a fake, it means that you also can inspect it afterwards and check its state to assert that the test ran correctly.

The Test Doubles that helps with limiting how your test is connected to the rest of the system and the world are the Dummy, Stub and Fake. The dummy object is a dependency that has no logic, it can sometimes be the ``null`` value of the language and somethings just an empty implementation of an interface or protocol. A stub is a bit smarter, it returns hardcoded values, and can sometimes give a specific value depending on what parameters was given to it. But in general a stub don't contain an internal state. Fakes was already described in the section above.

### Concrete Practice

use one of the codebases below
 * [kotlin](kotlin)

Ask the participants to read all the code in the production code (not the solutions that exists in the test folder). While reading, they should find which code they think will be easiest to test, and if they have an idea on what type of test double that are needed to test the code in front of them. 

When everyone has had time to do this on their own, or in pairs if you think it might be too hard for them alone. Ask the group which one was easiest and then as a group write tests for that example (you only need to write 1 or two tests). Then either continue as a group or split up in pairs and do the others.

There is also finished solutions which the group can read through in order of which they think would be simplest, if time is short or the group is not so experienced developers.

### Connect

let every one write down on their own learnings, and answers to these questions let them after share in pairs with another participant.

 * How does code complexity affect what test doubles you need to use?
 * Do you need a test framework to use test doubles?
 * What are some tells that a function need to be tested with a Spy (or mock)?
 * What are some tells that it is a good idea to use a stub for a testcase?