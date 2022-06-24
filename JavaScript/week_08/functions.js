// Named function

// const greeting = ()

function greet(timeOfDay, name){
    console.log(`Good ${timeOfDay}, ${name}!`);
}

//Anonymous functions

// we can take a function and pass it into another function
// these are called 'higher order functions'
// there are also functions that return functions!

const sum = function (number1, number2){
    return number1 + number2;
}

// const total = sum(1,2);

console.log(sum(1,2));


// TYPE 3: the arrow function 0o0


const multiply = (number1, number2) => {
    return number1 * number2;
}

const product = multiply(4,5);



console.log(product);