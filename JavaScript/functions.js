"use strict";

let addition = function(a, b) {
    return a+b;
}

let multiplication = function(a, b) {
    return a*b;
}

let subtraction = function(a, b) {
    return a-b;
}

let division = function(a, b) {
    return a/b;
}


function calculation (a,b, calculationType) {
    return calculationType(a,b);
}

let output = calculation(10, 30, addition);
console.log("Addition output = ", output);