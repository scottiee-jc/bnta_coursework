const Footballers = require('./footballers').default;

class Club {
    constructor(name){
        this.name = name;
        this.Footballers = null;
    }
    intro(){
        console.log(`This is ${this.name}`);
    }
    
    addFootballer(newFootballer) {
        this.Footballers = newFootballer;
    }
}

// nothing changes in terms of how we call the method or the output


const liverpool = new Club("Liverpool FC");
liverpool.intro();
console.log(liverpool);

const mo_salah = new Footballers('Mo Salah', 31, 11);
liverpool.addFootballer(mo_salah);
console.log(liverpool);