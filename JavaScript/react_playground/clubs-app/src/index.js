import { keyboardImplementationWrapper } from "@testing-library/user-event/dist/keyboard";
import React, { useState, useContext } from "react";
import ReactDOM from "react-dom";
import "./styles.css";

const UserContext = React.createContext()

const ClubSelector = () => {

  const club = () => {
  [
   {
    name: 'liverpool',
    manager: 'jurgen klopp',
    bestPlayer: 'mo salah',
    owner: 'FSG'
  },
  {
    name: 'manCity',
    manager: 'pep guardiola',
    bestPlayer: 'kevin de bruyne',
    owner: 'saudi arabia'
  },
  {
    name: 'manUtd',
    manager: 'erik ten haag',
    bestPlayer: 'cristiano ronaldo',
    owner: 'glazers'
  },
  {
    name: 'chelsea',
    manager: 'thomas tuchel',
    bestPlayer: 'eduaord mendy',
    owner: 'todd boehly'
  }
]
}

  return (
    <div>
      <h2>Club = {club.name.at(2)}</h2>
      <button onClick={() => setUser(null)}>Logout</button>             
    </div>
  )
}

const Login = () => {

  const { user, setUser} = useContext(UserContext)

  const [loginName, setLoginName] = useState('')
  const [password, setPassword] = useState('')
 

  return (
    <div>
      <h2>Login</h2>
      <input 
        value={loginName}                                   
        onChange={e => setLoginName(e.target.value)}              
        placeholder="UserName"
      />
      <input 
        value={password}                              
        onChange={e => setPassword(e.target.value)}           
        placeholder="Password"
      />
      <button onClick={() => setUser([loginName, password])}>Login</button> 
    </div>
  )
}

function App() {

  const [user, setUser] = useState()

  return (
    <UserContext.Provider value={{ user, setUser }}>  
      <div className="App">                                           
        {user ? <UserDetails /> : <Login />}
      </div>
    </UserContext.Provider>
  );
}

const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);