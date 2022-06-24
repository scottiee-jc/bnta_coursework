import Recipe from "./Recipe";

const RecipeList = ({listOfRecipes}) => {

    const recipeComponents = listOfRecipes.map((recipe, index) => {
        return <Recipe recipe={recipe} key={index}/>
    });

    return(
        <>
            {recipeComponents}
        </>
    )
}

export default RecipeList;