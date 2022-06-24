// linked to index.html through <script>

const list = document.querySelector("ul");

const newListItem = document.createElement("li");

newListItem.innerText = "I've been added by the JS file!";

list.appendChild(newListItem);

// appending child to li, adding the text to the list items
// demonstrating how to connect html and js