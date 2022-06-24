const sum = function(a,b){
    return a+b;
}

const isEven = function(a){
    if (a % 2 ==0) {
        return true
    } else {
        return false        
    }
}

module.exports = {sum, isEven}