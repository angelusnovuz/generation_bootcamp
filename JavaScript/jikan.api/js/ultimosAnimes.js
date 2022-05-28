const urlUltimos = "https://api.jikan.moe/v4/seasons/now";
const ultimosAnime = document.getElementById("ultimosAnimes");

fetch(urlUltimos).
    then(resp => resp.json()).
    then(datos =>{
        // console.log(datos.data);

        //Agregamos slice para determinar que solo queremos 16 elementos
        const arregloAnimesUltimos = datos.data.slice(0,16)
        console.log(arregloAnimesUltimos);

        arregloAnimesUltimos.forEach(anime => {
            // console.log(anime);

            // Datos obtenidos de la API
            const datosNecesarios = {
                nombre: anime.title,
                imagen: anime.images.jpg.image_url,
                id: anime.mal_id,
                sinopsis: anime.synopsis
            }


            // Formato de las cards
            const template = `
                <div class="col mb-4">
                    <a href="informacion.html?id=${datosNecesarios.id}">
                        <div class="card">
                            <img class="img-fluid" src="${datosNecesarios.imagen}" class="card-img-top" alt="...">
                            <div class="card-body">
                                <h5 class="card-title">${datosNecesarios.nombre}</h5>
                            </div>
                        </div>
                    </a>
                </div>
            `

            ultimosAnime.innerHTML += template;
            // console.log(datosNecesarios);
        });
    })