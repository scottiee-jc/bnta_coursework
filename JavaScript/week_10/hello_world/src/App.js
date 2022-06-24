// import logo from './logo.svg';
import './App.css';
import Hello from './components/Hello';
import Goodbye from './components/Goodbye';

const App = () => {

  const components = [];

  for (let counter = 0; counter < 10; counter++) {
    components.push(<Hello />);
  }

  // allows us to repeat a given body of text (hello) on the page

  return (
    <>
    {components}
    </>
  )
}

export default App;
