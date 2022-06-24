const numbers = [1,2,3,4,5];

// can use this instead of just console.log(numbers[i])
const printElement = (arrayElement) => {
    console.log(arrayElement);
}

// for (let i = 0; i < numbers.length; i++){
//     printElement(numbers[i]);
// }


// STEP ONE: FOR EACH method
// for each method executes a provided function once for each array element

// one way... pass the printElement method

// numbers.forEach(printElement);

// OR... create the function in the for each method (instead of having the printElement method)

// numbers.forEach((arrayElement) => {
//     console.log(arrayElement);
// });


// STEP TWO: MAP method

// one way... returns them in list form

console.log("");
console.log("Return numbers multipled by two in list form");
console.log("");


numbers.map((arrayElement) => {
    console.log(arrayElement * 2);
});

// second way... returns them in array form [ 2, 4, 6, 8, 10 ]

console.log("");
console.log("Return numbers multipled by two in array form");
console.log("");

const doubledNumbers = numbers.map(n => n * 2);
console.log(doubledNumbers);


// squared
console.log("");
console.log("Squared numbers.");
console.log("");
numbers.map((arrayElement) => {
    console.log(arrayElement * arrayElement);
});

//exponents - cubed
console.log("");
console.log("Cubed numbers.");
console.log("");
const cubed = 3;
const cubedNumbers = numbers.map(n => n ** cubed);
console.log(cubedNumbers);

//exponents - power of 5
console.log("");
console.log("Numbers to the power of 5.");
console.log("");
const powerOf5 = 5;
const numbersToPowerOf5 = numbers.map(n => n ** powerOf5);
console.log(numbersToPowerOf5);

// Filter the original array to have even numbers only.
console.log("");
console.log("Filter the original array to have even numbers only.");
console.log("");
const evenNumbers = numbers.filter(n => n % 2 == 0);
console.log(numbers);
console.log(evenNumbers);

// Filter the original array to have odd numbers only.
console.log("");
console.log("Filter the original array to have odd numbers only.");
console.log("");
const oddNumbers = numbers.filter(n => n % 2 == 1);
console.log(numbers);
console.log(oddNumbers);


// Filter the original array to have odd numbers only.
console.log("");
console.log("Reduce the original array to the sum of 1 + 2 + 3 + 4 + 5.");
console.log("");
const initialValue = 0;
const sumWithInitial = numbers.reduce(
    (previousValue, currentValue) => 
    previousValue + currentValue, initialValue
);
console.log(sumWithInitial);

//pass two arguments to the reduce method
// 1. the previousValue + currentValue (takes previousValue in array and adds it to the next in line)
// 2. the initial value