import { useEffect, useState } from "react"

function Tarefa(){
    const [isCompletado, setIsCompletado] = useState(false)
    const [Tarefa, setTarefa] = useState('')

    useEffect(() => {
        if(isCompletado){
            setTarefa('Parabens! Voce concluiu a tareda')
        }
    }

    ), [isCompletado]

    return(
        <div>
            <h1>Tarefa</h1>
            <h3>{Tarefa}</h3>
            <p>Conclua a tarefa</p>
            <button onClick={() => setIsCompletado(true)}> Concluir a tarefa </button>

        </div>
    )
}

export default Tarefa