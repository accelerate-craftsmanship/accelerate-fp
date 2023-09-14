// js/ts syntax cheat sheet

function sum1(a: number, b: number): number {
    return a + b;
}

// same as above as arrow function

const sum2 = (a: number, b: number) => a + b;

// same but with type definition

const sum3: (a: number, b: number) => number = (a, b) => a + b;
