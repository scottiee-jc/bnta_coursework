const Recipe = ({recipe}) => {

    const {cakeName, ingredients, rating} = recipe

    return (
        <>
            <h3>Cake Name: {cakeName}</h3>
            <p>Ingredients: {ingredients}</p>
            <p>Rating: {rating}</p>
            <hr/>
        </>
    )
}

export default Recipe;