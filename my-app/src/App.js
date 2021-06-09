// import logo from './logo.svg';
import React from "react";
import ReactDOM from "react-dom";

import './App.css';
import './styles.css';
import ImageComponent from "./ImageComponent";
import ImageComponent2 from "./ImageComponent2";
import ImageComponent3 from "./ImageComponent3";
import ImageComponent4 from "./ImageComponent4";






function App() {
  


  return (
    <div className="App">
      
      <header className="App-background">
        <header className="App-header">
          Hello World
        
            <h2 className = "App-subheader">
              Wow! Check out all the cool CSS and Javascript things I can do!
            </h2>
          </header>
        


      <div class="photo">
          
        <div class="popup" onclick="myFunction()">

          
              <img src="/work.jpg" class = "work" alt="work" onclick="openWork"/>

            </div>
          
            <div class="square one"></div>
              <div class="popup" onclick="myFunction()">
                <a href="/view.jpg"><img src="/view.jpg" class = "view" alt="view"/></a>
              </div>
        </div>

        <div class = "wrapper">
          <div class="photo">
            <div class="popup" onclick="myFunction()">
              <a href="/grad.jpg"><img src="/grad.jpg"class = "grad" alt="grad"/></a>
            </div>

            <div class="popup" onclick="myFunction()">
              <a href="/tri.jpg"><img src="/tri.jpg"class = "tri" alt="tri"/></a>
            </div>
          </div>
          <header className = "App-header">Sorry ran out out of time to finish the overlay but below is what i have so far</header>
          <ImageComponent/>
          <ImageComponent2/>
          <ImageComponent3/>
          <ImageComponent4/>
        </div>   
      </header>
    </div>
  );
}

export default App;
