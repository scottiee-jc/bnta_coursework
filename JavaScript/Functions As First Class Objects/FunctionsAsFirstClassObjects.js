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

let outPOOT = calculation(10, 30, multiplication);
console.log("Multiplication output = ", outPOOT);

let outPOnT = calculation(10, 30, division);
console.log("Division output = ", outPOnT);


let fxRates = {
    INR: 72,
    EUR: 0.9
}

let discounts = {
    INR: 0.1,
    EUR: 0.2
}

let inCart = {
    id: 1,
    total: 81000,
    currency: "INR"
}

let euCart = {
    id: 2,
    total: 772,
    currency: "EUR"
}


// CREATE A FUNCTION THAT WILL ACCEPT A CART AS AN INPUT AND WILL APPLY DISCOUNT ON THE CART DEPENDING ON THE REGION / FXRATES
// RETURNS THE VALUES AS A TOTAL EXPRESSED IN USD

function getTotalPriceFn(cart){

    cart.finalTotal = cart.total * (1 - discounts[cart.currency]);

    // total of the cart stored in terms of local currency (1 - the discounted rate - either 0.9 or 0.8)

    function totalUSDPrice(){
        return cart.finalTotal / fxRates[cart.currency];
    }

    // this function calculates the USD price using the fxrates to the final total value as expressed using the region discount.

    return totalUSDPrice;
}

let inCartTotalUSD = getTotalPriceFn(inCart);
console.log("Type of returned function: ", typeof inCartTotalUSD);

// will return in the console that the data type is a function, which alludes to its treatment as a first class member

// now to apply the discounts

console.log("Total of order from India: ", inCartTotalUSD());

let euCartTotalUSD = getTotalPriceFn(euCart);
console.log("Total of order from Europe: ", euCartTotalUSD());