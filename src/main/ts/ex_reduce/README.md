# Reduce exercises

## Average

Write a function that computes the average of a list of numbers with a reduction function. Only use immutables and pure
functions!

## Histogram

A histogram is a graph that shows the distribution of values. For example, an age histogram would show how many people
are in the range 1-10, how many in the range 11-20, etc. The groups 1-10, 11-20 etc are called "buckets".

The assignment is: given a list of numbers, write a function that computes the number of numbers in each bucket.
For example, when the input is `1, 7, 23, 31, 33, 39, 55, 66, 66, 73, 99`
the output should be `2, 0, 1, 3, 0, 1, 2, 1, 0, 1` (because there are 2 numbers in the 1-10 range, 0 in the 11-20
range, etc.).