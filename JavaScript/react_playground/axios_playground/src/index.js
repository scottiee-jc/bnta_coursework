import React, { useState, useContext } from "react";
import ReactDOM from "react-dom";
import "./styles.css";

// application contains three components: App, UserDetails, Login
// App is the parent, UserDetails and Login are the children

const UserContext = React.createContext()
// creating an object of type UserContext and setting it to React.createContext() hook
// createContext / useContext provides a way to pass data through the component tree (child -> child)
// eliminates having to pass props down manually at every level

const UserDetails = () => {

  const { user, setUser } = useContext(UserContext)
  // creating an object containing user and setUser:
  // user contains the data assigned to a specific user
  // setUser is the function that will make the data do something
  // useContext set to UserContext variable defined outside the scope of the UserDetails component

  return (
    <div>
      <h2>Welcome back, {user}</h2>
      <h4>Account Details</h4>                                               {/* user data inserted into this paragraph*/}
      <p>User Name: {user}</p>
      <button onClick={() => setUser(null)}>Logout</button>             {/* onClick uses an argument that assigns setUser to null when logout is pressed */}
    </div>
  )
}

const Login = () => {

  const { user, setUser} = useContext(UserContext)

  // also used in, and linked to, the component UserDetails

  const [loginName, setLoginName] = useState('')
  const [password, setPassword] = useState('')
  // useState sets the state of the object we have defined to that of an empty string
  // this is the starting point so that the data can be inserted as a string into the object

  return (
    <div>
      <h2>Login</h2>
      <input 
        value={loginName}                                              // value of the input set to the loginName variable
        onChange={e => setLoginName(e.target.value)}                   // onChange specifies that whatever is input should be stored in the function setLoginName
        placeholder="UserName"
      />
      <input 
        value={password}                                              // value of the input set to the loginName variable
        onChange={e => setPassword(e.target.value)}                   // onChange specifies that whatever is input should be stored in the function setLoginName
        placeholder="Password"
      />
      <button onClick={() => setUser([loginName, password])}>Login</button>        {/* onClick uses an argument that passes the loginName data to the setUser function -  when the button is clicked, the data is transferred and "set"*/}
    </div>
  )
}

function App() {

  const [user, setUser] = useState()
  // user and setUser set to an empty object using useState

  return (
    <UserContext.Provider value={{ user, setUser }}>                   {/* UserContext.Provider uses the createContext hook wraps the application body in this */}
      <div className="App">                                            {/* also sets the value of the UserContext function to user and setUser so that the app */}
        {user ? <UserDetails /> : <Login />}
      </div>
    </UserContext.Provider>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);