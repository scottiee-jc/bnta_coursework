class car {
    constructor(manufacturer, price, engine_type) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.engine_type = engine_type;
    }

}

export default car;

// Set up Jest and write tests to make sure you can access
// each of those properties in a Car object.

// Create a Dealership class. It should have properties representing its name, 
// maximum number of cars it can have and the cars currently in stock.
// 
// Add methods to Dealership too:
// Count the number of cars in stock
// Add a car to stock
// Return an array containing each car's manufacturer
// Find all the cars from a given manufacturer
// Find the total value of all the cars in stock
// Write tests for Dealership's methods.