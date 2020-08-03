function Cumprimentar(){
    alert('Olá!');
}

function AlterarFundo() {
    document.body.style.backgroundColor = "green"
}

function VerImagem(){
    alert("Estou vendo a imagem!");
}

function ClickImagem(){
    let imagem = document.getElementById("BurjKhalifa");
    imagem.addEventListener("click", () => {alert("Estou clicando na imagem!");}, false);
}

/*
function MudarCorBody(){
    document.getElementById("IdBody").addEventListener("click", MudarCorBody);
    this.style.backgroundColor = "magenta";
    return false;
}
*/

function MudarCorBody() {
    document.getElementById("IdBody").style.backgroundColor = "magenta";
    return false;
}