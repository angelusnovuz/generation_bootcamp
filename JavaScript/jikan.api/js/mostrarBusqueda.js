// URL en la que nos encontramos
const busquedaInf = window.location.href.split("=").pop();
const busquedaAnimes = document.getElementById('busquedaAnimes');
console.log(busquedaInf);

const urlBusqueda = `https://api.jikan.moe/v4/anime?q=${busquedaInf}&order_by=popularity`;
console.log(urlBusqueda);

fetch(urlBusqueda).
    then(resp => resp.json()).
    then(datos =>{
        // console.log(datos);

        
        const resultadosBusqueda = datos.data
        // console.log(resultadosBusqueda);

        resultadosBusqueda.forEach(resultado => {

            // Datos obtenidos de la API
            const datosNecesarios = {
                nombre: resultado.title,
                imagen: resultado.images.jpg.image_url,
            }


            // Formato de las cards
            const template = `
                <div class="col mb-4">
                    <div class="card">
                        <img class="img-fluid" src="${datosNecesarios.imagen}" class="card-img-top" alt="...">
                        <div class="card-body">
                            <h5 class="card-title">${datosNecesarios.nombre}</h5>
                        </div>
                    </div>
                </div>
            `

            busquedaAnimes.innerHTML += template;
            // console.log(datosNecesarios);
        })
    });
