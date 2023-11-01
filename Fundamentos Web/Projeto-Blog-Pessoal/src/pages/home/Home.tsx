import './Home.css'
import homeLogo from '../../assets/login-img.jpg'
import React, { useState } from 'react';

function Home() {
  const [loggedIn, setLoggedIn] = useState(false);
  return (
    <div>
            <h1 className='titulo'>Home</h1>

            <img src={homeLogo} className='img' alt="Imagem da Tela Inicial" />

            {loggedIn ? (
        <h1>Bem-vindo de volta!</h1>
      ) : (
        <button onClick={() => setLoggedIn(true)}>Entrar</button>
      )}


    </div>


  )
}

export default Home 
