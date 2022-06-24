import './App.css';
import { useEffect, useState } from 'react';
import { Accordion } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import React from "react";

function App() {
  return(
    <MyMovieList />
  )
}

const MyMovieList = () => {
  
  const [movies, setMovies] = useState([]);

  useEffect(
    () => {
      fetch(`https://swapi.dev/api/films/`)
      .then(response => response.json())
      .then(result => setMovies(result.results))
    }, []
  )

  return(
    <>
      <h1>Star Wars Movies</h1>
      <Accordion>
        {movies.map((movie) => (
          <Accordion.Item eventKey="0">
            <Accordion.Header>{movie.title}</Accordion.Header>
            <Accordion.Body>
              {movie.opening_crawl}
            </Accordion.Body>
          </Accordion.Item>
        ))}
      </Accordion>
    </>
  );
}

export default App;



// function App() {
//   return(
//     <GetMovies/>
//   )
// }

// //functional component
// const GetMovies = () => {
//   // useState allows us to call the fetch methods
//   // useEffect wants to set the data
//   const [data, setData] = useState([]);
//   useEffect(
//     () => {
//       // without array [] this becomes an infinite loop
//       // useEffect -> inside body of js function -> want to call an endpoint, parse response to json and get json response
//       // calling setData function to update data
//       fetch("https://swapi.dev/api/films/")
//       .then(response => response.json())
//       .then(json => setData(json.results))
//     }, []
//   );

//   return (
//     <>
//     <h2>Featured Movies:</h2>
//     {
//       data.map((movie) => (
//         <li key={movie.id}>
//           {`Title: ${movie.title}, Director: ${movie.director}, Release: ${movie.release_date}`}
//         </li>
//         // this code declares a variable and then not returning it
//         // add a return statement by using parantheses () instead of brackets {} to call a return
//       ))
//     }
//     {/* we want to call the title from a data object */}
//     {/* data will return false if setData is set to null */}
//     {/* requires both to be true to display anything but needs first to be true to check the second */}
//     {/* <p>Name: {data && data.title}</p> */}
//     </>
//   );
// }



//          ===== CART ITEMS =====



//   const [quantity, setQuantity] = useState(0);

//   return (
//     <>
//     <CartItem
//       name={"Apples"}
//       quantity={quantity}
//       remove={()=>{
//         if(quantity > 0) {
//           setQuantity(quantity - 1)
//         }
//       }}
//       add={() => setQuantity(quantity + 1)}
//       double={() => {
//         if (quantity > 0) {
//           setQuantity(quantity * 2);
//         }
//       }}
//     />
//     <CartItem
//      name={"Medium Rare Chicken"}
//     quantity={quantity}
//     remove={()=>{
//       if (quantity > 0) {
//         setQuantity(quantity - 1)
//       }
//     }}
//     add={() => setQuantity(quantity + 1)}
//     double={() => {
//       if (quantity > 0) {
//         setQuantity(quantity * 2);
//       }
//     }}
//     />

//     </>
//   );
// }

// const CartItem = ({name, quantity, remove, add, double}) => {

//   return (
//     <>
//     <span>{`${name}`}</span>
//     <button onClick={remove}>-</button>
//     <input value={quantity} readOnly/>
//     <button onClick={add}>+</button>
//     <button onClick={double}>*</button>
//     </>
//   );
// }