const numbers = [1,2,3,4,5];

const otherNumbers = [...numbers];
// spread operator ...
// allows otherNumbers to have its own array identity in memory
// any changes to otherNumbers aren't made in numbers and vice versa

const [firstNumber, secondNumber, ...remainingNumbers] = numbers;
//destructuring lets us pick out three variables - firstno secondno and remainingnos

otherNumbers.push(6);
// adds 6 to end of array
numbers.shift();
// removes first element (1)

// console.log("first no destructured:", firstNumber);
// console.log("second no destructured:", secondNumber);
// console.log("otherNumbers:", remainingNumbers);


// useful tool for taking an array and pulling out individual values
// i.e. destructuring 

const person = {
    name: "scort",
    age: 23,
    homeTown: "powys",
    favColours: ["red", "green", "blue", "black", "white"],
    favTeam: "liverpool"
}

const {name, age, homeTown, favColours, favTeam} = person;

// console.log(name);
// console.log(homeTown);
// console.log(favColours);

const [favourite, secondFav, ...leftovers] = favColours;

// console.log(favourite);
// console.log(secondFav);
// console.log(leftovers);

let myVar = "hi"

let newString = myVar;

newString += " world"

console.log(myVar);
console.log(newString);



