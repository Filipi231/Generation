import Tema from './Tema';
import Usuario from './Usuario';

export default interface postagens {
  id: number;
  titulo: string;
  texto: string;
  data: string;
  tema: Tema | null;
  usuario: Usuario | null;
}