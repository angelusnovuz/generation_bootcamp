const url = "https://dog.ceo/api/breeds/list/all";
const lista = document.querySelector('ul');

fetch(url).
    then(resp => resp.json()).
    then(datos => {
        console.log(datos.message.terrier);

        const arregloTiposTerrier = datos.message.terrier
        arregloTiposTerrier.forEach((tipoTerrier) => {
            console.log(tipoTerrier);

            const template = `
            <li class="list-group-item text-center mb-5 bg-warning shadow rounded">${tipoTerrier}</li>
            `
            lista.innerHTML += template
        });
    })
