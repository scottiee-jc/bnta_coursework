import { useState } from "react";


const NewRecipe = ({addNewRecipe}) => {

const [cakeName, setCakeName] = useState("");
const [ingredients, setIngredients] = useState("");
const [rating, setRating] = useState(0);

// defining what happens when the form gets submitted
// when button is click handleFormSubmit is called

const handleFormSubmit = (event) => {
   
    event.preventDefault();

    const newRecipe = {
        cakeName: cakeName,
        ingredients: ingredients,
        rating: rating
    }

    // generates newMember from whatever the user has inputted

    addNewRecipe(newRecipe);
}


    return (
        <>
        <form onSubmit={handleFormSubmit}>
            <label htmlFor="cakeName">Cake Name:</label>
            <input 
                type="text" 
                id="cakeName" 
                value={cakeName}
                onChange={(event) => setCakeName(event.target.value)}
            />
            <label htmlFor="ingredients">Ingredients:</label>
            <input 
                type="text" 
                id="ingredients" 
                value={ingredients}
                onChange={(event) => setIngredients(event.target.value)}
            />
            <label htmlFor="rating">Rating:</label>
            <input 
                type="number" 
                id="rating" 
                value={rating}
                onChange={(event) => setRating(event.target.value)}
            />
            <input 
            type="submit" 
            value="Add new recipe"
            />
        </form>
        </>
    )
}

export default NewRecipe;