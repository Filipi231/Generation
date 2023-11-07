
import axios from "axios"


const api = axios.create({
    baseURL: 'https://blogpesoal.onrender.com'
})

export const login = async(url: string, Dados: Object, setDados: Function) => {
    const resposta = await api.post(url, Dados)
    setDados(resposta.data)
}

export const cadastrarUsuario = async(url: string, dados: Object, setDados: Function) => {
    const resposta = await api.post(url, dados)
    setDados(resposta.data)
  }