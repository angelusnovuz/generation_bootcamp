const url = "https://jsonplaceholder.typicode.com/albums/1/photos";
const cards = document.getElementById('cards');

fetch(url).
    then(resp => resp.json()).
    then(datos => {
        
        datos.forEach((dato) => {
            const img = dato.url
            const texto = dato.title
            const template = `
            <div class="card">
                <img src="${img}" class="card-img-top mx-auto" alt="">
                <div class="card-body">
                <p class="card-text">${texto}</p>
                </div>
            </div>
            `
            cards.innerHTML += template
        });
    })
