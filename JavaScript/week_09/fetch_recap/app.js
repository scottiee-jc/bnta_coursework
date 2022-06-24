const qContainer = document.querySelector("#question");
const questionButton = document.querySelector("#question-button");
const form = document.querySelector("#player-guess");
const resultContainer = document.querySelector("#result-container");
const scoreContainer = document.querySelector("#score-container");

let currentQuestion;

// LOADING THE QUESTION

const loadQuestion = () => {
    fetch("https://opentdb.com/api.php?amount=1&type=boolean")
    .then(response => response.json())
    .then(data => {
        resultContainer.innerHTML = "";
        //set innerHTML to empty string to replace whatever html was originally inside it - no matter how many p's
        qContainer.innerText = data.results[0].question;
        currentQuestion = data.results[0];
        hasGuessed = false;
    })
}

// HANDLING THE PLAYER GUESS -> RETURN A RESPONSE BASED ON TRUE OR FALSE

const handlePlayerGuess = (event) => {
    event.preventDefault();

    if (!hasGuessed) {

        const resultText = document.createElement("p");
    
    
        if (event.target.guess.value === currentQuestion.correct_answer) {
            resultText.innerText = "Congrats Brev";
            // need a variable to keep track of what the score is
            let currentScore = scoreContainer.innerText;
            // add one to the new score value
            currentScore ++;
            // reassign the var to score container
            scoreContainer.innerText = currentScore;
        } else {
            resultText.innerText = "It's not looking good brev";
    
        }

        resultContainer.appendChild(resultText);

        hasGuessed = true;

    }   
}


questionButton.addEventListener("click", loadQuestion);
form.addEventListener("submit", handlePlayerGuess);