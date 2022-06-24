//           --------   PROBLEM A   ---------


//                  THE CODE THAT DOESN'T WORK...
//    ---------------------------------------------------
//   | const doubleNumberAfter2Seconds = (number) => {   |
//   |     setTimeout(() => {                            |
//   |         return number * 2;                        |
//   |     }, 2000);                                     |
//   |  }                                                |
//    ---------------------------------------------------


       // define what we want it to do after accepting param 'number'
       // setTimeout is built in, puts a delay on whatever we ask it to do
       // e.g. add a pop up that expires after a few seconds
       // takes 2 args - a callback and the time in ms we want it to delay
       // if we run number * 2 with this, it will return undefined
       // this because the 2 second timer will expire AFTER js tries to complete console.log
       // JS is rapid, in the worst ways!!
       // so instead we return a new promise...




//         ------   PROBLEM B   ------



       const doubleNumberAfter2Seconds = (number) => {
           return new Promise((resolve) => {
                setTimeout(() => {
                    resolve(number * 2)
                }, 2000)
           })
       }
   

//                  THE CODE THAT DOESN'T WORK...
//    -----------------------------------------------
//   | const result = doubleNumberAfter2Seconds(5);  |
//   | console.log(`RESULT IS: ${result}`);          |
//    -----------------------------------------------
   
   // the constructor for Promise takes a callback and param - resolve
   // resolve is a predefined term - if everything goes to plan, resolve the promise with number * 2
   // node can only display [object Promise] as the result
   // need to tell JS this is an ASYNCHRONOUS promise - it needs to wait for the whole process to finish before logging
   


//         ------   SOLUTION   ------


   
    const asyncPrinting = async (number) => {
        const result = await doubleNumberAfter2Seconds(number);
        console.log(`RESULT IS: ${result}`);
    } 

    asyncPrinting(50)
// NOW, by declaring it as asyncronous, we can use the await keyword
// can ONLY use await in a function that has been declared asyncronous 
// it will now print out, after a delay, the number 10.


// 

const doubleNumberAfter2SecondsModulus = (number) => {
    return new Promise((resolve, reject) => {
         setTimeout(() => {
             if (number % 2 === 0) {
                resolve(number * 2)
             } else {
                 reject("NUMBER AIN'T EVEN CUZ");
             }
         }, 2000)
    })
}


const asyncPrintoBoi = async (number) => {
    const result = await doubleNumberAfter2SecondsModulus(number);
    console.log(`RESULT IS: ${result}`);
} 

asyncPrintoBoi(27)


//          ------ CODE BREAKDOWN ------

// Promise now accepts two params - resolve, reject
// Now we check if the number is even. if it is, JS will "resolve" the argument we feed it
// if the number is ODD, it will "reject" the arg we give it and log our response
// very similar to a 'try / catch' coupling in java except we don't have to define the exception we want to throw
// try / catch example below ...


//          -------- TRY / CATCH -------
//      ------------------------------------------------------------------
//     | const asyncPrinti = async (number) => {                          |
//     |    try {                                                         |
//     |         const result = await doubleNumberAfter2Seconds(number);  |
//     |         console.log(`result is: ${result}`);                     |
//     |         } catch (error) {                                        |
//     |             console.error(error)                                 |
//     |         }                                                        |
//     |     }                                                            |
//      ------------------------------------------------------------------

