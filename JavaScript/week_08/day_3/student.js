const Student = function (name) {
this.name = name;
}

// nothing changes in terms of how we call the method or the output
Student.prototype.greet = function(){
    console.log(`Hello, my name is ${this.name}`);
}



// instantiate new Student object -  without delcaring it new, 
// it will return undefined.

// this.greet WITHIN the constant Student function means that 
// each object we create will have its own greet method
// it takes the name specified in the new student object 
// BUT this way is inefficient from the memory perspective

const scott = new Student("Scott");
scott.greet();
const bobby = new Student("Bobby FIRMINO");
bobby.greet();