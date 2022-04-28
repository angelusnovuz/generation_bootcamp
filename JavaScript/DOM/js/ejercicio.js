const card = document.querySelector(".card");
const form = document.querySelector("form");


form.addEventListener('submit', (e) =>{
    e.preventDefault();

    const datos = Object.fromEntries(
        new FormData(e.target)
    )

    crearElemento(datos.url, datos.texto);
    form.reset();
})



function crearElemento(url, texto){
    const img = document.createElement('img'); // imagen
    const txt = document.createElement('figcaption'); // Description
    
    img.src = url;
    img.alt = texto;

    txt.textContent = texto;


    // apendChild :
    card.appendChild(img);
    card.appendChild(txt);
}

crearElemento();