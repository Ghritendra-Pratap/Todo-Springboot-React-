import logo from './logo.svg';
import './App.css';
import Home from "../src/components/Home/Home"
import Addtask from './components/addtask/Addtask';
import {BrowserRouter as Router , Routes , Route,Redirect} from "react-router-dom"
import Tasklist from './components/Home/Tasklist';
function App() {
  return (
    <div className="App">
      <header className="App-header">
      <Router>
        <Routes>
          <Route path="/add" element={<Addtask/>} />
          <Route exact path="/" element={<Home />} />
          <Route path="/task" element={<Tasklist/>}/>
        </Routes>
          
        </Router>
      </header>
    </div>
  );
}

export default App;
