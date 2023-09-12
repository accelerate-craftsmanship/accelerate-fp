# Recursion exercises

## Fibonacci

The fibonacci sequence is a sequence of numbers where each number (except (obviously) the first two)
is the sum of its two predecessors. The first two numbers are 1 and 1.

So, the first 11 number of the sequence are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89.

Write a recursive function to generate a fibonnaci sequence of given length.

## Interest

When you put money on a savings account, it grows every year depending on the current interest rate.
Write a recursive function that, given a start value, start year and a list of interest percentages,
returns a list of yearly results:
each element in the list should be a list of a year and the value of the savings account at the end of that year.

For example, when the start value is 1000, the start year is 2000 and the interest rates of 2000 and 2001 where 5 and 7,
the result should be (formatted for readability):

```
[
  [ 2000, 1050 ],
  [ 2001, 1123.50 ]
]
```

