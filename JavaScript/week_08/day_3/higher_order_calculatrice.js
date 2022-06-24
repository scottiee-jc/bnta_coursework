const sum = (n1, n2) => {
    console.log(n1 + n2);
}
const substract = (n1, n2) => {
    console.log(n1 - n2);
}
const doCalculatrice = (n1, n2, callback) => {
    callback(n1, n2);
    
}
doCalculatrice(10, 20, sum);
doCalculatrice(10, 20, substract);

// can now do a multiplication method in this simpler way
doCalculatrice(10,20, (n1,n2) =>{
    console.log(n1 * n2);
});

// instead of assigning a clunky if statement to our calculation method 
// we can insert a callback statement instead to call other methods

// if(operation === "sum") {
    //     sum(n1, n2);
    // } else if (operation === "substract") {
    //     substract(n1, n2);
    // }