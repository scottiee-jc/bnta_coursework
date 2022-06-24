// Create a Dealership class. It should have properties representing its name, 
// maximum number of cars it can have and the cars currently in stock.
const cars = require('./cars').default;

class Dealership {
    constructor(name, max_cars, current_stock) {
        this.name = name;
        this.max_cars = max_cars;
        this.current_stock = current_stock;
        this.cars = null;
    }
    count(numberOfCars){
        this.cars = numberOfCars;
    }
}

// Add methods to Dealership too:
// Count the number of cars in stock
// Add a car to stock
// Return an array containing each car's manufacturer
// Find all the cars from a given manufacturer
// Find the total value of all the cars in stock
// Write tests for Dealership's methods.