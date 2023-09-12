#!/usr/bin/env node

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function isEven(x) {
    return x % 2 === 0;
}

function sum(arr) {
    return arr.reduce((acc, current) => acc + current, 0);
}

const evenNumbers = numbers.filter(isEven);
const result = sum(evenNumbers);
console.log(result); // Outputs: 30