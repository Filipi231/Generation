import Card from "./components/card/Card"
import Contador from "./components/contador/Contador"
import Tarefa from "./components/tarefa/tarefa"
import Home from "./pages/home/Home"
import './App.css';
import React from 'react';

function App() {
 

  return (
    <div>
<h1 className="text-3xl font-bold text-red-500 underline text-center">
      Hello world!,</h1>
   <Home/>
   <Card titulo='Blog' descricao='Curtidas' />
   <Contador />
   <Tarefa/>
   
   </div>
  )
}

export default App

