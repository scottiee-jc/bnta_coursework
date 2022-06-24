import RecipeList from "../components/RecipeList";
import NewRecipe from "../components/NewRecipe";
import { useState } from "react";

const RecipeContainer = () => {


    const [cakes, setCakes] = useState ([
        {
            cakeName: "Lemon Drizzle",
            ingredients: ["eggs", "butter", "lemon  zest", "sugar", "self-raising flour"],
            rating: 5
        },
        {
            cakeName: "Tea Loaf",
            ingredients: ["eggs", "oil", "dried fruit", "sugar", "self-raising flour", "strong tea"],
            rating: 3
        },
        {
            cakeName: "Brownie",
            ingredients: ["chocolate", "eggs", "flour", "butter", "walnuts"],
            rating: 4
        },
        {
            cakeName: "Carrot Cake",
            ingredients: ["carrots", "walnuts", "oil", "cream cheese", "flour", "sugar"],
            rating: 5
        },
        {
            cakeName: "Medium Rare Chicken Tart",
            ingredients: ["medium rare chicken", "flour", "eggs", "sugar", "lemon zest"],
            rating: 1
        }
    ]);

    const addNewCake = (newRecipe) => {
        setCakes([...cakes, newRecipe]);
        console.log("added new recipe for a cake");
    }

    return (
        <>
            <NewRecipe addNewRecipe={addNewCake}/>
            <RecipeList listOfCakes={cakes}/>
        </>
    )
}

export default RecipeContainer;