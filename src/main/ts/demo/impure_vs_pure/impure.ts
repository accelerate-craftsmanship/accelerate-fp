// Impure function with side effect (modifying external state)
let total = 0;

function addToTotal(x: number): number {
    total += x;
    return total;
}

// Impure function with non-deterministic behavior (uses Math.random())
function getRandomNumber(): number {
    return Math.random();
}

// Impure function with side effect (console.log)
function logMessage(message: string): void {
    console.log(message);
}
