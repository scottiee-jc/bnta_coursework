import React from "react";

const Hello = () => {

    const name = "Jeff"

    return(
        <div className="blue">
        <h1>Hello from the component</h1>
        <p>Isn't React cool?</p>
        <p>My namma {name}</p>
        </div>
    );
}

export default Hello;