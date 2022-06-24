let numbers = [1, 2, 3, 4, 5];

const numbersSquared = [];
// numberToPrint is constant, so if you try to reassign it, itll throw an error
// the value being stored 
// numbersSquared doesnt include any of the number values
// when we push values into it 
// the contents of the array are modifiable, not the array itself - we arent replacing it because its CONSTANT

// let -- 
for (let number of numbers) {
    numbersSquared.push(number ** 2);
}

console.log(numbersSquared)
