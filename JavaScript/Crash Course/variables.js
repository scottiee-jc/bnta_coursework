// variables...
// can store numbers, booleans, strings, or objects
// can store empty variables as undefined


var name = "Maria Jones";
var age = 25;
var hasDriverL = true;
var empty = undefined;
var balance = 100.32;
var dob = new Date(2000, 1, 30);
//nothing inside the variable


var person = {
name: 'scott',
age: 23,
hasDriverL: false,
address: {
    firstLine: "2 millbeck",
    postCode: 'LA8 0BD',
    country: 'England'
}
};


// Naming variables

/*
Variable names
- cannot contain spaces
- must begin with:
... a letter
... a number
... an underscore
... a dollar sign
- names are case sensitive
- cannot use reserved keywords (e.g. const, function, case, catch)
*/


var brand = "protein bor"
console.log(typeof brand)
// will print out the data type
console.log(brand.length)
// will print out the length of the string
console.log(brand.toUpperCase())
// will print out the name to an upper case variant
console.log(brand.substring(0,7))
// starts at index 0 and stops at 7


// concatonated variables... 

var a = "protein"
var b = " bor"
console.log(a + b)
console.log(`${a} ${b.toUpperCase()}`)


// an object

var club = {
    name: "liverpool",
    founded: 1892,
    isTheGOAT: true,
    owner: 'FSG',
    bestPlayer: 'Mo Salah',
    players: {
        goalkeepers: ["Alisson", "Kelleher", "Adrian"],
        defenders: ["Gomez", "Alexander-Arnold", "Van-Dijk", "Matip", "Robertson", "Ramsay", "Tsimikas", "Konate"],
        midfielders: ["Henderson", "Thiago", "Fabinho", "Carvalho", "Elliot", "Oxlade-Chamberlain", "Keita", "Milner"],
        forwards: ["Salah", "Diaz", "Nunez", "Jota", "Firmino", "Gordon"]
    }
};


console.log(club);