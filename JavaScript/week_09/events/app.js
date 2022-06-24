const button = document.querySelector("#btn");
const box = document.querySelector("#box");

// functions help us create re-usable code
// need a function that will be fired when someone clicks a button
const handleButtonClick = () => {
    box.style.backgroundColor = "blue";
}

// adding event listener will let a DOM respond to an element
// needs:
// string to specify what we are listening for
// something to 'do' when this event is triggered
// addEventListener is a higher order function so will accept a function within a functio
// in this case, its calling the handleButtonClick function

button.addEventListener("click", handleButtonClick);

const input = document.querySelector("#user-input");
const message = document.querySelector("#user-mesage");

// need to add eventListener to display user message

input.addEventListener("input", (event) => {
    console.log(event.target.value);
})


// adding from form
// identifies the list and the form (below)
// forms have their own event that fires - a submit event
// submitted events can only can from forms
// we need to have it submitted using input type 'submit' in index.html
// event.preventDefault 

const list = document.querySelector("ul");
const form = document.querySelector("#new-student-form");

form.addEventListener("submit", (event) => {
    event.preventDefault();
    const newListItem = document.createElement("li");
    newListItem.innerText = event.target("new-student").value;
    list.appendChild(newListItem);
})