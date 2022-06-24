   
   // create promise object and pass another function to it 
   // resolve - saves an arrow function as an argument
   // inception of functions...
   // arrow function accepts another function setTimeout

   const myPromise = new Promise((resolve) => {
    setTimeout(() => {
     resolve("X"); // Run the code, then replace the string with null
    }, 5000);
   });
  

   
   myPromise
    .then(value => { 
        return value.toUpperCase(); 
    })
    .then(value => { 
        return `Hello, ${value}!`; 
    })
    .then(value => { 
        console.log("3rd then");
        console.log(value);
    })
    .catch(err => { 
        console.log("We have an issue!: " + err); 
    });


    // Promise.resolve('Hello!')
async function greet() {
    return 'Hello';
  }

  function resolveAfter2Seconds() {
    return new Promise(resolve => {
     setTimeout(() => {
      resolve('resolved');
     }, 2000);
    });
   }
   async function asyncCall() {
    console.log('calling');
    const result = await resolveAfter2Seconds();
    console.log(result);
   }
   asyncCall();


const fetchPromise = fetch("https://catfact.ninja/breeds");
fetchPromise.then(response => {
 return response.json();
}).then(breed => {
 console.log(breed);
});