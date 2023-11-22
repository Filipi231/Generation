import React from 'react';
import remedio from '../../assets/remedio.webp'



function Home() {
    return (
        <>
        <div className="rounded-full ">
          <div className='container grid grid-cols-2 text-white'>
            <div className="flex flex-col gap-4 items-center justify-center py-4">
              <h2 className='text-5xl font-bold text-black  flex justify-items-center'>Bem Vindo!</h2>
            
  
              <div className="flex justify-around gap-4">
              
              <button className='shadow shadow-red-500/40 md:shadow-red-500/40 text-black rounded-full'>Ver produtos</button>
            </div>
            </div>
  
            <div className="flex justify-items-center padding: 10px">
              <img src={remedio} alt="" className=' ' />
      
            </div>
          </div>
        </div>
        
      </>
    );
}

export default Home;