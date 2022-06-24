class Footballers {
    constructor(name, shirtNum, goals){
        this.name = name;
        this.shirtNum = shirtNum;
        this.goals = goals;
        }
        greet(){
            console.log(`Hello, my name is ${this.name} and my shirt number is ${this.shirtNum}`);
        }
        goalsScored() {
            console.log(`I have scored ${this.goals} goals this season`);
        }
    }
    
    // nothing changes in terms of how we call the method or the output
    


   export default Footballers;
