# Make it pure

Look at [CountSourceLines.java](CountSourceLines.java) and [it's test](../../../test/java/ex_pure/CountSourceLinesTest.java).

Discuss with your pairing partner what you need to do to make this pure, what side effects do you see?

Refactor the code to use pure functions as much as possible. The tests should stay green and cannot be changed.

Tips:

- Split the pure logic and the side effects into separate methods.
- No longer use a for loop, but a stream with a predicate.