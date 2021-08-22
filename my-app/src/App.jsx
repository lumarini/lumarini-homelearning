import React from "react";
import "./components/App.css"
import Header from "./components/header.jsx"
import GreetingAndDate from "./components/greeting.jsx"
import Footer from "./components/footer.jsx"
import Note from "./components/note";



function App() {
    return (
            <div>
            <GreetingAndDate />
            <Header />
            <Footer/>
            <Note 
                title="Note Title"
                content="Content of the first note"
            />
            <Note 
                title="Second Note Title"
                content="Content of the second note"
            />
            <Note 
                title="Yet another note"
                content="So many things to take note of"
            />
            </div>);
    
}

export default App;

