// console.log("hi!")

function getCountryByName(countryName) {
    fetch("https://restcountries.com/v3.1/name/" + countryName)
    .then(response => {
        return response.json();
       }).then(name => {
           let nameOfCountry = name[0].capital;
           const section = document.getElementById("country");
           section.innerHTML = nameOfCountry;
           const list = document.getElementById("currency")
           list.innerHTML
       });
    }

getCountryByName("peru");

// const countryList = document.querySelector("ul");

// const newCountry = document.createElement("li");

// newCountry.innerText = getCountryByName("peru");

// countryList.appendChild(newCountry);