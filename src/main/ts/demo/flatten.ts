const words = ["aap", "noot", "mies"];

const result = words.map(s => s.split(''));
console.log(result); // Outputs: [ [ 'a', 'a', 'p' ], [ 'n', 'o', 'o', 't' ], [ 'm', 'i', 'e', 's' ] ]

const letters = words.map(s => s.split('')).flat();
console.log(result); // Outputs: ['a', 'a', 'p', 'n', 'o', 'o', 't', 'm', 'i', 'e', 's']
