import React from 'react';
import remedio from '../../assets/remedio.webp'

function Categoria() {
    return (
        <div className="rounded-full ">
          
          <h1 className='flex justify-center '>Categorias</h1>
              <img src={remedio} alt="" className='flex justify-center' />
      
        </div>
        
      
    );
}

export default Categoria;