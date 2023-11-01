import { useState } from "react"

function Contador(){
    const [valor, setValor] = useState(0);

    function SomarMaisUm(){
        setValor(valor + 1)
    }

    return(
        <div>
            <p>O valor é: {valor}</p>
            <button onClick={SomarMaisUm}> Adicionar + 1</button>

        </div>
    )
}

export default Contador