
var nome = window.document.getElementById('nome');
var nomeok = false;
var email = window.document.getElementById('email')
var mensagem = window.document.getElementById('mensagem')

function validarNome(){
    let txtNome = document.querySelector("#TXTNome");
    if(nome.value.length < 3){
        txtNome.innerHTML = "Nome inválido!";
        txtNome.style.color = 'red';
        nomeok = false;
    }else{
        txtNome.innerHTML = "Nome Valido";
        txtNome.style.color = 'green';
        nomeok = true;
    }
};

function validarEmail2(){
    let txtEmail = document.querySelector("#txtEmail");
    if(email.value.indexOf ('@') == -1){
        txtEmail.innerHTML = "Email inválido!";
        txtEmail.style.color = 'red';
        
    }else{
        txtEmail.innerHTML = "Email Valido";
        txtEmail.style.color = 'green';
       
    }
};


function validarMensagem (){
    let txtMensagem = document.querySelector('#txtMensagem')

    if(mensagem.value.length >= 100){
        txtMensagem.innerHTML = 'Texto é muito grande, digite no maximo 100 caracteres'
        txtMensagem.style.color = 'red'
        txtMensagem.style.display = 'block'
    } else{
        txtMensagem.innerHTML = "Texto Valido";
        txtMensagem.style.color = 'green';
    }
}




function enviarForm(){
    if(nomeok == true){
        alert('formulario enviado com sucesso!'+ nome.value);
    }
    else{
        alert('Preencha o formulario corretamente antes de enviar...')
    }
}


