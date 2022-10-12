// Functions 

function addNumbers(num1, num2) {
    var addition = num1 + num2;
    return addition;
}

var result1 = addNumbers(10, 10);
var result2 = addNumbers(7, 3);

console.log(result1);
console.log(result2);

var person = {
    name: "jesus",
    age: 2000,
    isChickenDinna: true
};

console.log(Object.values(person));
console.log(Object.keys(person));

